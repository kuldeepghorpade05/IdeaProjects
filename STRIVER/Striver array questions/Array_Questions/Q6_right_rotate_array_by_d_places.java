/** TC = O(n + d)   **/

public class Q6_right_rotate_array_by_d_places{

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
            temp[i] = arr[n - d + i];
        }

        //step 2 - shift
        for(int i=n-1; i>=d; i--){
            arr[i] = arr[i-d];
        }

        //step 4 - place the rotated in arr
        for(int i=0; i<d; i++){
            arr[i] = temp[i];
        }


    }




}
