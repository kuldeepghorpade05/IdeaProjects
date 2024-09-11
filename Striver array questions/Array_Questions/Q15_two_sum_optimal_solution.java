import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Q15_two_sum_optimal_solution  {

    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 11};
        int[] ans = sumof(arr, 14);
        System.out.println(Arrays.toString(ans));


    }

    static int[] sumof(int[] arr, int target){

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int compliment = target - arr[i];
            if(mp.containsKey(compliment)){
                return new int[]{mp.get(compliment), i};
            }else{
                mp.put(arr[i], i);
            }
        }
        return new int[]{-1,-1};
    }





}
