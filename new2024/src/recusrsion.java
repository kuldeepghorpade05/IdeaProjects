import java.util.*;
import java.util.Scanner;

/** RECURSION **/
public class recusrsion {

    public static void printnumb(int n){
        //base case
        if(n==0)
            return;

        System.out.println(n);
        printnumb(n-1);

    }

    //print sum of n natural numbers
    public static void printsum(int i, int n, int sum){

        //base case
        if(i==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
            sum+=i;
            printsum(i+1,n,sum);

    }

    public static int fact(int n){

        //base case
        if(n==0) {
            return 1;
        }

        return  n *  fact(n-1);
    }

    //power

    public static int pow(int n){
        //base
        if(n==0){
            return 1;
        }

        int sp = pow(n-1);
        int bp = 2 * sp;

        return bp;
    }

    public static void num(int n){
        //base
        if(n==0){
            return;
        }

        //head recursion
        num(n-1 );
        System.out.println(n);

    }


    // fib recusion tech01
    public static int fib(int n){

        //base
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int num1 = fib(n-1);
        int num2 = fib(n-2);
        int fibn = num1 + num2;

        return fibn;

    }

    // fib recusion tech01
    public static int fib2(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }else {
            return fib2(n-1) + fib2(n-2);
        }
    }

    //using iteration
    public static void fibI(int n){

        int[] fib = new int[n+1];

        fib[0] = 0;
        fib[1] = 1;

        System.out.print("0\t"+"1\t");

        for(int i=2; i<=n; i++ ){
            fib[i] = fib[i-1] + fib[i-2];
            System.out.print(fib[i]+"\t");
        }

    }

    public static void saydigit(int n, String arr[]){

        //base case
        if(n==0){
            return;
        }

        //processing
        int digit = n % 10;
        n = n/10;

        //recursive call
        saydigit(n,arr);
        System.out.print(arr[digit]+" ");
    }





/** ------------------------------------------------------------------------------------------------------ **/

  public static void main(String[] args){



    // printnumb(5);

    //printsum(1,5,0);

      //System.out.println(fact(5));

     // System.out.println(pow(5));

     //num(10);

      //System.out.println(fib(10));

      //System.out.println(fib2(10));

      //fibI(10);

     /* String[] arr = {"zero", "one", "two", "three","four", "five","six","seven","eight","nine","ten"};


      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      System.out.println();
      saydigit(n,arr);
      System.out.println();*/























        
    }
}
