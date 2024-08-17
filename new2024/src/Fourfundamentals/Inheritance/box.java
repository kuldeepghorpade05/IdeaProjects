package Fourfundamentals.Inheritance;


public class box {

    private double l;
    double h;
    double w;

    //getter method in encapsulation
    public double getL(){
        return l;
    }


    //non parameterzied contructor
   public box(){
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    //cube
  public box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

  public box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

   public box(box other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }

    public void info(){
        System.out.println("running the box...");
    }


    // we can  inherit static methods but cannot be overrided
    static void greetings(){
        System.out.println("im in box class");
    }



}



