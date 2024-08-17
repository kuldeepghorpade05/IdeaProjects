package searching;

import java.util.*;

class bs{

    /**  BINARY SEARCH USING ITERATION **/
    public static int bsi(int arr[], int target){

        int high = arr.length-1;
        int low = 0;
       // int steps = 0;

        while(low<=high){
            //steps++;
            int mid = (low+high)/2;

            if(target==arr[mid]){
               // System.out.println("binary steps: "+steps);
                return mid;
            } else if(target > arr[mid]){
                low = mid+1;
            } else {
                high = mid-1;
            }
            //updation of mid
            // mid = (low+high)/2;
        }
       // System.out.println("binary steps: "+steps);
        return -1;
    }



    /**  BINARY SEARCH USING RECURSION **/

    public static int bsr(int arr[], int target, int low, int high){

    if(low > high){
        return -1;
    }

        int mid = (low+high)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target > arr[mid]){
            return bsr( arr, target,  mid+1,  high);
        } else if(target < arr[mid]){
            return bsr( arr, target,  low, mid-1);
        }
        return -1;
    }



}


/** BINARY_SEARCH **/
public class BinarySearch {
    public static void main(String[] args) {

        /** iteration call ***/

        int arr[] = {70,74,78,80,85,96,98};
        int target = 74;

        //System.out.println(binarySearch.searching.bs(arr,target));

//        int result = searching.bs.bsi(arr,target);
//
//        if (result != -1) {
//            System.out.println("index : "+result);
//        }else {
//            System.out.println("not found");
//        }

        /** recursion call **/

//        System.out.println(binarysearch.bsr(arr, target,0,arr.length-1));

//        int result = searching.bs.bsr(arr,target,0,arr.length-1);
//
//        if (result != -1) {
//            System.out.println(result);
//        }else {
//            System.out.println("not found");
//        }
//



    }
}
