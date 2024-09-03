import java.util.*;

public class PLAYGROUND {

    public static void main(String[] args) {

        int[] arr = {3, -4, 2, -3, 1, 4, -1, 2, 0};
        int sum = 0;

        int ans = finSmallestSubArray(arr, sum);
        System.out.println(ans);

    }

    static int finSmallestSubArray(int[] arr, int sum){
        int currentsum = 0;
        int minlen = Integer.MAX_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            if(currentsum == sum){
                minlen = Math.min(minlen, i + 1);
            }

            if(map.containsKey(currentsum - sum)){
                int len = i - map.get(currentsum);
                minlen = Math.min(minlen, len);
            }

            if(!map.containsKey(currentsum)){
                map.put(currentsum, i);
            }
        }
        return minlen;
    }



}
