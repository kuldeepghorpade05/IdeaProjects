package Sorting.Cyclic_Sort_questions;

public class Q3_findTheDuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 2, 4, 2};
        int ans = FindDuplicateNumber(arr);
        System.out.println(ans);


    }


    static int FindDuplicateNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct  = arr[i];
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }

        }

        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                return arr[j];
            }
        }

        return arr.length;


    }

    static void swap(int[] arr, int first, int second){
        int temp =  arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
