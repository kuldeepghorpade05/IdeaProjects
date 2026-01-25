package Exception_Handling.Runtime_Exception;

// Exception - to handle all type of exceptions

// ArrayIndexOutOfBoundsException
// ArithmeticException
// NullPointerException
// Exception_Handling.Runtime_Exception.IOException
// RuntimeException


public class Runtime01 {
    public static void main(String[] args) {

        int[] arr = new int[5];

        System.out.println("helooooooo guys");




        // array out of bound exception and ArithmeticException
//        try {
//            int result = 5/0;
//            System.out.println(arr[7]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("tried to acces the out of bound element");
//        }catch (ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }

        // array out of bound exception and ArithmeticException (other way)
//        try{
//            int result = 5/0;
//            System.out.println(arr[8]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("handling the exception");
//        }catch (ArithmeticException e){
//            System.out.println("handling the exception");
//        }


        // ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException
//        try{
//            int result = 5/0;
//            System.out.println(arr[8]);
//        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
//            System.out.println("handling the exception");
//        }catch (RuntimeException e) {
//            System.out.println("Runtime exception handled");
//        }

        // EXCEPTION -  TO HANDLE ALL TYPE OF EXCEPTION
        try{
            int result = 5/0;
            System.out.println(arr[8]);
        }catch(Exception e){
            System.out.println("handles all exception");
        }



        System.out.println("heloo");


//        System.out.println();
//        try{
//            int result = 5/0;
//        }catch (ArithmeticException e){
//            System.out.println("tried dividing a number by 0 ");
//        }
//
//        System.out.println("endedddddd");



    }
}
