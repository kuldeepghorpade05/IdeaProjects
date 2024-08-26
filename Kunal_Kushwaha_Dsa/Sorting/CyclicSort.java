package Sorting;
import java.util.*;


public class CyclicSort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 6, 1, 2};
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static  void CycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }
        }
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    /** for array numbers starting from 0 **/

//    static  void CycleSort(int[] arr){
//        int i = 0;
//        while(i < arr.length){
//            int correct = arr[i];
//            if(arr[i] != arr[correct]){
//                swap(arr, i, correct);
//            }else {
//                i++;
//            }
//        }
//    }
//
//    static void swap(int arr[], int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }





}
