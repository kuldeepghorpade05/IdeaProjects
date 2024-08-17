package Searching.Binary_Search.Binary_Search_Questions;

public class Q8_Find_In_Mountain_Array {

    /** method 01 ----------------------------------------------------- **/
    public static int peakMountainArray1(int[] arr) {
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


    public static int bsasc(int[] arr, int target, int low, int high) {
//        int low = 0;
//        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int bsdesc(int[] arr, int target, int low, int high) {
//        int low = 0;
//        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    static int ans(int arr[], int target){
        int low = 0;
        int high = arr.length-1;

        int peak =  peakMountainArray1(arr);

        if(arr[peak] > low){
            return bsasc(arr,target,low,peak);
        }else {
            return bsdesc(arr,target,peak,high);
        }

    }

    /** method 02 ----------------------------------------------------- **/

    // order agnostic binary search for asc and desc sorted array
    static int orderAgnosticBS(int[] arr, int target, int low, int high) {
//        int low = 0;
//        int high = arr.length - 1;

        //finding array asec or desc
        boolean isAsc = arr[low] < arr[high];

          /*boolean isAsc;
            if(arr[low] < arr[high]){
                isAsc = true;
            }else {
                isAsc = false;
            }*/

        while (low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc == true){
                if (target > arr[mid]) {
                    low = mid + 1;
                } else  {
                    high = mid - 1;
                }
            }else {
                if (target < arr[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;

    }

    static int search(int[] arr, int target){
       int peak = peakMountainArray1(arr);

       int ascSearch = orderAgnosticBS(arr, target,0,peak);
       if(ascSearch != -1){
           return ascSearch;
       }

       //try in desc part of array
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);

    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,1};
        /** method 01 call **/
        // System.out.println(ans(arr,2));

        /** method 02 call **/
       // System.out.println(search(arr,1));

    }
}
