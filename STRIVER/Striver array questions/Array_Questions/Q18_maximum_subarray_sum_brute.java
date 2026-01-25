import java.util.*;

/*  TC = O(N^3) PREFIXSUM USING 3 LOOPS */

public class Q18_maximum_subarray_sum_brute {


    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

        int[] ans = maxsubarr(arr);
        System.out.println(Arrays.toString(ans));

//        System.out.println(maxsubarr(arr));

    }

    static int[] maxsubarr(int[] arr){

        int maxsum = Integer.MIN_VALUE;
        int start = 0; int end = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum = sum + arr[k];
                }
                if(sum > maxsum){
                    maxsum = sum;
                    start = i;
                    end = j;
                }
//                maxsum = Math.max(maxsum,sum);
            }
        }
        return Arrays.copyOfRange(arr,start,end+1); //returns sub array with maxsum
//          return new int[]{start, end}; //returns indexes of max sub array
//        return maxsum; // returns sum of max sub array
    }






}
