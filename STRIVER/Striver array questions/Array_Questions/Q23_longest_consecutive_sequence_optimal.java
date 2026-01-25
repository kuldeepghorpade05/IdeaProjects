import java.util.HashSet;
import java.util.Set;

class Q23_longest_consecutive_sequence_optimal {

    /*    TC = O(N LOG N) better approch  */
    public static void main(String[] args) {

        int arr[] = {102, 4, 100, 1, 101, 3, 2, 1, 1};
//        int[] arr = {100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2};

        System.out.println(longestcon(arr));

    }


    static int longestcon(int[] arr) {

        if (arr.length == 0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // add every element to set
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i : set) {

            if (!set.contains(i - 1)) {
                int cnt = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    x++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}




