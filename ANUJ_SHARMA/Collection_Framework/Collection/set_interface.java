package Collection_Framework.Collection;

import java.util.*;

class students{

    int rollno;
    String name;

    public students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        students students = (students) o;
        return rollno == students.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}



public class set_interface {

    public static void main(String[] args) {

        // HASHSET O(1)
        // LINKEDHASHSET O(N)
        // TREESET O(LOG N)



        // Hashset - returns in unordered (no duplicates)
//        Set<Integer> st = new HashSet<>();
//
//        st.add(10);
//        st.add(45);
//        st.add(12);
//        st.add(69);
//        st.add(12);
//
//        System.out.println(st);

        // Linkedhashset -  returns in order which we have inserted (no duplicates)
//        Set<Integer> st = new LinkedHashSet<>();
//
//        st.add(10);
//        st.add(45);
//        st.add(12);
//        st.add(69);
//        st.add(12);
//
//        System.out.println(st);

        // TreeSet - returns in sorted order
//        Set<Integer> st = new TreeSet<>();
//
//        st.add(10);
//        st.add(45);
//        st.add(12);
//        st.add(69);
//        st.add(12);
//
//        System.out.println(st);


        Set<students> set = new HashSet<>();

        students s1 = new students(1,"anuj");
        students s2 = new students(1,"rohit");

        System.out.println(s1.equals(s2));


        set.add(new students(1,"kuldeep"));
        set.add(new students(2,"kuldeep"));
        set.add(new students(1,"kuldeep"));

        System.out.println(set);



    }
}
