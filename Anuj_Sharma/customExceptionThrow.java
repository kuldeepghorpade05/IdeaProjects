import java.util.Scanner;

/** to create custom exception we can create and use throw **/

public class customExceptionThrow {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter age : ");

        try {
            int age = sc.nextInt();
            if (age > 100) {
                //using mycreatedexception
                throw new mycreatedexception("my error is this");
//                throw new ArithmeticException("more than 100 not allowed");
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }


}

class mycreatedexception extends Exception{
    public mycreatedexception(String message){
        super(message);
    }

}
