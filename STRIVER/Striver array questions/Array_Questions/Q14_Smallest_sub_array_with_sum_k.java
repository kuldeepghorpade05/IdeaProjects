import java.util.*;

public class Q14_Smallest_sub_array_with_sum_k {

    public static void main(String[] args) {

        int[] a = {3, -4, 2, -3, 1, 4, -1, 2, 0};
        int sum = 0;

        int len = getSmallestSubarray(a, sum);
        System.out.println("The length of the smallest subarray is: " + len);
    }
    public static int getSmallestSubarray(int[] arr, int sum) {

        int currentsum = 0;
        int minlen = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentsum += arr[i];

            // If the currentsum equals the target sum, update the minLen:
            if (currentsum == sum) {
                minlen = Math.min(minlen, i + 1);
            }

            // If (currentsum - sum) exists in the map, calculate the length of the subarray:
            if (map.containsKey(currentsum - sum)) {
                int len = i - map.get(currentsum - sum);
                minlen = Math.min(minlen, len);
            }

            // Put the currentsum into the map only if it is not already present:
            if (!map.containsKey(currentsum)) {
                map.put(currentsum, i);
            }
        }

        // If minlen was updated, return it; otherwise, no valid subarray was found:
        return minlen == Integer.MAX_VALUE ? 0 : minlen;
    }
}
