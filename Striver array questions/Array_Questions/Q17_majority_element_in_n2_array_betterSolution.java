import java.util.HashMap;
import java.util.Map;

/* TC = O(2N) - USING HASHMAP */

public class Q17_majority_element_in_n2_array_betterSolution {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 1, 2, 2};
        System.out.println(majorityelement_better(arr));

    }

    static int majorityelement_better(int[] arr){

        HashMap<Integer, Integer> mpp = new HashMap<>();

        // to add elements in hashmap and alos the count it has occoured
        for(int i=0; i<arr.length; i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        // it will iterate hashmap key and values and return whose values are greater than arr.length/2
        for(Map.Entry<Integer,Integer> i : mpp.entrySet()){
            if(i.getValue() > (arr.length/2)){
                return i.getKey();
            }
        }
        return -1;
    }



}
