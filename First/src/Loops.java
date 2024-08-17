import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {

        /**print table of number**/ // for loop
        /*Scanner sc = new Scanner(System.in);
         System.out.println("enter the number : ");
         int numb = sc.nextInt();

        for( int i=1; i<=10; i++){
            System.out.println( numb + "*" + i + "=" + i*numb );
        }*/


        /**loops - print hello world 12 times**/
        //for loop
        /*for( int i = 1; i<=12; i++){
            System.out.println("hello world");
        }*/

        /** while loop**/
       /* int i = 1;
        while( i<=12 ){
            System.out.println("hello world");
            i++;
        }*/

        /** print table using for loop **/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = sc.nextInt();

        int i = 1;
        while( i<=10){
            System.out.println( number + "*"+ i +"="+ i*number);
            i++;
        }*/

        /** do while loop **/

        /*int i = 1;
        do{
            System.out.println("hello world");
            i++;
        }while(i<=10);*/


        /**do while print table**/

        /*Scanner sc = new Scanner (System.in);
        System.out.println("enter the number : ");
        int number = sc.nextInt();

        int i=1;
        do{
            System.out.println( number+ "*"+ i+ "="+ i*number);
            i++;
        }while(i<=10);*/



       /* for (int i=1; i<=12; i++){
            System.out.println(i);
        }*/

        /*int i = 1;
        while( i<=12){
            System.out.println(i);
            i++;
        }*/

     /* int i=1;
      do{System.out.println(i);
      i++;
      }while(i<=12);*/

        /*int i=12;
        while(i<11){
            System.out.println("kuldeep");
        }*/

        /*int i=12;
        do{
            System.out.println("kuldeep");
        }while(i<11);*/


        // Q print the sum of first n natural numbers
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for( int i=1; i<=n; i++){
          sum = sum + i;
        }
        System.out.println(sum);*/


//  int a= 10;
//  int b= 5;
//
// // int ans = a*b/a-b;
//        int ans = (a*b)/(a-b);
//        System.out.println(ans);

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if( a==b ){
//            System.out.println("equal");
//        }else if( a>b){
//            System.out.println("a is greater");
//        }else{
//            System.out.println("a is lesser");
//        }


//        Scanner sc = new Scanner(System.in);
//        int button = sc.nextInt();
//
//        if(button==1){
//            System.out.println("hello");
//        } else if (button==2) {
//            System.out.println("namaste");
//        } else if (button==3) {
//            System.out.println("bonjour");
//        }else {
//            System.out.println("invalid button");
//        }



//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum= 0;
//        for(int i=1; i<=n; i++ ){
//            sum = sum + i;
//        }
//        System.out.println(sum);

        int n= 4;
        int m= 5;

        //outer loop
        for( int i=1; i<=n; i++){
            //inner loop
           for( int j=1; j<=m;j++){
               System.out.print ("*");
           }
            System.out.println();
        }
















    }
}
