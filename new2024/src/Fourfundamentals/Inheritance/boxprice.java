package Fourfundamentals.Inheritance;

public class boxprice extends boxweight {

    double cost;

   public boxprice(){
        super();
        this.cost = -1;
    }

  public boxprice(boxprice other){
        super(other);
        this.cost = other.cost;
    }


   public boxprice(double l, double h, double w, double weight, double cost){
        super(l,w,h,weight);
        this.cost = cost;
    }

   public boxprice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }




}
