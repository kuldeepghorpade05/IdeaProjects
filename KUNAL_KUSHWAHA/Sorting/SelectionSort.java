package Sorting;

import java.util.Arrays;

public class SelectionSort {

    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void SelectionS(int[] arr){

        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++ ){
                if(arr[j] < arr[min]){
                    min = j; //update min
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {74, 21, 13, 8, 96, 45, 36};
        SelectionS(arr);
        // printarray(arr);
        System.out.println(Arrays.toString(arr));




    }
}
