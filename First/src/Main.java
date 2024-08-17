import java.util.Scanner;

public class Main {

     /** functions **/

     /** name **/
   /* public static void printMyName(String xyz) {
        System.out.println(xyz);
        return;
    }*/

     /** addition **/
     /*public static int printNumber(int a, int b) {
         int sum = a+b;
         return sum;
     }*/

     /** multiply **/
     /*public static int multiplyNumbers(int x,int y) {
         int sum = x*y;
         return sum;
     }*/

     /** divide **/
     /*public static float divNumb(float a, float b) {
         return a/b;
     }*/

     /** factorial **/
    /* public static void factoNmub(int n) {

         if (n<0){
             System.out.println("invalid number");
             return;
         }

         int numb =1;
         for (int i=n; i>=1; i-- ){
         numb = numb*i;
         }
         System.out.println(numb);
         return;

     }*/

     /** even numb **/
     /*public static int evenNumb(int n) {
         if (n%2==0){
             System.out.println("even");
         }else {
             System.out.println("odd");
         }
         return 1;
     }*/

     /** prime number **/

    /* public static void primrNumber(int n) {

         int count = 0;
         for (int i=2; i<=n-1; i++ ){
             if ( n%i==0 ){
                 count= count+1;
             }
         }
         if ( count>0 ){
             System.out.println(n+ " IS NOT A PRIME NUMBER");
         }else {
             System.out.println(n+ " IS PRIME NUMBER");
         }

     }*/

     /** print table **/
    /* public static int printTable(int n) {
         for (int i=1; i<=10; i++ ){
             System.out.println(n+ "*"+ i+ "="+ n*i);
         }
         return 1;
     }*/




    public static void main(String[] args) {
        /** name **/
        /*Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);*/

        /** addition **/
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printNumber(a,b));*/

        /** multiply **/
        /*Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

       // System.out.println(multiplyNumbers(x,y));
              //OR
        int sum =multiplyNumbers(x,y);
        System.out.println(sum);*/


        /** divide **/
        /*Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println(divNumb(a,b));*/


        /** factorial **/
        /*Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        factoNmub(n);*/

        /** even numb **/
       /* Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        evenNumb(n);*/

        /** prime number **/
        /*Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        primrNumber(n);*/

     /** print table **/
     /*Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     printTable(n);*/







    }
}




























