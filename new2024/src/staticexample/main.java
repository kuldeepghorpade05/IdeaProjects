package staticexample;

public class main {
    public static void main(String[] args) {

        human k1 = new human(22,"kuldeep",10000,false);
        human k2 = new human(24,"karan",7000,true);

        System.out.println(human.population);
        System.out.println(k2.population);

        greeting();
    }

   static void greeting(){

         System.out.println("hello world");
    }
}
