import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


//Task03-
//        Given an integer, n, perform the following conditional actions:
//        If n is odd, print Weird
//        If n is even and in the inclusive range of 2 to 5, print Not Weird
//        If n is even and in the inclusive range of 6 to 20, print Weird
//        If n is even and greater than 20, print Not Weird
//        Complete the stub code provided in your editor to print whether or not  is weird.

public class HackerRank {
    public static void main(String[] args) {

      /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans ="";

        if( n %2 !=0){     //if( n %2 ==1){
            System.out.println("weird");        // ans="Weird";
        }else {
            if( n>=2 && n<=5 ){
                System.out.println("not weird");       //ans="Not Weird";
            }else if( n>=6 && n<=20 ){
                System.out.println("weird");          //ans="Weird";
            }else {
                System.out.println("not weird");     //ans = "Not Weird";
            }

        }*/

//-----------------------------------------------------------------------------------------------------------------

        //Task04
//Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//Input Format
//
//A single integer N
//
//Constraints
//  N >= 2 AND N <=20

//Sample Input
//
//2

//Sample Output
//
//2 x 1 = 2
//2 x 2 = 4
//2 x 3 = 6
//2 x 4 = 8
//2 x 5 = 10
//2 x 6 = 12
//2 x 7 = 14
//2 x 8 = 16
//2 x 9 = 18
//2 x 10 = 20



/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;*/

        /*public*/ class Solution {

            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int N = in.nextInt();
                for(int i = 1; i <=10; i++)
                {
                    System.out.println(N + " x "+i+" = "+i*N);
                }
            }
        }


























    }
}



