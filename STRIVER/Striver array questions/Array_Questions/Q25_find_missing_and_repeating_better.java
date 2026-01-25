import java.lang.reflect.Array;
import java.util.Arrays;

public class Q25_find_missing_and_repeating_better {
    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        System.out.println(Arrays.toString(findMissingRepeatingNumbers(nums)));

    }

    // Function to find repeating and missing numbers
    public static int[] findMissingRepeatingNumbers(int[] nums) {

        // Hash array to count occurrences
        int[] hash = new int[nums.length + 1];

        // Update the hash array:
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        int repeating = -1, missing = -1;

        // Find the repeating and missing number:
        for (int i = 1; i <= nums.length; i++) {
            if (hash[i] == 2) {
                repeating = i;
            } else if (hash[i] == 0) {
                missing = i;
            }

            // Stop early if both found
            if (repeating != -1 && missing != -1) {
                break;
            }
        }

        // Return [repeating, missing]
        return new int[]{repeating, missing};
    }
}

