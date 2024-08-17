package Arrays;

import java.util.*;
import java.util.Arrays;



public class Arrys  {
    public static void main(String[] args) {

        int arr[] = {78, 89, 54, 65, 32, 54, 41};

        /** swaping array index **/

//        for(int i:arr){
//            System.out.print(i +" ");
//        }
       // System.out.println(Arrays.toString(arr));

       // System.out.println();

       // swap(arr,0,6);

//        for(int i:arr){
//            System.out.print(i +" ");
//        }
      //  System.out.println(Arrays.toString(arr));


        /** maximum **/

      // max(arr);

        /** maximum range **/
        //maxrange(arr,2,4);

        /** reverse array **/
//        System.out.print(Arrays.toString(arr));
//        System.out.println();
//        reversearray(arr,0,arr.length-1);

        /** reverse array 2nd method **/
//        System.out.print(Arrays.toString(arr));
//        System.out.println();
//        reversearray2(arr);





    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /** to find maximum in an array **/
    static void max(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.print(temp);
    }

    /** to find a maximum in array form a given range **/
    static void maxrange(int[] arr, int start, int end) {
        int temp = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        System.out.print(temp);
    }

    static void reversearray(int[] arr, int start, int end) {
        int temp;
       while(arr[start] != arr[end]){
           temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
        System.out.print(Arrays.toString(arr));
    }

    /** reverse array using TWO POINTER METHOD **/
    static void reversearray2(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }



}
