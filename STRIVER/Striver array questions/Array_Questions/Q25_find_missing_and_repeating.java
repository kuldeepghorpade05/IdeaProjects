import java.util.Arrays;

// brute force solution TL -> O(n^2)
public class Q25_find_missing_and_repeating {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 5, 4, 6, 7, 5};

        int[] res = rep(arr);
        System.out.println(Arrays.toString(res));

    }

    public static int[] rep(int[] arr) {
        int repeating = -1;
        int misssing = -1;

        for (int i = 1; i <= arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }
            if (cnt == 2) repeating = i;
            if (cnt == 0) misssing = i;

            if (repeating != -1 && misssing != -1) break;
        }
        return new int[]{repeating, misssing};
    }

}