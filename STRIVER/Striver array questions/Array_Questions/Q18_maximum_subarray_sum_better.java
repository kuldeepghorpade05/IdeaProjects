import java.util.Arrays;

public class Q18_maximum_subarray_sum_better {
    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

//        int[] ans = maximumSubarr(arr);
//        System.out.println(Arrays.toString(ans));

        System.out.println(maximumSubarr(arr));

    }

    static int maximumSubarr(int[] arr){

        int start = 0; int end = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=i; j<arr.length; j++){
                sum = sum + arr[j];

//                if(sum > maxsum){
//                    maxsum = sum;
//                    start = i;
//                    end = j;
//                }
                maxsum = Math.max(sum, maxsum);
            }
        }

//        return new int[]{start,end};
//        return Arrays.copyOfRange(arr,start, end+1);
        return maxsum;
    }



}
