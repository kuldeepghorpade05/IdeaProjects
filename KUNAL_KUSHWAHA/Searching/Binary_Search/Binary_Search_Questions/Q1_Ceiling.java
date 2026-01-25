package Searching.Binary_Search.Binary_Search_Questions;

public class Q1_Ceiling {

    /** q1 Ceiling of a number **/

    /** This Java program implements binary search to find the "ceiling of a number" in a sorted array. Given an array and a target number, it returns the index of the smallest number in the array that is greater than or equal to the target. If the target exceeds the maximum value in the array, it returns -1 **/

    static int binarysearch(int[] arr, int target){

        // TEST CASE
        if(target > arr[arr.length-1]){
            return -1;
        }

        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low;
    }


    // brute force for ceiling question
    /*static int findc(int[] arr, int target) {
        int index = binarysearch(arr, target);
        if (index != -1) {
            return index; // target found
        }

        // if not found, find the index of the next greater element (ceiling)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                return i;
            }
        }

        // if target is greater than all elements
        return -1;
    }*/

    public static void main(String[] args) {

        /** q1 Ceiling of a number **/
        int arr[] = {12, 16, 23, 45, 55, 61, 78, 87};
        System.out.println(binarysearch(arr,62));


    }
}
