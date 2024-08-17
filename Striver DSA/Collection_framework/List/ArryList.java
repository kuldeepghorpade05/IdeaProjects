package Collection_framework.List;

/** LIST - ARRAYLIST **/

import java.util.*;

/** 1. remove
    2. remove
    3. clear
    4. set
    5. size

    1. add
    2. add(x,y)
    3. addall
    4. get
    5. contains

 3 types of iterators : -

    1. using for loop
    2. for each loop
    3. iterator

 **/

public class ArryList {

    public static void main(String[] args) {


//        ArrayList<String> studentname = new ArrayList<>();
          /** add **/
//        studentname.add("rakesh");
//        studentname.add("rohan");
//        studentname.add("ritesh");
//        System.out.println(studentname);

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(45);
//        numbers.add(78);
//        numbers.add(36);
//        System.out.println(numbers);
//
//        numbers.add(25);
//        System.out.println(numbers);
//
          /** add to specific index **/
//        numbers.add(2,85);
//        System.out.println(numbers);
//
//        List<Integer> newnumbers = new ArrayList<>();
//        newnumbers.add(150);
//        newnumbers.add(789);
//
         /** to addall elements to other list **/
//       numbers.addAll(newnumbers);
//        System.out.println(numbers);
//
//        System.out.println(newnumbers.get(1));

        List<Integer> num3 = new LinkedList<>();
        num3.add(45);
        num3.add(58);
        num3.add(23);
        num3.add(12);
        num3.add(54);
        num3.add(69);

        System.out.println(num3);

        /** remove by index **/
//        num3.remove(2);
//        System.out.println(num3);

        /** remove by value **/
//        num3.remove(Integer.valueOf(54));
//        System.out.println(num3);

        /** clear all list **/
//        num3.clear();
//        System.out.println(num3);

        /** set **/
//        num3.set(3,788);
//        System.out.println(num3);

        /** contains **/
        //System.out.println(num3.contains(788));

        /** 1 using for loop **/
//        for (int i = 0; i <= num3.size() - 1; i++) {
//            System.out.println(num3.get(i));
//        }

        /** 2 for each loop **/
//        for(Integer i : num3){
//            System.out.println(i);
//        }

        /** 3 Iterator **/
//        Iterator<Integer> it = num3.listIterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }














   }
}
