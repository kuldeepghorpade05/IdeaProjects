import java.util.Arrays;

/*  TC = O(N)  TWO POINTERS APPROCH */
public class Q19_Rearrange_Pos_Neg_Optimal {

    public static void main(String[] args) {

        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] ans = RearrangePosNeg(arr);

        System.out.println(Arrays.toString(ans));

    }

    static int[] RearrangePosNeg(int[] arr){
        int[] ans = new int[arr.length];

        int posIndex = 0; int negIndex = 1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                ans[negIndex] = arr[i];
                negIndex += 2;
            }else {
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }


}
