import java.util.Scanner;

public class lecEight {

    /** Q1 avarage of 3 numbers **/
    /*public static double average(double numb1, double numb2, double numb3 ) {
        double averagesum = (numb1+numb2+numb3)/3;
        return averagesum;
    }*/


    /** Q2 sum of odd numbers **/
   /* public static int oddsum(int n) {

        int sum = 0;
        for (int i=1; i<=n; i++ ){

            if ( i%2!=0 ){
                sum = sum+i;
            }
        }
        return sum;
    }*/


    /** Q3 retuen greater number **/
   /* public static int greaternumb(int a , int b) {

        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);

        }
        return 1;
    }*/

     /** Q4 cicumference of circle **/
     /*public static double circlediameter(double n) {
      double diameter = (22*n*n)/7;
      return diameter;
     }*/

     /**  Q5 age to vote **/
    /* public static int voteage(int a) {
         if (a>18){
             System.out.println("eligible for voting");
         }else {
             System.out.println("not eligible for voting ");
         }
         return 1;
     }*/

     /** Q8 calculate power of number **/
     /*public static int power(int x, int n) {

         int result = 1;
         for (int i=1; i<=n; i++ ){
             result= result*x;
         }
         System.out.print("x to the power n is : "+result);
         return 1;
     }*/


    /** Q9 GCD calculator **/
   /* public static int gcd(int n1, int n2) {

        while ( n1 != n2 ){

            if ( n1>n2 ){
                n1 = n1-n2;
            }else {
                n2 = n2-n1;
            }
        }
        System.out.print("GCD IS : ");
        return n2;
    }*/






    public static void main(String[] args) {

        /** Q1 avarage of 3 numbers **/
        /*Scanner sc = new Scanner(System.in);
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        int numb3 = sc.nextInt();

        System.out.println(average(numb1,numb2,numb3));*/


        /** Q2 sum of odd numbers **/
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(oddsum(n));*/

        /** Q3 retuen greater number **/
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        greaternumb(a,b);*/

        /** Q4 cicumference of circle **/
       /* Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        System.out.println(circlediameter(n));*/


        /**  Q5 age to vote **/
        /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        voteage(a);*/

        /** Q6 infinite do while loop **/
        /*do{
            System.out.println("kuldeep");
        }while(true);*/

     /** Q7 positive negative zeros entered **/

        /**Write a program to enter the numbers
         till the user wants and at the end it should display the count of
         positive, negative and zeros entered. **/


       /*int positive = 0; int negative = 0; int zeros = 0;
        System.out.println("press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input ==1){
            System.out.println("enter your number");
            int number = sc.nextInt();

            if (number > 0) {
                positive++;
            } else if (number<0) {
                negative++;
            }else {
                zeros++;
            }

            System.out.println("press 1 to continue and 0 to stop");
            input = sc.nextInt();
        }

        System.out.println("positive numbers entered : "+ positive);
        System.out.println("negitive nubers entered : " + negative);
        System.out.println("zeros entered : " + zeros);*/



        /**  apana clg java mini project 1 shot **/
        //mini project

      /* Scanner sc = new Scanner(System.in);
      int mynumber = (int)(Math.random()*100); // function to genrate random number
      int usernumber = 0;

      do {
        System.out.println("guess my number(1-100) : ");
         usernumber = sc.nextInt();

        if (usernumber == mynumber){
            System.out.println(" wohooo.... correct number!!!");
            break;
        } else if (usernumber > mynumber) {
            System.out.println("your number is too large");
        }else {
            System.out.println("your number is too small");
        }
      }while (usernumber >0 && usernumber<100 );

        System.out.print("my number was : ");
        System.out.println(mynumber);*/


      /** Q8 calculate power of number **/
       /*Scanner sc = new Scanner(System.in);
        System.out.println("enter x : ");
        int x = sc.nextInt();

        System.out.println("enter n : ");
        int n = sc.nextInt();

        power(x,n);*/



       /** Q9 GCD calculator **/
        /*Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(gcd(n1,n2));*/

















    }
}
