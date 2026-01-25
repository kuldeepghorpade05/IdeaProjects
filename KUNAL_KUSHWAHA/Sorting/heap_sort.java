package Sorting;

public class heap_sort {
    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};
        heapsort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    // heapify function
    public static void heapify(int[] arr, int n, int i){
        int largest = i;       //root
        int left = 2 * i + 1;  //left child
        int right = 2 * i + 2; //right child

        // If left child is larger than root
        while(left < n && arr[left] > arr[largest]){
            largest = left;
        }

        // If right child is larger than largest so far
        while(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        // If largest is not root
        if(largest != i){
            //swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    //heap sort function
    public static void heapsort(int[] arr){

        //build max heap
        for(int i=arr.length/2-1; i>=0; i--){
            heapify(arr, arr.length, i);
        }

        //extract elements
        for(int i=arr.length-1; i>0; i--){
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }









}
