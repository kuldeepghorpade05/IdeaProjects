import java.util.*;


public class PLAYGROUND {

    public static void main(String[] args) {

        int[] arr = {10, 15, -5, 15, -10, 5};
        int sum = 5;

        int result = findsubarray(arr, sum);
        System.out.println(result);


    }

    static int findsubarray(int[] arr, int sum) {

        int currentSum = 0;
        int numcount = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // If the current sum is equal to the target sum
            if (currentSum == sum) {
                numcount++;
            }

            // If the current sum minus the target sum exists in the map
            if (map.containsKey(currentSum - sum)) {
                numcount++;
            }

            // Put the current sum into the map with the index
            map.put(currentSum, i);
        }

        return numcount;
    }
}

//It looks like your code is indeed working correctly to count the number of subarrays with the given sum `k`. The output of `2` indicates that there are two subarrays in the array `{10, 15, -5, 15, -10, 5}` that sum up to `5`.
//
//If you have any more questions or need further clarification, feel free to ask!