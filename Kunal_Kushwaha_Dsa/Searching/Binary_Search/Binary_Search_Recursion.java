package Searching.Binary_Search;

public class Binary_Search_Recursion {

    public static int BsR(int[] arr, int target, int low, int high){

        if(low > high){
            return -1;
        }

        int mid = (low + high)/2;

        if(arr[mid] == target){
            return mid;
        }

        if (target > arr[mid]) {
            return BsR(arr,target,mid+1,high);
        }else if (target < arr[mid]){
          return  BsR(arr,target,low,mid-1);
        }
        return -1;
    }


    public static void main(String[] args) {

        int arr[] = {13, 14, 25, 36, 45, 48, 89, 96};
        System.out.println(BsR(arr,25,0,arr.length-1));




    }
}
