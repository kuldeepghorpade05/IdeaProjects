
/* TC = O(N^3)  OR  O(N^2)  BRUTE APPROCH */

public class Q23_longest_consecutive_sequence_brute {
    public static void main(String[] args) {

        int arr[] = {102, 4, 100, 1, 101, 3, 2, 1, 1};

        System.out.println(longestcons(arr));

    }


    static int longestcons(int[] arr){
        int longest = 1;

        for(int i=0; i<arr.length; i++){
            int x = arr[i];
            int count = 1;

            while(ls(arr, x + 1) == true){
                x = x + 1;
                count = count + 1;
            }
           longest = Math.max(longest, count);
        }
        return longest;
    }


    static boolean ls(int[] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                return true;
            }
        }
        return false;
    }




}
