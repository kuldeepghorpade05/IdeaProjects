package Fourfundamentals.Encapsulation;

import org.w3c.dom.ls.LSOutput;

/** wrapping up the implementation of the
 data members and methods in a class **/

public class encap {
  private int p;
  private int h;

  encap(){
      this.p = 54;
  }

  private void run(){
      System.out.println("running...");
  }

  public int getP(){
      return p;
  }

  public void setH(int newh){
      h = newh;
  }


}

class myemploye{
    private int id;
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public void setID(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }



}
