package staticexample;

public class  staticblock {

    static int a = 8;
    static int b;

    //static block
    static{
        System.out.println("im into static...");
        b = a*2;
    }

    public static void main(String[] args) {

        staticblock obj = new staticblock();
        System.out.println(staticblock.a + " " + staticblock.b);


        staticblock.b += 3;
        System.out.println(staticblock.a + " " + staticblock.b);

        staticblock.b += 3;
        System.out.println(staticblock.a + " " + staticblock.b);










    }
}
