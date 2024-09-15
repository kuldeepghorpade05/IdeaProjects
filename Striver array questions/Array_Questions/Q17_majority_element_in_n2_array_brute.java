
/* TC = O(N^2) */

public class Q17_majority_element_in_n2_array_brute {
    public static void main(String[] args) {

//        int[] arr = {2, 2, 3, 3, 1, 2, 3, 3, 3, 3};
//          int[] arr = {2, 2, 3, 3, 1, 2, 2};

        int[] arr = {2, 2, 3, 3, 1, 2, 2};

          System.out.println(majorityElement(arr));


    }

    static int majorityElement(int[] arr){

        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
                if(count > arr.length/2) return arr[j];
            }
        }
       return -1;
    }
}
