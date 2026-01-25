import java.util.*;

/** TC = O(N) **/
public class Q12_maximum_consecutive_numberof_1s {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(max_1_count(arr));

    }

    static int max_1_count(int[] arr){
        int maxcount = 0;
        int currentmax = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                currentmax++;
            } else {
              currentmax = 0;
            }
            maxcount = Math.max(maxcount, currentmax);
        }
        return maxcount;
    }



}
