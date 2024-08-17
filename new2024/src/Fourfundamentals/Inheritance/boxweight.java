package Fourfundamentals.Inheritance;


//single inheritance
public class boxweight extends box {
    double weight;

  public  boxweight() {
        this.weight = -2;
    }

   public boxweight(boxweight other){
        weight = other.weight;
    }

   public boxweight(double l, double h, double w, double weight) {
       // super(l,h,w);
        this.weight = weight;
    }

   public boxweight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    // we can  inherit static methods but cannot be overrided
    static void greetings(){
        System.out.println("im in boxweight class");
    }

    /** overriding depends on object but
     static does not depends on object,
     hence static methods cannot be
     overwritten **/















}