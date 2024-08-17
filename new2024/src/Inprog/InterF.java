package Inprog;

//MULTIPLE INHERITANCE IN JAVA
interface A1{
    //the methods are by default public and abstarct
    void start();
}

interface  B1{
    void start();
}

class C implements A1,B1{
    @Override
    public void start(){
        System.out.println("starting..");
    }
}


public class InterF {

 /**
  • An interface can be used when we want to achieve 100% abstraction. On the
    other hand, abstract classes can be used to achieve anything between 0-100%
    abstraction.

  • An interface cannot have constructors because we cannot create objects of an
    interface.

  • If you want a class to achieve multiple inheritances, there is only one way:
    interfaces.

  • If an interface is made private, or if the methods in it are made private or
    protected, then a compilation error will be thrown.

  • Interfaces can be used to enforce a contract- that is, provide a specification
  that classes must implement certain methods if they want to use that interface

  • Interfaces are used to achieve multiple inheritance

  • Interfaces can be used to achieve loose coupling - With interfaces, we can ensure
  that changes in one class do not affect other classes.  **/

 public static void main(String[] args) {

     C obj = new C();
     obj.start();
 }


}
