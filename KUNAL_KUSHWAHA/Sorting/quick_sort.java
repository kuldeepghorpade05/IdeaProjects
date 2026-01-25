package Sorting;

public class quick_sort {
    public static void main(String[] args) {

        int arr[] = {45, 78, 5, 65, 98, 36};

        qs.quicksort(arr, 0, arr.length - 1);

        for(int i : arr){
            System.out.print(i+" ");
        }

    }

}


class qs {
    /** partition function **/

    public static int partition(int arr[], int low, int high) {

        int pivotIndex = low;

        for (int i = low; i <= high; i++) {
            if (arr[i] <= arr[high]) {
                //swap
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;

                pivotIndex++;
            }
        }
        return pivotIndex - 1;
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
