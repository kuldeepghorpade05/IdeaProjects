import java.util.HashMap;

public class Q33_count_sunarray_sum_k {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};


    }




    /* optimal approch Time complexity => O(n) */
//    public static int subopti(int[] arr, int sum){
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        int prefixsum = 0;
//        int count = 0;
//
//        hashMap.put(0,1);
//
//        for(int i=0; i<arr.length; i++){
//            prefixsum += arr[i];
//
//            int remove = prefixsum - sum;
//
//            if(hashMap.containsKey(remove)){
//                count = count + hashMap.get(remove);
//            }
//
//            hashMap.put(prefixsum, hashMap.getOrDefault(prefixsum,0) + 1);
//        }
//        return count;
//    }





    /* brute force approch Time complexity => O(n^2) */
//    public static int subarr(int[] arr, int sum){
//
//        int totalsub = 0;
//        for(int i=0; i<arr.length; i++){
//            int currentsum = 0;
//            for (int j=i; j<arr.length; j++){
//                currentsum += arr[j];
//                if(currentsum == sum){
//                    totalsub++;
//                }
//            }
//        }
//        return totalsub;
//    }




}
