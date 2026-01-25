package Searching.Binary_Search.Binary_Search_Questions;

/** Q5 : Position of an Element in Infinite Sorted Array **/

public class Q5_find_Element_in_Infinite_Sorted_Array {



    static int findPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand window until arr[end] >= target or out-of-bounds
        while (true) {
            try {
                if (arr[end] >= target) break;
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }

        // Binary Search in range [start, end] without crashing
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end)/2;

            try {
                if (arr[mid] == target) return mid;
                else if (target > arr[mid]) start = mid + 1;
                else end = mid - 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                end = mid - 1; // mid is out of bounds, shrink search range
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        int arr[] = {12, 16, 23, 45, 55, 61, 78, 87, 96, 102, 201, 368};

        System.out.println(findPosition(arr,368));

    }




}
