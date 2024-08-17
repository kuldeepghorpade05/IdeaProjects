import java.util.*;
import java.util.Scanner;




/** FUNCTIONS **/
public class functions2024 {

    /** prints name **/
    public static void printName(String name){
        System.out.println(name);
    }

    /** sum **/
    public static int sum(int a, int  b){
     int sum = a+b;
     return sum;
    }

    /** factorial **/
    public static int factL(int a ){
        int count = 1;

        for(int i=a; i>=1; i--){
            count = count * i;
        }

        return count;
    }

    /** average of 3 **/
    public static int average(int a, int b, int c){

        return (a+b+c)/3;


    }

    /** sum of n odd numbers **/
    public static int odd(int n){
        int count = 0;
        for(int i=1; i<=n; i++ ){

            if(i % 2 != 0){
                count = count + i;
            }
        }
        return count;
    }

    /** circumfernce of circle **/
    public static double circum(double r){

        double sum = 3.14 * 3.14 * r ;
         return sum;
    }

    /** counts +ve -ve zero **/
    public static void countNumbers() {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        scanner.close();
    }


    /** power func in java **/
    public static double power1(double x, double y){

        return Math.pow(x, y);

    }


    /** power without func **/
    public static int por(int b, int p){

        int mul = 1;

        for(int i=1; i<=p; i++ ){
            mul *= b;
        }
        return mul;
    }

   /** sum of odd **/
    public static int sumn(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                count = count + i;
            }

        }
        return count;
    }

 /** check prime numbers  **/
    public static int prime(int n){

        int count = 0;
        for(int i=2; i<=n-1; i++ ){
            if(n%2==0){
                count = count+1;
            }
        }
        if(count>0){
            System.out.println("is not prime number");
        }else{
            System.out.println("is a prime number");
        }
        return n;
    }

 /** table **/
     public static void tab (int n){
         for(int i=1; i<=10; i++ ){
             System.out.println(i*n);
         }
     }

    /** gcd greatest common divisor (HCF) **/
     public static int gcd(int n, int m){
         int gcd = 0;

        for(int i=1; i<=n && i<=m; i++ ){

            if( n%i==0 && m%i==0 ){
                gcd = i;
            }
        }
        return gcd;
     }

     /** gcd using euclidian algorithm **/
    public static int gcdr(int a, int b){
        if(b==0){
            return a;
        }else if(a<b){
            return (gcdr(b,a));
        }else{
            return (gcdr(b,a % b));
        }
    }



  /** square root **/
    public static int sqr(int n){
        return n*n;
    }

    /** check +ve -ve even odd **/
    public static void check3(int n){
       if(n>0){
           System.out.println("positive");
           if(n%2==0){
               System.out.println("even");
           }else {
               System.out.println("odd");
           }
       }else{
           if(n<0){
               System.out.println("negative");
               if(n%2==0){
                   System.out.println("even");
               }else {
                   System.out.println("odd");
               }
           }
       }
    }

/** checks upper case or lower **/
    public static  void alp(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        }else{
            System.out.println("invalid");
        }
    }

    /** input until user enters odd numb **/
    public static void doo(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number");
            int n = sc.nextInt();

            if(n%2==0){
                break;
            }

        }while(true);
    }

 /** gst 18% with mrp **/
    public static double gst(double value){
        value = value + (0.18 * value);

        return value;
    }

    /** celsius to farniet **/
    public static double celtofar(double celsius){
        double far = ((9.0/5.0)*celsius) + 32;
        return far;
    }


    /** Fibonacci using Recursion **/
    public static long Fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    /** fibnacchi using recursion **/
    public static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        int num1 = fib(n-1);
        int num2 = fib(n-2);
        int fibn = num1 + num2;

        return fibn;
    }

    /** print all fibo until n  using iterartion **/
    public static void fibSeries(int n) {

        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        System.out.print("0\t1\t");

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + "\t");
        }
    }




/** ------------------------------------------------------------------------------------------------------------------------------- **/

/** MAIN  **/
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

        System.out.println(Fibonacci(6));



    //fibSeries(10);
        // System.out.println(fib(10));

    //String name = sc.nextLine();
    //printName(name);

        //sum
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a,b));*/

        //factorial
        /*int a = sc.nextInt();
        int fact = factL(a);
        System.out.println(fact);*/

        //average
        /*int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ave = average(a,b,c);
        System.out.println(ave);*/


        //n odd sum
       /*int n = sc.nextInt();
       int odda = odd(n);
        System.out.println(odda);*/

       /* double r = sc.nextDouble();
        double cir = circum(r);
        System.out.println(cir); */

      /** counts positive negative and zeros **/
       // countNumbers();

         //power - base
        //System.out.println(power1(2,5));

        // function to return 2^5
       // System.out.println(por(2,5));


      //  System.out.println(hcf(20,14,62));


        //System.out.println(sumn(10));

        //prime(14);

      // tab(5);

        // gcd using iteration
        //System.out.println(gcd(57,69));

        // gcd using euclidian algo (recursion)
        //System.out.println(gcd(57,69));


        //System.out.println(sqr(5));


        //check3(-88);


       // alp('D');

       //doo();

//        for(int i=1; i<=10; i++ ){
//            if(i==6){
//                continue;
//            }
//            System.out.println(i);
//        }


       // System.out.println(gst(478));


        //System.out.println(celtofar(78));





        /** fibonacci calls **/

        //System.out.println(Fibonacci(10));

        //fibSeries(10);

        //System.out.println(fib(10));


















    }
}
