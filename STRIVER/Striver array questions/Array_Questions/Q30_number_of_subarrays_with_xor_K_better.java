
// Time complexity = O(n^2)
public class Q30_number_of_subarrays_with_xor_K_better {

    public static void main(String[] args) {

        int[] arr = {4, 2, 2, 6, 4}; int k = 6;

        System.out.println(subarr_xor(arr,k));
    }

    public static int subarr_xor(int[] arr, int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int xor = 0;
            for (int j=i; j<arr.length; j++){
                xor =  xor ^ arr[j];
                if(xor == k){
                    count++;
                }
            }
        }
        return count;
    }



}
