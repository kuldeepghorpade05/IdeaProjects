package Searching.Binary_Search.Binary_Search_Questions;

public class Q2_Floor {

    /** Q2 floor of a number **/

    /** This Java method, `floor`, finds the largest number in a sorted array that is less than or equal to a given target number, known as the "floor" of that number. If the target exceeds the maximum value in the array, it returns -1. It utilizes binary search for efficiency. **/
    public static int floor(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }


    public static void main(String[] args) {

        /** Q2 floor of a number **/
        int arr[] = {12, 16, 23, 45, 55, 61, 78, 87};
        System.out.println(floor(arr,54));


    }
}
