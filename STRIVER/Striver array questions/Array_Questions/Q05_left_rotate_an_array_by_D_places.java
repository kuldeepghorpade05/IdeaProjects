import java.util.*;

/** TC = O(n + d)   **/

public class Q05_left_rotate_an_array_by_D_places{

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        rotatearr(arr, arr.length, 3 );

        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    static void rotatearr(int[] arr, int n, int d){
        //test case
        if(n == 0) return;

        d = d % n;
        if(d == 0) return;

        int[] temp = new int[d];

        //step 1 - store in temp
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }

        //step 2 - shift
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }

        //step 4 - place the rotated in arr
        int j = 0;
        for(int i=n-d; i<n; i++){
            arr[i] = temp[j];
            j++;
        }


    }




}
