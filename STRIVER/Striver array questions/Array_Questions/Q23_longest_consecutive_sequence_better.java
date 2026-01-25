import java.util.Arrays;
import java.util.*;

/*    TC = O(N LOG N) better approch  */

class Q23_longest_consecutive_sequence_better {

    public static void main(String[] args) {

//        int arr[] = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        int[] arr = {100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2};

        System.out.println(longestcon(arr));



    }

    static int longestcon(int[] arr) {

        Arrays.sort(arr);

        int longest = 1;
        int currcount = 0;
        int lastsmaller = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - 1 == lastsmaller) {
                currcount = currcount + 1;
                lastsmaller = arr[i];
            } else if (arr[i] != lastsmaller) {
                currcount = 1;
                lastsmaller = arr[i];
            }

            longest = Math.max(longest, currcount);

        }
        return longest;
    }






}




