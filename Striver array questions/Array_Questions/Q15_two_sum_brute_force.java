import java.util.*;

public class Q15_two_sum_brute_force {

    public static void main(String[] args) {

        int[] arr = {2, 6, 5, 8, 11};
        int[] ans = sumof(arr,14);

        System.out.println(Arrays.toString(ans));


    }

    static int[] sumof(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] == arr[j]) continue;

                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }





}
