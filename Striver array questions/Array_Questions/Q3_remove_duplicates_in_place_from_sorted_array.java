import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** brute force solution **/

public class Q3_remove_duplicates_in_place_from_sorted_array {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        int k = RemoveDuplicates(arr);

        for(int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int RemoveDuplicates(int arr[]){

        Set<Integer> st = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            st.add(arr[i]);
        }

        int k = st.size();
        int j = 0;

        // Using an Iterator and a for loop to place unique elements back in the array
        Iterator<Integer> it = st.iterator();
        for (int i = 0; it.hasNext(); i++) {
            arr[j++] = it.next();
        }

        return k;

    }



}
