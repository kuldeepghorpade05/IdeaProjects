package Searching.Binary_Search.Binary_Search_Questions;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1642126133/

public class Q6_Peak_index_in_mountain_Array {

    /**  Q6 : Peak Index in Mountain Array using linearSearch **/
    public static int lspm(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    /**  Q6 : Peak Index in Mountain Array using BinarySearch **/
    public static int peakMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //you are in dec part of array
                //this may be the ans, but look at left
                //this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1;  // because we know that mid + 1 element > mid element
            }
        }
        //in the end, start  == end and pointing to the largest number bcos of above 2 checks
        return end;
    }

    // 1st method (easy) but may give arrayOutOfboundException
    static int bs_peak_in_mountain_array(int[] arr){

        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] < arr[mid + 1]){
                low = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {


            /**  Q6 : Peak Index in Mountain Array using linearSearch **/
            int[] arr = { 12, 13, 15,  20, 14, 11, 8};
//        System.out.println(lspm(arr));

            /**  Q6 : Peak Index in Mountain Array using BinarySearch **/
        System.out.println(peakMountainArray(arr));



        }
}
