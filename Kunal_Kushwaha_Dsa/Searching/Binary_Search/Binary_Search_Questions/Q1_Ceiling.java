package Searching.Binary_Search.Binary_Search_Questions;

public class Q1_Ceiling {

    /** q1 Ceiling of a number **/

    /** This Java program implements binary search to find the "ceiling of a number" in a sorted array. Given an array and a target number, it returns the index of the smallest number in the array that is greater than or equal to the target. If the target exceeds the maximum value in the array, it returns -1 **/
    public static int ceiling(int[] arr, int ceiling) {
        int low = 0;
        int high = arr.length - 1;

        if (ceiling > arr[arr.length - 1]) {
            return -1;
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == ceiling) {
                return mid;
            } else if (ceiling > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

//        static void findc(int[] arr, int ceiling){
//
//        if (ceiling > arr[arr.length - 1]) {
//            System.out.println(-1);
//            return -1;
//        }
//
//        int bs = q1(arr,ceiling);
//        if(bs == -1){
//            for (int i=0; i<arr.length; i++){
//                if(arr[i] > ceiling){
//                    int res = i;
//                    System.out.println(res);
//                    break;
//                }
//            }
//        }
//        else {
//            System.out.println(q1(arr,ceiling));
//        }
//    }


    public static void main(String[] args) {

        /** q1 Ceiling of a number **/
        int arr[] = {12, 16, 23, 45, 55, 61, 78, 87};
        System.out.println(ceiling(arr,46));


    }
}
