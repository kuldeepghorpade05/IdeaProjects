
/** TC = O(N)  **/

public class Q04_left_rotate_array_by_one_place {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5};
        rotatedarray(arr);

        for(int i:arr){
            System.out.print(i +" ");
        }

    }

    static void rotatedarray(int[] arr){

        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;

    }




}
