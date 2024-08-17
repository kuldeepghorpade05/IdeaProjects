import java.util.*;

/** SORTING **/
public class Sorting {

    public static void printarry(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    /** main --------------------------------------------------------------------------------------- **/
    public static void main (String[] args) {

        /** BUBBLE SORT **/

       /* int arr[] = {7, 8, 3, 1, 2};

        for(int i=0; i<arr.length-1; i++ ){
            for(int j=0; j<arr.length-i-1; j++ ){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        printarry(arr);*/

        /** desending bubble sort **/
      /* int arr1[] = {74,89,65,85,87,25,36};

        for(int i=0; i<arr1.length-1; i++ ){
            for(int j=0; j<arr1.length-i-1; j++ ){
                //swap
                if( arr1[j] < arr1[j+1] ){
                    //swap
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        printarry(arr1); */


        /** SELECTION SORT **/

        /** asending **/
      /* int arr[] = {74,89,65,85,87,25,36};

        for(int i=0; i<arr.length-1; i++ ){
            int min = i;
            for(int j = i+1; j<arr.length; j++ ){
                if(  arr[j] < arr[min]  ){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printarry(arr); */


        /** INSERTION SORT **/


       /* int arr[] = {47, 54, 35, 75, 25, 10};

       for(int i=1; i<arr.length; i++ ){
           int temp = arr[i];

           int j=i-1;
           while(j>=0 && arr[j]>temp ){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = temp;
       }
       printarry(arr);*/




























        }
    }
