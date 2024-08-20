

public class Q2_check_for_sorted_array {
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 5, 5, 8};
        System.out.println(checksorted(arr));

    }

    static boolean checksorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {

            }else {
                return false;
            }
        }
      return true;
    }




}

/** O(N)  **/