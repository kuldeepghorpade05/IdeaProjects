import java.util.*;

public class Q1_Second_largest_element_in_an_array {
    public static void main(String[] args) {

        //int arr[] = {1, 2, 2, 4, 7, 7, 5};

       int arr[] = {14, 72, 78, 8, 62, 3, 78, 2};

        bubblesort(arr);

        for (int i:arr){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println(secondlargest(arr));

    }

    /** bubble sort **/
    static void bubblesort(int[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

//    static int secondlargest(int arr[]){
//        bubblesort(arr);
//        int largest = arr[arr.length-1];
//
//        int secondlargest = arr[0];
//        for(int i=0; i<arr.length-2; i++){
//            if(arr[i] > secondlargest){
//                secondlargest = arr[i];
//            }
//        }
//
//        return secondlargest;
//    }

    static int secondlargest(int arr[]){
        int largest = arr[arr.length-1];
        int secondlargest = Integer.MIN_VALUE;
        for(int i=arr.length-2; i>=0; i-- ){
            if(arr[i] != largest){             //if(arr[i] != largest){
                secondlargest = arr[i];
                break;
            }
        }
        return secondlargest;
    }






}
