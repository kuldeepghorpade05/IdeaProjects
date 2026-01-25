package Searching.Binary_Search.binary_search_2D_array;
//https://leetcode.com/problems/search-a-2d-matrix/

import java.util.Arrays;

public class Q2_search_2d_matrix {


   static int[] searchMatrix(int[][] matrix, int target) {

        int m = matrix.length; //row length - 3
        int n = matrix[0].length;  //col length - 4

        int low = 0;
        int high = m * n - 1;  // 3 * 4 - 1

        while (low <= high) {

            int mid = (low + high)/2;

            //formula to remember
            // for boolean return use m and for int[] return use n
            int row = mid / n;
            int col = mid % n;


            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

   public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

       int[] res = searchMatrix(arr, 12);
       System.out.println(Arrays.toString(res));

    }


}
