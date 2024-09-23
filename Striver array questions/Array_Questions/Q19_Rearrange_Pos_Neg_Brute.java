import java.util.ArrayList;
import java.util.Arrays;

/* TC = O(N + N/2) */

public class Q19_Rearrange_Pos_Neg_Brute {
    public static void main(String[] args) {

        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] ans = RearrangePosNeg(arr);
        System.out.println(Arrays.toString(ans));



    }

    static int[] RearrangePosNeg(int[] arr){
        ArrayList<Integer> Pos = new ArrayList<>();
        ArrayList<Integer> Neg = new ArrayList<>();

        //collects positives and negatives accordingly is pos and neg arraylist
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0) Pos.add(arr[i]);
            else Neg.add(arr[i]);
        }

        //assigns poities and negatives
        for(int i=0; i<arr.length/2; i++){
            arr[2*i] = Pos.get(i);
            arr[2*i+1] = Neg.get(i);
        }
        return arr;
    }


}