import java.util.*;

public class Q30_number_of_subarrays_with_xor_k_optimal {
    // Function to count subarrays with given XOR
    public static int countSubarrays(int[] A, int k) {
        // Store frequency of prefix XORs
        Map<Integer, Integer> freq = new HashMap<>();
        // Initialize with prefix XOR 0
        freq.put(0, 1);

        // Current prefix XOR
        int prefixXor = 0;
        // Answer count
        int count = 0;

        // Traverse array
        for (int num : A) {
            // Update prefix XOR
            prefixXor ^= num;

            // Compute required XOR
            int target = prefixXor ^ k;

            // If target exists in map, add its frequency
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }

            // Store current prefix XOR in map
            freq.put(prefixXor, freq.getOrDefault(prefixXor, 0) + 1);
        }
        return count;
    }



    public static void main(String[] args) {

        int[] A = {4, 2, 2, 6, 4}; int k = 6;

        System.out.println(countSubarrays(A, k));
    }


}




