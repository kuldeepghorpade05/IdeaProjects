package Fourfundamentals.polymorphism;


/** constructor overriding doesnt support in java instead it supports
     constructor chaining below is the example **/

/**  In Java, constructor overriding doesn't work in the same way as
      method overriding. Inheritance allows a subclass to inherit the
      constructors of its superclass, but it doesn't provide a mechanism
       for a subclass to override the constructor of its superclass.

      However, constructors in a subclass can call the constructors of
       their superclass using the super keyword. This is a form of
       constructor chaining, and it allows a subclass to reuse the
       initialization code from its superclass. Here's a simple example: **/

import Fourfundamentals.Inheritance.box;
import Fourfundamentals.Inheritance.boxweight;

/** contructor chainning **/
/*class Superclass {
    int x;

    Superclass(int x) {
        this.x = x;
        //System.out.println("Superclass constructor");
    }
}

class Subclass extends Superclass {
    int y;

    Subclass(int x, int y) {
        super(x); // Call the constructor of the superclass
        this.y = y;
       // System.out.println("Subclass constructor");
    }
} */

class numbers{
    double sum(double a, int b ){
        return a + b;
    }

    double sum(int a, int b){
        return a+b;
    }


    int sum(int a, int b, int c){
        return a+b+c;
    }




}

public class main {
    public static void main(String[] args) {

       // shapes shape = new shapes();
        //circle circle = new circle();
//        square square = new square();
//        trinagle tri = new trinagle();

       // shape.area();
        //circle.area();
       // tri.area();
//        square.area();

//        shapes square1 = new square();
//        square.area();

        /** contructor chaning example **/
        /*Subclass obj = new Subclass(10, 20);
        System.out.println(obj.x+" "+obj.y); */


//        numbers ob1 = new numbers();
//        System.out.println(ob1.sum(4,7));
//        System.out.println(ob1.sum(7,5,6));
//        System.out.println(ob1.sum(7,6));


        /* parent obj = new chils(); ==> here which method
        will be called depends on the this thing called as upcasting */
       //  shapes circle = new circle();
        // circle.area();






    }
}
