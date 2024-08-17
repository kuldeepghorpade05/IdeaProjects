package Inprog;

abstract class car{
public void run(){
    System.out.println("running...");
}
public abstract void eat();

}

class tata extends car{
  public void eat(){
      System.out.println("eating..");
   }
}

public class abstractionInPro {
    public static void main(String[] args) {
        tata c1 = new tata();
      c1.eat();
      c1.run();
    }
}
