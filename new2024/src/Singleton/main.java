package Singleton;

import Fourfundamentals.Encapsulation.oop4;

public class main {
    public static void main(String[] args) {

        //singletonclass n1 = new singletonclass();
        //System.out.println(n1.a);

        singletonclass obj = singletonclass.getInstance();

        singletonclass obj1 = singletonclass.getInstance();

        singletonclass obj2 = singletonclass.getInstance();

        // all 3 ref variables are pointing  to just one object



    }
}
