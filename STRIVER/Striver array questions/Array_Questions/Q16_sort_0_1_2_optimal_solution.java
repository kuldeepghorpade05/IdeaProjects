import java.util.Arrays;


/*  Dutch National Flag Algorithm */
/* TC = O(N) */
/* THREE POINTERS */

public class Q16_sort_0_1_2_optimal_solution {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort012(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr, mid, high);
                high--;
            }
        }
    }


    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }





}
