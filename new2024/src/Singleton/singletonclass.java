package Singleton;

public class singletonclass {

     int a = 7;

     private singletonclass(){

    }

    private static singletonclass instance;

     public static singletonclass getInstance(){
         if(instance == null ){
             instance = new singletonclass();
         }
            return instance;
     }


}
