import java.util.*;

/* TC = O(N) */

public class Q18_maximum_subarray_kdanes_optimal {


    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};

//        System.out.println(kdanes(arr));
        int[] ans = kdanes(arr);
        System.out.println(Arrays.toString(ans));


    }


    static int[] kdanes(int[] arr){

        int maxsum = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0; int ansstart = -1; int ansend = -1;

        for(int i=0; i<arr.length; i++){

            sum = sum + arr[i];

            if(sum > maxsum){
                maxsum = sum;

                ansstart = start;
                ansend = i;
            }

            if(sum < 0){
                sum = 0;
                start = i + 1;
            }

        }

        //edge case
        if(maxsum < 0){
            return new int[]{-1,-1};
//            return 0;
        }

//        return maxsum;
//        return new int[]{ansstart, ansend};
        return Arrays.copyOfRange(arr,ansstart,ansend+1);
    }







}
