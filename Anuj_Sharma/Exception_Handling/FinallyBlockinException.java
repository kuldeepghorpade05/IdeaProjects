package Exception_Handling;


public class FinallyBlockinException {
    public static void main(String[] args) {

        int[] arr = new int[5];

//        System.out.println("heloooo world");


         //finally
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println("exception handled");
        }finally {
            System.out.println("i will always run");
        }
        System.out.println("good byeee");


//        try {
//            System.out.println(getnumberfromarray(arr));
//        }catch (Exception e){
//            System.out.println("exception handled "+ e.getMessage());
//        }

    }

    // how to use throws in function
//    static int getnumberfromarray(int[] arr) throws ArithmeticException{
//        return arr[7];
//    }

}
