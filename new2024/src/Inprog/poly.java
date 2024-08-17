package Inprog;

/** overloading **/
class Aa{
   public static int p1(int m, int n){
        return m+n;
    }

   public static int p1(int m, int n, int u){
        return m+n+u;
    }

    public static String p1(String m, String n, String u){
        return m+n+u;
    }

}

/** overriding **/

class bank{
    void rateofintrest(){
        System.out.println("default..");
    }

}

class sbi extends bank{
    @Override
    void rateofintrest(){

        System.out.println("7%");
    }

    sbi(){
        this.rateofintrest();
    }

}

class hdfc extends bank{
    @Override
    void rateofintrest(){
        System.out.println("9%");
    }

    hdfc(){
        this.rateofintrest();
    }

}

class pnb extends bank{
    @Override
    void rateofintrest(){

        System.out.println("10%");
    }

    pnb(){
        this.rateofintrest();
    }

}





public class poly {
    public static void main(String[] args) {
//        System.out.println(Aa.p1(7,8));
//        System.out.println(Aa.p1(7,5,2));
//        System.out.println(Aa.p1("ku","lde","ep"));

//        bank sbi = new sbi();
//        bank hdfc =  new hdfc();
//        bank pnb = new pnb();







      /** > Compile Time Polymorphism : -
        In Compile time Polymorphism, the call is
        resolved by the compiler.

        > It is also known as Static binding, Early binding
        and overloading as well.

       > Method overloading is the compile-time
        polymorphism where more than one methods
        share the same name with different
        parameters or signature and different return
        type.

       > It is achieved by function overloading and
        operator overloading.
        It provides fast execution because the method
        that needs to be executed is known early at
        the compile time.

        > Compile time polymorphism is less flexible as
        all things execute at compile time.
        Inheritance is not involved.

        Run time Polymorphism : -

        > In Run time Polymorphism, the call is not
        resolved by the compiler

        > It is also known as Dynamic binding.
        Late binding and overriding as well.

        > Method overriding is the runtime
        polymorphism having the same method
        with same parameters or signature but
        associated withcompared, dir Pell up for pr
        classes.

        > It is achieved by virtual functions and
        pointers.

        > It provides slow execution as compare to
        early binding because the method that
        needs to be executed is known at the
        runtime.

        > Run time polymorphism is more flexible as
        all things execute at run time
        Inheritance is involved. **/


    }
}
