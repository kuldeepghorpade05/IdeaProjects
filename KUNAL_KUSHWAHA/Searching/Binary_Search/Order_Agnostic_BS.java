package Searching.Binary_Search;

public class Order_Agnostic_BS {

    /** finding Array ASC or DESC and implementing Binary search **/

    // order agnostic binary search for asc and desc sorted array
    static int orderAgnosticBS(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

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

    public static void main(String[] args) {

        /** ASC ARRAY **/
       /* int arr[] = {12, 16, 25, 36, 42, 56, 64, 73, 89};
        System.out.println( orderAgnosticBS(arr,36));*/

        /** DESC ARRAY **/
        int arr[] = {89, 73, 64, 56, 42, 36, 25, 16, 12};
        System.out.println( orderAgnosticBS(arr,36));





    }
}
