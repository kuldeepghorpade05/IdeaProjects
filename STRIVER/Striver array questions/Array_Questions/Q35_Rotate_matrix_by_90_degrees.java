

public class Q35_Rotate_matrix_by_90_degrees {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        /* brute call */
        //        int[][] rotated = rotateClockwise(matrix);
        //        for (int[] row : rotated) {
        //            for (int val : row)
        //                System.out.print(val + " ");
        //            System.out.println();
        //        }


        /* optimal call */
//        rotateClockwise1(matrix);
//        for (int[] row : matrix) {
//            for (int val : row)
//                System.out.print(val + " ");
//            System.out.println();
//        }




    }


    /* optimal approch  Time complexity => O(n^2) */
    // Function to rotate matrix 90 degrees clockwise in-place
    public static void rotateClockwise1(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap element at (i, j) with (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            // Swap elements from both ends moving toward center
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }






    /* brute force approch Time complexity => O(n^2)   */
    // Function to rotate the matrix 90 degrees clockwise using extra space
    public static int[][] rotateClockwise(int[][] matrix) {
        // Get the size of the square matrix
        int n = matrix.length;

        // Create a new matrix of same size to store rotated result
        int[][] rotated = new int[n][n];

        // Traverse each element of original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Place the element at its new rotated position
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }

        // Return the rotated matrix
        return rotated;
    }





}
