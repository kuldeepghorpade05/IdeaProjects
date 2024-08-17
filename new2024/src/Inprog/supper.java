package Inprog;

class animal{
    String color = "white";

    //super example using constructor
    animal(){
        System.out.println("animal is barking..");
    }
}

class dog extends animal{
    String color = "brown";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    dog(){
        super();
        System.out.println("dog is barking..,");
    }

}

public class supper {
    public static void main(String[] args) {

//        dog d1 = new dog();
//        d1.printcolor();



    }
}
