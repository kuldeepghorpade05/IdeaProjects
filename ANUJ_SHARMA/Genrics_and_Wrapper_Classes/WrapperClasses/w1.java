package Genrics_and_Wrapper_Classes.WrapperClasses;

import java.util.*;

public class w1 {

    public static void main(String[] args) {

        // using wrapper classes

        // method 1
        //Integer obj1 = new Integer(23);

        // method 2
        Integer obj2 = Integer.valueOf(16);

        // method 3
        Integer obj3 = 45;  //Autoboxing

        /* the automatic conversion of primitive types to the object of their
         corresponding wrapper classe is known as autoboxing for ex conversion
         of int to Interger, long to Long
         */

        // example of unboxing
        int age = obj2;
        /* it is just the reverse process of autoboxing. automatically converting an
        object of a wrapper class to its corresponding primitive type is known as unboxing.
        for ex coversion of Interger to int, Long to long */

//        Integer objj = Integer.valueOf("12");
//        System.out.println(objj*2);

        // valueof
        Boolean b1 = Boolean.valueOf(true);
        System.out.println(b1);



    }
}
