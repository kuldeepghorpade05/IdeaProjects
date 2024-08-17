package Collection_framework.Set;
import java.util.*;

/**
 *
 1. add
 2. remove
 3. contains
 4. isEmpty
 5. size
 6. clear

 **/

/**
 - `HashSet`: Uses a hash table for storage, offers constant-time
    performance for basic operations like add, remove, and contains.
    Does not maintain order.
 - `TreeSet`: Uses a red-black tree for storage, maintains elements in
    sorted order (natural ordering or based on a comparator). Offers
    log(n) time complexity for basic operations. **/


/** TREESET - SET **/
public class Treesett {
    public static void main(String[] args) {

        Set<Integer> st = new TreeSet<>();

        /** add **/
        st.add(45);
        st.add(78);
        st.add(25);
        st.add(96);
        st.add(12);

        System.out.println(st);

        /** can not add duplicate values **/
//        st.add(45);
//        System.out.println(st);

        /** remove **/
        st.remove(12);
        System.out.println(st);

        /** contains - to check element present or not **/
        /** contains **/
        System.out.println(st.contains(96));
        System.out.println(st.contains(100));

        /** isEmpty - checks isempty or not**/
        System.out.println(st.isEmpty());

        /** size - returns size of set **/
        System.out.println(st.size());

        /** clear - to clear set **/
        st.clear();
        System.out.println(st);






    }
}
