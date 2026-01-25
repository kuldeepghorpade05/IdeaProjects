import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class Q22_Leaders_In_Array {

    public static void main(String[] args) {

//        int[] arr = {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 22, 12, 3, 0, 6));
        ArrayList<Integer> ans = arrleaders(arr);

        System.out.println(ans);


    }

    static ArrayList<Integer> arrleaders(ArrayList<Integer> arr){

        int n = arr.size();
        ArrayList<Integer> store = new ArrayList<>();

        // Start from the last element, which is always a leader
        int maxFromRight = arr.get(n - 1);
        store.add(maxFromRight);

        for(int i=n-2; i>=0; i--){
            if(arr.get(i) > maxFromRight){
                store.add(arr.get(i));
                maxFromRight = arr.get(i);
            }
        }
        //optional to reverse it
        //Collections.reverse(store);
        return store;
    }


}




