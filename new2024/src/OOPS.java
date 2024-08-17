import java.util.*;
import java.util.Scanner;
import mynewpack.*;




class fruit{
    String name;
    String color;

    void show(){
        System.out.println("name : "+ name);
        System.out.println("color : "+ color);
    }


}

class A{
  int a;
    String st;
    A(){
        a=78;
        st = "kuldee";
    }
}

class  hero{

    private int health;
    public char level;

    void print(){
        System.out.println(level);
    }

    int getHealth(){
        return health;
    }

    char getLevel(){
        return level;
    }

    void setHealth(int h){
        health = h;
    }

    void setLevel(char ch){
        level = ch;
    }


}

class employee{
    int empid = 451;
    int basicsal = 20000;
    int insentive  = 5000;

    String empname;

    void salary(){
        System.out.println(basicsal+insentive);
    }

    private int phone = 4574;

    int getPhone(){
        return phone;
    }

    employee(String name, int phno){
     phone = phno;
     empname = name;

    }

}


class gf{
    String sn = "ghorpade";
}

class f extends gf{
    String fn = "vkg";
}

class me extends f{
    String mn = "kuldeep";
}

class pen{
    String color ;
    String type ;

    public void printcolor(){
        System.out.println(this.color);
    }

}

class student{
    String name;
    int roll;
    int age;

    public void printInfo(String name){
        System.out.println(name);

    }
    public void printInfo(int age){
        System.out.println(age);

    }

    public void printInfo(String name, int age){
        System.out.print(name+" "+age);

    }

    /** non parametrzied constructor **/
//    student(){
//        System.out.println("constructor called");
//    }

    /** parametrzied constructor **/
//    student(String nam, int ag){
//       this.name = nam;
//       this.age = ag;
//    }



}

class person{
    String name;
    int age;

    void eat(){
        System.out.println(name+" "+"is eating");
    }

    void walk(){
        System.out.println(name+" "+"is walking");
    }

    void walk(int steps){
        System.out.println(name+" " +"walked"+ " "+ steps+" steps");
    }


}

abstract class car {

     public abstract void fly();
     public abstract void drive();

     public void playmusic(){
         System.out.println("playing music");
     }

}

abstract class wagonr extends car {

    public void drive(){
        System.out.println("driving");
    }


}

// concreate class
class wagonrnew extends wagonr{

    public void fly(){
        System.out.println("flying....");
    }

}

class studentk{

    int rollno;
    String name;
    float marks;

    double salary;

    /** simple constructer **/
//    studentk(){
//        rollno = 78;
//        name = "kuldeep";
//        marks = 47;
//    }

    //parameterized constructor
    studentk(int rollno, String name, float marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    // copy constructor
   /* studentk(studentk k3){
        this.name = k3.name;
        this.marks = k3.marks;
        this.rollno = k3.rollno;
    }*/

    //cnstructor overloading
   /* studentk(String name, double salary){

        this.name = name;
        this.salary = salary;
    }*/

    //constructor calling another constructor
    /*studentk(){
        this(45,"om",78);
    }*/


}






                      /** main **/
public class OOPS {
    public static void main(String[] args){

        System.out.println("kuldeep");

        //constructor calling another constructor
       /* studentk k7 = new studentk();
        System.out.println(k7.name);
        System.out.println(k7.rollno);
        System.out.println(k7.marks);*/

        // contructor overloading
        /*studentk k5 = new studentk("roney",7895425.45);
        studentk k6 = new studentk(78,"jkdhdh",45);

        System.out.println(k5.name+" "+ k5.salary);*/


        //parameterzed constructor
        //studentk k3 = new studentk(78,"vin",45);

        //copy contructor
        /*studentk k4 = new studentk(k3);
        System.out.println(k4.name);
        System.out.println(k4.rollno);
        System.out.println(k4.marks);*/


//        studentk k2 = new studentk(78,"ram",45);
//        System.out.println(k2.name+" "+k2.rollno+" "+k2.marks);





//        studentk k1 = new studentk();
//        System.out.println(k1.name);
//        System.out.println(k1.rollno);
//        System.out.println(k1.marks);


//        car w1 = new wagonrnew();
//        w1.playmusic();
//        w1.fly();
//        w1.drive();




//        person p1 = new person();
//        p1.age = 78;
//        p1.name = "rohit";
//
//        p1.eat();
//        p1.walk();
//        p1.walk(5);





//        fruit f1 = new fruit();
//        f1.color = "red";
//        f1.name = "apple";
//        System.out.println(f1.color);
//
//        f1.show();
//
//        fruit f2 = new fruit();
//        f2.color = "yellow";
//        f2.name = "banana";
//        System.out.println(f2.color);
//
//        f2.show();


//        hero ram = new hero();
//        System.out.println(ram.getHealth());

//        employee rohan = new employee();
//        System.out.println(rohan.getPhone());

//        demo d1 = new demo();
//        d1.print();

        /** parametrized constructor **/
        /*employee e1 = new employee("kuldeep",47899 );
        System.out.println(e1.empname);
        System.out.println(e1.getPhone());*/


//         me m1 = new me();
//         System.out.println(m1.sn);




//        pen p1 = new pen();
//        p1.color = "red";
//        p1.type = "ball";
//
//        pen p2 = new pen();
//        p2.color = "yellow";
//        p2.type = "gel";
//
//        p1.printcolor();
//        p2.printcolor();

//        student s1 = new student();
//        s1.name = "kuldeep";
//        s1.age = 45;
//        s1.roll = 74;
//
//        s1.printinfo();

//        student s1 = new student("kuldeep",45);
//        s1.printinfo();


//        student s1 = new student();
//        s1.name = "kuldeep";
//        s1.age = 15;
//        s1.printInfo(s1.name,s1.age);



        


           



































    }
}
