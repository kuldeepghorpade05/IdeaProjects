
import java.util.*;
/** TC = O(N) **/
class playGround {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(arrcount(arr));

    }

    static int arrcount(int[] arr){

        int maxcon = 0;
        int currentcount = 0;

        for (int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                currentcount++;
            }else{
                currentcount = 0;
            }
            maxcon = Math.max(maxcon, currentcount);
        }
        return maxcon;
    }




}

