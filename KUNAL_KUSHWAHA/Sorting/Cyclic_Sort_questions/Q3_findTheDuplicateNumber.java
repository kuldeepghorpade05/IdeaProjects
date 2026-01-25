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
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
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

}
