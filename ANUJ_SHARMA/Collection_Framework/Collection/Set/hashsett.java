package Collection_framework.Set;
import java.util.*;

/** SET - HASHSET **/

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

 - `HashSet`: Does not maintain insertion order, offers better performance
    for basic operations.
 - `LinkedHashSet`: Maintains insertion order, slight performance overhead
    due to linked list maintenance.

 **/

class student{
    String name;
    int roll_no;

    student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public String toString(){
        return "student{" +
                "name='"+ name+'\'' +
                ", roll_no="+roll_no +
                '}';
    }


}

public class hashsett {
    public static void main(String[] args) {


        Set<student> studentSet =  new HashSet<>();

        studentSet.add(new student("kuldeep",45));
        studentSet.add(new student("john",74));
        studentSet.add(new student("rohan",32));
        studentSet.add(new student("robin",98));
        studentSet.add(new student("jack",14));

        System.out.println(studentSet);











        Set<Integer> st = new HashSet<>();

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
