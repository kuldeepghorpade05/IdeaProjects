package Searching.Binary_Search.Binary_Search_Questions;

public class Q10_Search_in_Rotated_Sorted_Array_withDuplicates {

    /** binary search **/
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }


    /** method to find pivot **/
    static int findpivotwithduplicates(int[] arr){
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
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //note : what if these elements at start and end were the pivot??
                //check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                //check if end is pivot
                if(arr[end] < arr[end - 1]){
                    return end -1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return -1;
    }


    static int searchAD(int[] arr, int target){
        int pivot = findpivotwithduplicates(arr);

        //simple binary search
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }

        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }else {
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }

    }


    public static void main(String[] args) {

        int[] arr = {8, 8, 9, 10, 10, 12, 2, 2, 4, 5, 7};

        System.out.println(searchAD(arr,2));


    }



}
