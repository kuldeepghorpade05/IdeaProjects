/** import java.util.ArrayList;
// brute force TC = O(2n)

public class Q07_Move_zero_to_end {

    static int[] moveZeros(int[] arr) {
        // Temporary array:
        ArrayList<Integer> temp = new ArrayList<>();

        // Copy non-zero elements from original -> temp array:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        // Number of non-zero elements.
        int nz = temp.size();

        // Copy elements from temp to fill the first nz fields of the original array:
        for (int i = 0; i < nz; i++) {
            arr[i] = temp.get(i);
        }

        // Fill the rest of the cells with 0:
        for (int i = nz; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] ans = moveZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }


    }
} **/



