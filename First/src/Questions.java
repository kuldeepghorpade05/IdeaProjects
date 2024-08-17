import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {

        /** Q print the sum of first n natural numbers **/
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for( int i=1; i<=n; i++){
          sum = sum + i;
        }
        System.out.println(sum);*/


       /** Q. Print all even numbers till n **/

        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        for ( int i = 1; i <= n; i++ ){
          if( i%2==0 ){
              System.out.println(i);
          }
        }*/

        /** Q. Print all odd numbers till n **/
         /*Scanner sc = new Scanner(System.in);
         System.out.println("enter your number : ");
         int n = sc.nextInt();

         for(int i=1; i<=n; i++){
             if( i%2!=0 ){
                 System.out.println(i);
             }
         }*/

        /**infinite loop**/
        /*for( ; ; ){
            System.out.println("kuldeep ghorpade");
        }*/


/**  Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
 If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
 If they enter 0 then stop.
 If he/ she scores :
 Marks >=90 -> print “This is Good”
 89 >= Marks >= 60 -> print “This is also Good”
 59 >= Marks >= 0 -> print “This is Good as well”
 Because marks don’t matter but our effort does.**/

//==>

      /*  Scanner sc = new Scanner(System.in);
        int input;

        do {
            int marks= sc.nextInt();

            if( marks >=90 && marks<=100 ){
                System.out.println("this is good");

            } else if ( marks>=60 && marks<=89 ) {
                System.out.println("this is also good");

            } else if ( marks>=0 && marks<=59 ) {
                System.out.println("this is good as well");
            }else {
                System.out.println("invalid");
            }

            System.out.println("want to continue?\n if yes press --> 1\n if no press --> 0");
            input = sc.nextInt();

        }while ( input==1 );*/


     /** hwq print number pyramid **/
        /*int n= 5;
        int i,j,k;

        //outer loop
        for ( i=1; i<=n; i++ ){
         //inner loop-->spaces
            for ( j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for ( k=1; k<=i; k++ ){
                System.out.print(i+" ");
            }
            System.out.println();

     }*/





















 }
}
