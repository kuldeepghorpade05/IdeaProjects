package Sorting;
import java.util.*;


public class  CyclicSort {
    public static void main(String[] args) {

//        int[] arr = {5, 4, 3, 6, 1, 2};
        int[] arr = {5, 4, 3, 6, 1, 2, 0};
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

//    static  void CycleSort(int[] arr){
//        int i = 0;
//        while(i < arr.length){
//            int correctIndex = arr[i] - 1;
//            if(arr[i] != arr[correctIndex]){
//                //swap
//                int temp = arr[i];
//                arr[i] = arr[correctIndex];
//                arr[correctIndex] = temp;
//            }else {
//                i++;
//            }
//        }
//    }


    /** for array numbers starting from 0 **/

    static  void CycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] != arr[correctIndex]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }
    }






}
