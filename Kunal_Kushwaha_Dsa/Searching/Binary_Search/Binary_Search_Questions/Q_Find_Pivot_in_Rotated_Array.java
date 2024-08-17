package Searching.Binary_Search.Binary_Search_Questions;

public class Q_Find_Pivot_in_Rotated_Array {

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            //case 1
            if( mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            // case 3
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                // case 4
                start = mid + 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {8, 9, 10, 11, 12, 0, 2, 4, 5, 6, 7};

        System.out.println(findpivot(arr));

    }
}
