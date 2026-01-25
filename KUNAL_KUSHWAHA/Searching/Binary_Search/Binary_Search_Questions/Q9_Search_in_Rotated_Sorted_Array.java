package Searching.Binary_Search.Binary_Search_Questions;
//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class  Q9_Search_in_Rotated_Sorted_Array {

    //simple method find rotation index (start of rotated array) peform binary search on right and left array
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;

        System.out.println(finalresult(arr,target));

    }

    static int finalresult(int[] arr, int target){

        int index = findrotationindex(arr);

        int right = bs(arr, target, 0, index - 1 );

        if(right != -1){
            return right;
        }

        return bs(arr, target, index, arr.length-1);
    }


    static int bs(int[] arr, int target, int low, int high){

        while(low <= high){
            int mid = (low + high)/2;

            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    static int findrotationindex(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int mid = (low + high)/2;

            if(arr[mid] > arr[high]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        return low;
    }


}







           //complex method

//public class Q9_Search_in_Rotated_Sorted_Array {
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//        while (start <= end) {
//            int mid = (start + end) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//
//        }
//        return -1;
//    }
//
//
//    static int findpivot(int[] arr){
//        int start = 0;
//        int end = arr.length-1;
//
//        while(start <= end){
//            int mid = (start + end)/2;
//            //case 1
//            if( mid < end && arr[mid] > arr[mid + 1]){
//                return mid;
//            }
//            // case 2
//            if(mid > start && arr[mid] < arr[mid - 1]){
//                return mid-1;
//            }
//            // case 3
//            if(arr[mid] <= arr[start]){
//                end = mid - 1;
//            }else {
//                // case 4
//                start = mid + 1;
//
//            }
//        }
//        return -1;
//    }
//
//    static int searchAD(int[] arr, int target){
//        int pivot = findpivot(arr);
//
//        //simple binary search
//        if(pivot == -1){
//            return binarySearch(arr,target,0,arr.length-1);
//        }
//
//        if(arr[pivot] == target){
//            return pivot;
//        }
//
//        if(target >= arr[0]){
//            return binarySearch(arr,target,0,pivot-1);
//        }else {
//            return binarySearch(arr,target,pivot+1,arr.length-1);
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//
//        int[] arr = {8,9,10,12,2,4,5,7};
//
//        System.out.println(searchAD(arr,4));
//
//
//    }
//}
