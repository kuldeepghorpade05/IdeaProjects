package Fourfundamentals.Interfaces_Abstraction;

/** interface **/
interface car1{
    public void start();
}

/** class using interface **/
class elecar implements car1{
    @Override
    public void start(){
        System.out.println("electeric starting");
    }
}

/** class using interface **/
class disel implements car1{
    @Override
    public void start(){
        System.out.println("disel car starting");
    }
}



public class interfaces {
    public static void main(String[] args) {

        car1 tesla = new elecar();
        car1 xuv700 = new disel();

        tesla.start();
        xuv700.start();


    }
}
