import java.util.*;

/* TC = O(2N) */

public class Q16_sort_0_1_2_better_solution {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int[] ans = countnum(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] countnum(int[] arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        //keeps the count of 0,1,2
        for (int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                count0++;
            } else if (arr[i] == 1) count1++;
            else count2++;
        }

        int index = 0;

        for(int i=0; i<count0; i++){
            arr[index++] = 0;
        }
        for(int i=0; i<count1; i++){
            arr[index++] = 1;
        }
        for(int i=0; i<count2; i++){
            arr[index++] = 2;
        }

        return arr;
    }






}
