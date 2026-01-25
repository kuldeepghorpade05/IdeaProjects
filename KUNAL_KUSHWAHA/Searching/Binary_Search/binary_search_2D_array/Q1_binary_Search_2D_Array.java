package Searching.Binary_Search.binary_search_2D_array;

import java.util.Arrays;

public class Q1_binary_Search_2D_Array {

    static int[] search(int[][] arr, int target){

        int row = 0;
        int col = arr.length-1;

        while(row < arr.length && col >= 0){

            if(arr[row][col] == target){
                return new int[]{row, col};
            }
            if(target > arr[row][col]){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int[] res = search(arr, 40);

        System.out.println(Arrays.toString(res));

    }


}







