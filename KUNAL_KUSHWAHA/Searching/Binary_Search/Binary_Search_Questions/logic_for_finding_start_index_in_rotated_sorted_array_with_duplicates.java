package Searching.Binary_Search.Binary_Search_Questions;

public class logic_for_finding_start_index_in_rotated_sorted_array_with_duplicates {
    public static void main(String[] args) {

     int[] arr = {8, 8, 8, 9, 10, 10, 12, 2, 2, 4, 5, 5, 7, 7, 7};

        System.out.println(find_rotation_indexx(arr));

    }

    static int find_rotation_indexx(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int mid  = (low + high)/2;

            if(arr[mid] > arr[high]){
                low  = mid + 1;
            } else if (arr[mid] < arr[high]) {
                high = mid;
            }else{
                if(arr[high] < arr[high - 1]) return high;
                high--;
            }
        }
        return low;
    }



}
