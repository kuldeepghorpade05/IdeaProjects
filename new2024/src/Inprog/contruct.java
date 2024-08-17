package Inprog;

 /** is contructor overriding possible in java ? **/

     /**   In Java, constructors cannot be overridden in the traditional sense
as methods are overridden. Constructor overriding is not supported, but
there is a concept called constructor chaining.
        In Java, a subclass constructor can call the constructor of its
superclass using the super() keyword. This is a way of reusing the code in
the superclass constructor. However, it's important to note that this is
not exactly the same as constructor overriding. The subclass constructor
doesn't replace the superclass constructor; instead, it complements it. **/

 class one{
          private int agee;
          private String name;

          one(int agee, String name){
               this.agee = agee;
               this.name = name;

               System.out.println(agee+name);
          }


     }



public class contruct {
     int a;
     String b;

     contruct(int a, String b){
      this.a = a;
      this.b = b;
          //System.out.println("initialized const");
     }

     contruct(contruct other){
          this.a = other.a;
          this.b = other.b;
          System.out.println("copy const");
     }





          public static void main(String[] args) {
              // contruct c1 = new contruct(45,"manas");
               //System.out.println(c1.a+" "+ c1.b);

//               contruct c2 = new contruct(c1);
//               System.out.println(c2.a+" "+ c2.b);

               one c6 = new one(45,"kuldeep");











          }
}
