import java.util.*;


// To find the longest length sub-array in array with sum of k : TC - O(n)

public class Q14_longest_sub_array_sumk_optimal_solution {

    public static void main(String[] args) {

        int[] a = {10, 2, -2, -20, 10};
        int sum = -10;

        int len = getLongestSubarray(a, sum);
        System.out.println("The length of the longest subarray is: " + len);
    }

    public static int getLongestSubarray(int[] arr, int sum) {

        int currentsum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentsum += arr[i];

            // If the currentsum equals the target sum, update the maxLen:
            if (currentsum == sum) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // If (currentsum - sum) exists in the map, calculate the length of the subarray:
            if (map.containsKey(currentsum - sum)) {
                int len = i - map.get(currentsum - sum);
                maxLen = Math.max(maxLen, len);
            }

            // Put the currentsum into the map only if it is not already present:
            if (!map.containsKey(currentsum)) {
                map.put(currentsum, i);
            }

        }

        return maxLen;
    }


}
