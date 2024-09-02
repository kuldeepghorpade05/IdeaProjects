import java.util.*;

// TC = O(N^3)  brute force approch

 /* public class Q14_longest_subarray_with_sum_k_Brute {
    public static int getLongestSubarray(int []a, int k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                int s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }
                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 5;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}*/


//  TC = O(N^2) BETTER APPROCH THAN BRUTE FORCE
import java.util .*;

public class Q14_longest_subarray_with_sum_k_Brute {
    public static int getLongestSubarray(int[] a, int k) {
        int n = a.length; // size of the array.

        int maxlen = 0;
        for (int i = 0; i < n; i++) { // starting index
            int s = 0;
            for (int j = i; j < n; j++) { // ending index
                // add all the elements of
                // subarray = a[i...j]:
                s += a[j];
                if (s == k)
                    maxlen = Math.max(maxlen, j - i + 1);
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 5;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}


