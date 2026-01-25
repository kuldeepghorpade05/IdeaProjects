
import java.lang.reflect.Array;
import java.util.*;

class Q11_find_missing_number {
    public static void main(String[] args) {

        int[] arr = {2,1,5,4};

        //System.out.println(findmissing(arr));

        //System.out.println(linearsearchfind(arr));

    }

    //TC = O(N)
    static void cyclesort(int[] arr){

        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i] - 1;
            if( arr[i] <= arr.length && arr[i] != arr[correctindex]){
                //swap
                swap(arr, i, correctindex);
            }else {
                i++;
            }
        }

    }

    static int findmissing(int[] arr){

        cyclesort(arr);

        for(int j = 0; j < arr.length; j++){
            if( arr[j] != j+1){
                return j+1;
            }
        }
        return -1;
    }



    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


    /** brute force approch for this problem by striver **/
    // TC = O(N^2)
   /** static int linearsearchfind(int arr[]) {
        for (int i = 1; i <= arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;
            }
        }
        return arr.length;
    }**/



}










