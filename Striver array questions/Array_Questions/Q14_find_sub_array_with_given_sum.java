import java.util.*;

/* it finds the first sub array that matches the sum k and returns the indxes of it */
/* TC = O(n) */

public class Q14_find_sub_array_with_given_sum {

    public static void main(String[] args) {
        int[] arr = {10, 15, -5, 15, -10, 5};
        int sum = 5;

        int[] result = findsubarray(arr, sum);
        System.out.println(Arrays.toString(result));


    }

    static int[] findsubarray(int[] arr, int sum) {

        int currentSum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // If the current sum is equal to the target sum
            if (currentSum == sum) {
                start = 0;
                end = i;
                return new int[]{start, end};
            }

            // If the current sum minus the target sum exists in the map
            if (map.containsKey(currentSum - sum)) {
                start = map.get(currentSum - sum) + 1;
                end = i;
                return new int[]{start, end};
            }

            // Put the current sum into the map with the index
            map.put(currentSum, i);
        }

        // If no subarray is found, return [-1, -1]
        return new int[]{-1, -1};
    }
}
