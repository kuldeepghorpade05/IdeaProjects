package Fourfundamentals.Interfaces_Abstraction;

interface A{
    int age = 45;
    String name = "john";

    void show();
    void config();
}

interface B {
    void run();
}

interface C extends A{
    void hit();
}

class alpha implements C,B{

    @Override
   public void show(){
        System.out.println("showing...");
    }

    @Override
    public void config(){
        System.out.println("configuring..");
    }

    @Override
    public void hit(){
        System.out.println("hitting..");
    }
    @Override
    public void run(){
        System.out.println("running..");
    }

}



public class telusinterface {
    public static void main(String[] args) {

    }
}
