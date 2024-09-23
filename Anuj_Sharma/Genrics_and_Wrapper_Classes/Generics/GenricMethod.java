package Genrics_and_Wrapper_Classes.Generics;

// GENERIC METHOD

public class GenricMethod {
    public static void main(String[] args) {

        // 1st method
        printdata(45);
        printdata("heloooooooooo");

        System.out.println();

        // 2nd method
        GenricMethod obj = new GenricMethod();
//        obj.doubledata("jdjdjdj");
        obj.doubledata(452);


    }

    // 1st method
    //Generic method adv - no need of method overloading
    static <E> void printdata(E data){
        System.out.println(data);
    }

    // 2nd method
    <E extends Number> void doubledata(E data){
        System.out.println(data);
    }

}


