import java.util.*;

public class Q28_maximum_product_subarray {

    public static void main(String[] args) {

        int[] arr = { 2, 3, -2, 4 };
//      System.out.println(q25(arr));
        System.out.println(maxProductSubArray(arr));

    }

    /* BRUTE FORCE O(n^2) */
    public static int q25(int[] arr){
        int maxproduct = arr[0];

        for(int i=0; i<arr.length; i++){
            int currentProduct = 1;
            for(int j=0; j<arr.length; j++){
                 currentProduct = currentProduct * arr[j];
                if(currentProduct > maxproduct){
                    maxproduct = currentProduct;
                }
            }
        }
        return maxproduct;
    }

    /* OPTIMIZED O(n) */
    public static int maxProductSubArray(int[] arr) {

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[arr.length - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }

}