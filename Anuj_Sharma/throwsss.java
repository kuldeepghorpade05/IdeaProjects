

/** throws is basically a waring of a particular method that can throw an exception we
  can mention throws in function or method and warn programmer who is using that function
  or method so that he can try or catch that exception while using the function or method
 */

public class throwsss {
    public static void main(String[] args) {

        int[] arr = new int[5];


        try {
            System.out.println(getnumberfromarray(arr));
        }catch (Exception e){
            System.out.println("exception handled "+ e.getMessage());
        }

    }

    // how to use throws in function
    static int getnumberfromarray(int[] arr) throws ArithmeticException{
        return arr[7];
    }

}
