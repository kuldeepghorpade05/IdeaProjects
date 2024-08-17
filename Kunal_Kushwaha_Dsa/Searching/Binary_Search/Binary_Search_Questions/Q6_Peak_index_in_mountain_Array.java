package Searching.Binary_Search.Binary_Search_Questions;

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
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {


            /**  Q6 : Peak Index in Mountain Array using linearSearch **/
            int[] arr = { 12, 13, 15,  20, 14, 11, 8};
//        System.out.println(lspm(arr));

            /**  Q6 : Peak Index in Mountain Array using BinarySearch **/
//        System.out.println(peakMountainArray(arr));



        }
}
