package sorting;

import java.util.*;

class printarray {

    public static void pa(int arr[]) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}


class qs {

    /** partition function **/

    public static int partition(int arr[], int low, int high) {

        int pos = low;

        for (int i = low; i <= high; i++) {
            if (arr[i] <= arr[high]) {
                //swap
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;

                pos++;
            }
        }
        return pos - 1;
    }


    /** quick sort  using recursion (Divide and conquer) **/
    public static void quicksort(int arr[], int low, int high) {

        //base case
        if (low >= high) return;

        //calling partition to divide array
        int pivot = partition(arr, low, high);

        //left
        quicksort(arr, low, pivot - 1);
        //right
        quicksort(arr, pivot + 1, high);
    }


}


public class quick_sort {
    public static void main(String[] args) {

        int arr[] = {45, 78, 5, 65, 98, 36};

        qs.quicksort(arr, 0, arr.length - 1);

       printarray.pa(arr);

//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();







    }
}

