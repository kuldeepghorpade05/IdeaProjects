package Collection_framework.Set;
import java.util.*;

/** SET - LINKEDHASHSET **/

/**
 *
 1. add
 2. remove
 3. contains
 4. isEmpty
 5. size
 6. clear

 **/

/** same as hashset but inserts values in order **/

/** `HashSet` and `LinkedHashSet` are both implementations of the `Set` interface in Java, but they have some differences in terms of their behavior and performance characteristics.

 1. **Ordering**:
 - `HashSet`: Does not maintain any specific order of elements. The elements are stored in a hash table and the order is not guaranteed.
 - `LinkedHashSet`: Maintains the insertion order of elements. It uses a doubly linked list to maintain the order of elements along with a hash table for fast retrieval.

 2. **Performance**:
 - `HashSet`: Provides constant-time performance for basic operations such as add, remove, contains, and size, assuming the hash function disperses the elements properly among the buckets.
 - `LinkedHashSet`: Provides constant-time performance for basic operations as well, but slightly slower compared to `HashSet` due to the additional overhead of maintaining the linked list.

 3. **Iteration**:
 - `HashSet`: The order of iteration is not guaranteed. If you iterate over a `HashSet`, you may get elements in an arbitrary order.
 - `LinkedHashSet`: Iterating over a `LinkedHashSet` will give you elements in the order they were inserted.

 4. **Memory overhead**:
 - `HashSet`: Generally has lower memory overhead compared to `LinkedHashSet` due to the absence of additional pointers to maintain the insertion order.

 5. **Implementation**:
 - `HashSet`: Implemented using a hash table.
 - `LinkedHashSet`: Implemented using a combination of a hash table and a linked list.

 In summary, if you need to maintain the insertion order of elements and still want the benefits of constant-time performance for basic operations, you can use `LinkedHashSet`. Otherwise,
 if insertion order is not important and you prioritize performance, `HashSet` might be a better choice. **/

public class LinkedHashSett {
    public static void main(String[] args) {

        Set<Integer> st = new LinkedHashSet<>();

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
