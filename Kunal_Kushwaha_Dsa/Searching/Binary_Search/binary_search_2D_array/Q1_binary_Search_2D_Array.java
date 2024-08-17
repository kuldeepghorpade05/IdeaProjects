package Searching.Binary_Search.binary_search_2D_array;

import java.util.Arrays;

public class Q1_binary_Search_2D_Array {
    /** ROWS AND COLS ARE SORTED **/

    /**
     * The problem involves searching for a target value in a 2D
     * matrix where the rows and columns are sorted in ascending
     * order. The task is to design an algorithm to efficiently
     * locate the target value in the matrix, returning its indices
     * if found, or [-1, -1] if the target is not present.
     **/

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {8, 9, 12, 16},
                {18, 21, 23, 25},
                {28, 32, 35, 40}
        };

        System.out.println(Arrays.toString(search(matrix, 25)));


    }


}







