package Searching.Binary_Search;
//https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

class  Q3_kth_smallest_element_in_a_sorted_matrix{

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;

        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            // Avoid overflow by writing mid like this:
            int mid = low + (high - low) / 2;

            // Count numbers less than or equal to mid
            int count = countLessEqual(matrix, mid, n);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid; // Don't do mid - 1, because mid might be the answer
            }
        }

        return low;
    }

    // Efficient counting from bottom-left corner
    private static int countLessEqual(int[][] matrix, int mid, int n) {
        int count = 0;
        int row = n - 1;
        int col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }

        return count;
    }
}