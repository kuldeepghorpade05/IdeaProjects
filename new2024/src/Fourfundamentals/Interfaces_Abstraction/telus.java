package Fourfundamentals.Interfaces_Abstraction;

/** abstract class **/
abstract class car {

    public abstract void drive();
    public abstract void fly();

    public void playmusic(){
        System.out.println("playing music...");
    }

}

/** abstract class **/
abstract class wangonr extends car{

    @Override
    public void drive(){
        System.out.println("driving..");
    }

}

/** concreate class **/
class wagonr2 extends wangonr{

    @Override
    public void fly(){
        System.out.println("flying..");
    }
}

public class telus{
    public static void main(String[] args) {

        car w1 = new wagonr2();
        w1.drive();
        w1.playmusic();
        w1.fly();


    }
}

