package Searching.Binary_Search.Binary_Search_Questions;

public class logic_for_finding_start_index_in_rotated_sorted_array {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(find_Rotation_index(arr));

    }

    static int find_Rotation_index(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low < high){
            int mid = (low + high)/2;

            if(arr[mid] > arr[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }



}
