/* brute force solution TL -> O(n^2) */

public class Q27_reverse_pairs {
    public static void main(String[] args) {

        int[] nums = {2, 4, 3, 5, 1};

        System.out.println(reversepairs(nums));

    }

    static int reversepairs(int[] arr){

        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > 2 * arr[j]){
                    count += 1;
                }
            }
        }
        return count;
    }


}