import java.util.Scanner;
import java.util.Arrays;


public class PracticeC {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String ans = "";

        if( n %2!=0 ){  //if( n%2!=0 )
            System.out.println("weird");        // ans = "Weird";
        }else{
            if( n>=2 && n<=5 ){
                System.out.println("not weird");     //ans ="not weird";
            }else if( n>=6 && n<=20 ){
                System.out.println("weird");        //ans ="weird";
            }else{
                System.out.println("not weird");      // ans ="not weird";
            }
        }*/


        /*Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();


        System.out.println(i);
        System.out.println(d);
        System.out.println(s);*/

  /*int n = 4;
  //outer  loop
  for (int i=1; i<=n; i++ ){
      //inner loop
      for (int j=1; j<=n-1; i++){
          System.out.println(" ");
      }
      for( int j=1; j<=i; j++ ){
          System.out.println("*");
      }
      System.out.println();
  }*/


/** solid rectangle **/
       /* int n = 4;
        int m= 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("*"+"  ");
            }
            System.out.println("");
        }*/

/**hollow rectangle**/
    /* int n = 4;
     int m = 5;
     //outer loop
     for(int i=1; i<=n; i++){
         //inner loop
         for (int j=1; j<=m; j++){
             if( i==1 || j==1 || i==n || j==m ){
                 System.out.print("*"+" ");
             }else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }*/


/**pyramid**/
   /* int n=5;
    //outer loop
    for (int i=1; i<=n; i++){
        //inner loop
        for (int j=1; j<=i; j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }*/

        /**invrted half pyramid**/

       /* int n= 5;

        //outer loop
        for (int i=n; i>=1; i--){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/

        /**inverted and rotated half pyramid**/
        /*int n=5;

        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop -->spaces
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
            }
        //inner loop --->star
        for (int j=1; j<=i; j++){
            System.out.print("*");   //System.out.print("*"+" "); for triangle
            }
            System.out.println();
        }*/

/**half pyramid with numbers**/
       /* int n = 5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }*/

        /** invertedd half pyramid numbers **/

       /* int n = 5;
        //outer loop
        for (int i=n; i>=1; i--){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print (j+"   ");
            }
            System.out.println();
        }*/

        /** floyeds triangle**/


       /* int n = 5;
        int number = 1;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++ ){
                System.out.print( number+ " ");
                number++;
            }
            System.out.println();
        }*/

    /*int n =5;
    //outer loop
    for (int i=1; i<=n; i++ ){
        //inner--->space
        for (int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }*/

        //floyeds triangle
       /* int n=5;
        int number = 1;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }*/

       /* int n=5;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++){
                int sum =i+j;
                if ( sum%2==0 ){ //even
                    System.out.print("1"+" ");
                }else { //odd
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }*/


        /** triangle **/
       /* int n =5;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop--->space
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop--->star
            for (int j=1; j<=i; j++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/





      /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++ ){
            if ( i % 2 == 0 ){
                System.out.println(i);

            }
        }*/



       /* Scanner sc = new Scanner(System.in);
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



    /* int n = 4;
     int m = 5;

     //outer loop
     for (int i=1; i<=n; i++ ) {
         //inner loop
         for (int j = 1; j <= m; j++) {
             System.out.print("*"+" ");
         }
         System.out.println();
     }*/



       /* int n = 4;
        int m= 5;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=m; j++){
                if ( i==1 || j==1 || i==n || j==m ){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }*/


      /*  int n=5;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/



        /*int n=5;

        for (int i=n; i>=1; i-- ){
            //inner loop
            for (int j=1; j<=i; j++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/

       /* int n=6;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop for spaces
            for (int j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }
            //inner loop for star
            for (int j=1; j<=i; j++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/

      /* int n=4;
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loop--> space print
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //inner loop --->star print
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        /*int n= 5;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/


       /* int n=5;

        //outer loop
        for (int i=1; i<=n; i++ ) {
            //inner for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //inner loop  for numb
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/

     /*int n = 5;

     //outer loop
        for (int i=n; i>=1; i-- ){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/


        /*int n= 5;
        int number=1;

        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }*/

        /*int n= 5;
        int sum;

        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++ ){
                sum=i+j;
                if ( sum%2==0){
                    System.out.print("1"+" ");
                }else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }*/

        /** prime number checking program **/

        /*System.out.println("ENTER THE NUMBER : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

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
        }*/

        /** program to check prime number from n to m **/
      /*Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      for (int i=n; i<=m; i++ ) {
          int count = 0;
          //divide
          for (int j = 2; j * j <= i; j++) {
              if (i % j == 0) {
                  count++;
                  break;
              }
          }
          if (count == 0) {
              System.out.println(i);

          }

      }*/


/** print rhoumbus **/
       /* int n= 5;
        int i,j,t;

        //outer loop
        for ( i=1; i<=n; i++ ){
            //inner loop-->spaces
            for ( j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }

            //inner loop -->star
            for (t=1; t<=n; t++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/


        /** print butterfly pattern **/
         /*int n=4;

         //upper half
         for (int i=1; i<=n; i++ ){
             //1st half
             for (int j=1; j<=i; j++){
                 System.out.print("*");
             }
             //spaces
             int spaces =2*(n-i);
             for (int p=1; p<=spaces; p++){
                 System.out.print(" ");
             }
             //2nd part
             for (int k=1; k<=i; k++){
                 System.out.print("*");
             }
             System.out.println();
         }

         //lower half
        for (int i=n; i>=1; i-- ){
            //1st half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces =2*(n-i);
            for (int p=1; p<=spaces; p++){
                System.out.print(" ");
            }
            //2nd part
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /** mirror inverted rotated numbers half pyramid **/
        /*int n=4;

        for( int i=1; i<=n; i++ ){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for (int k=1; k<=i; k++ ){
                System.out.print(k);
            }
            System.out.println();
        }

        //other half
        for( int i=n; i>=1; i-- ){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for (int k=1; k<=i; k++ ){
                System.out.print(k);
            }
            System.out.println();
        }*/

        /** print hollow rhoumbus **/
      /* int n= 5;
       int m=5;

       for (int i=1; i<=n; i++ ){
           //spaces
           for (int j=1; j<=n-i; j++ ){
               System.out.print(" ");
           }

           //star
           for (int j=1; j<=n; j++ ){
               if ( i==1 || j==1 || i==n || j==m ){
                   System.out.print("*"+" ");
               }else {
                   System.out.print(" "+" ");
               }
           }
           System.out.println();
       }*/

        /**hollow solid **/
        /*int n=5;
        int m=5;

        for (int i=1; i<=n; i++ ){
            for (int j=1; j<=m; j++ ){
                if ( i==1 || j==1 || i==n || j==m ){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }*/

        /*System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count =0;
        for (int i=2; i<=n-1; i++ ){
        if ( n%i==0 )
          count = count+1;
        }

       if ( count>0 ){
       System.out.println(n+ "NOT A PRIME NUMBER");
       }else {
       System.out.println(n+  "PRIME NUMBER");
       }*/


        /*int n= 5;

        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++ ){
                int sum =i+j;
                if (sum%2==0){
                    System.out.print("1"+" ");
                }else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }*/

       /* int n= 5;

        for ( int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/


        /*int n=5;
        int number =1;
        //outer loop
        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=i; j++ ){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }*/


        /*int n= 5;

        for (int i=1; i<=n; i++ ){
            //inner loop
            for (int j=1; j<=n-i; j++ ){
                System.out.print(" "+" ");
            }

            for (int k=1; k<=n; k++ ){
                if ( i==1 || k==1 || i==n || k==n ){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }*/

       /* int n=5;

        //upper half
        for (int i=1; i<=n; i++ ){
            //1st part
            for (int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for (int k=1; k<=spaces; k++ ){
                System.out.print(" ");
            }
            //2nd part
            for (int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i=n; i>=1; i-- ){
            //1st part
            for (int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for (int k=1; k<=spaces; k++ ){
                System.out.print(" ");
            }
            //2nd part
            for (int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }*/






        /** N **/
        /*for (int row=1; row<=10; row++ ){
            for (int col=1; col<=10; col++ ){
                if (col==1 || col==10 || col==row ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


/** S **/
       /* for (int row=1; row<=10; row++ ){
            for (int col=1; col<=8; col++ ){
                if (row==1 || row==10 || row==10/2 ){
                    System.out.print("*"+" ");
                } else if ( row<10/2 && col==1 ) {
                    System.out.print("*");
                } else if (row>10/2 && col==8) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/

/**  V **/
      /*  int f=1;
        int s=16;

        for (int row=1; row<=8; row++) {
            for (int col = 1; col <= 16; col++) {
                if (col == f || col == s) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }

            }
            System.out.println();
            f++;
            s--;
        }*/

        /** I **/

       /* for (int row=1; row<=8; row++ ){
            for (int col=1; col<=8; col++ ){
                if ( row==1 || row==8 || col==8/2){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }*/


/** heart **/
     /*   for (int row=0; row<6; row++ ){
            for (int col=0; col<7; col++ ){
             if ( (row==0 && col%3!=0) || (row==1 && col%3==0) || row-col==2 || row+col==8 ){
                 System.out.print("*"+" ");
             }else {
                 System.out.print("  ");
             }

            }
            System.out.println();
        }*/



/** numberd pyramid 1 22 333 **/
/*        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }

            for (int k=1; k<=i; k++ ){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/


        /** palindromic numbers **/
       /* int n=5;
        //outer loop
        for (int i=1; i<=n; i++ ){
            //spaces
            for (int j=1; j<=n-i; j++ ){
                System.out.print(" "+" ");
            }
            //1st part
            for (int k=i; k>=1; k--){
                System.out.print(k+" ");
            }
            //2nd part
            for (int m=2; m<=i; m++ ){
                System.out.print(m+" ");
            }
            System.out.println();
        }*/

/** diamond pattern **/
        /*int n=5;
        for (int i=1; i<=n; i++ ){
            for (int k=1; k<=n-i; k++ ){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
        //2nd
        for (int i=4; i>=1; i-- ){
            for (int k=1; k<=n-i; k++ ){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }*/


        /** ulta triangle **/
       /* int n=6;
        for(int i=n; i>=1; i-- ){
           for (int j=1; j<=n-i; j++ ){
               System.out.print("  ");
           }
           for (int j=1; j<=2*i-1; j++ ){
               System.out.print("*"+" ");
           }
            System.out.println();
        }*/


        /** prime number **/

 /*Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();

 int count= 0;
 for (int i=2; i<=n-1; i++ ){
     if ( n%i==0 ){
         count=count+1;
     }
 }

 if (count>0){
     System.out.println("not a prime numner");
 }else {
     System.out.println("prime number");
 }*/




        /** palindromic numbers **/
      /* int n=5;
        //outer loop
        for (int i=1; i<=n; i++ ){
            //spaces
            for (int j=1; j<=n-i; j++ ){
                System.out.print(" "+" ");
            }
            //1st part
            for (int k=i; k>=1; k--){
                System.out.print(k+" ");
            }
            //2nd part
            for (int m=2; m<=i; m++ ){
                System.out.print(m+" ");
            }
            System.out.println();
        }*/

/** diamond pattern **/
      /* int n=5;
       //outer
        for (int i=1; i<=n; i++ ){
            //spaces
            for (int j=1; j<=n-i; j++ ){
                System.out.print("  ");
            }
            //1st half
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            //2nd half
            for (int p=2; p<=i; p++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower
        for (int i=4; i>=1; i-- ){
            //spaces
            for (int j=1; j<=n-i; j++ ){
                System.out.print("  ");
            }
            //1st half
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            //2nd half
            for (int p=2; p<=i; p++ ){
                System.out.print("* ");
            }
            System.out.println();
        }*/


        /*String name = "kuldeep";
        String name2=name.replace('d','b');
        System.out.println(name2);*/

          /*String name = "kuldeep and";
          System.out.println(name.substring(0,7));*/

       /* int[] marks =new int[3];
        marks[0]= 97;
        marks[1]= 87;
        marks[2]=98;
        //System.out.println(marks.length);

        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);*/

       // int[] marks ={97,87,78};

        /*int[][] finalmarks ={{92,74,76},{87,76,98}};
        System.out.println(finalmarks[1][0]);*/

        /*double price= 100.00;
        double finalprice = price + 18.00;

        int k =19;
        int h= k + (int) 41.00;
        System.out.println(h);*/

        /*final float pi= 3.14F;
        pi = 3.17F;*/

     /** apana clg java mini project 1 shot **/
     //mini project

     /*Scanner sc = new Scanner(System.in);
     int mynumber = (int)(Math.random()*100); // function to genrate random number
     int usernumber =0;

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
    }while (usernumber >0 );

        System.out.print("my number was : ");
        System.out.println(mynumber);*/


        /** radius **/
       /* Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius:");
        double radius = sc.nextDouble();

        double area = (22*radius*radius)/7;

        System.out.println("area of the circle is:" + area);*/

/** guessing number **/
        /*Scanner sc = new Scanner(System.in);
        int mynumber =(int)(Math.random()*100);
        int number = 0;

        do {
            System.out.println("guess any number from 1 - 100");
            number = sc.nextInt();

            if (number==mynumber){
                System.out.println("wohhhhh.....guessed it right");
                break;
            } else if (number>mynumber) {
                System.out.println("your number is too large");
            }else {
                System.out.println("your number is too small");
            }
        }while (number>0 && number<100 );

        System.out.print("the  number is : ");
        System.out.println(mynumber);*/

      /** positive negative zeros **/
       /*int postive=0; int negative=0; int zeros=0;
        System.out.println("press 1 to continue and 0 to exit");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input==1){
            System.out.println("enter your number : ");
            int number = sc.nextInt();

            if (number>0){
                postive++;
            } else if (number<0) {
                negative++;
            }else {
                zeros++;
            }

            System.out.println("press 1 to continue and 0 to exit");
            input = sc.nextInt();

        }

        System.out.println("positives entered : "+postive);
        System.out.println("negatives entered : "+negative);
        System.out.println("zeros entered : "+zeros);*/




       /** Q8 Two numbers are entered by the user, x and n.
         Write a function to find the value of one number raised
         to the power of another i.e. xn.**/


       /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("Enter n");
        int n = sc.nextInt();

        int result = 1;
        //Please see that n is not too large or else result
        // will exceed the size of int

        for(int i=1; i<=n; i++) {
            result = result * x;
                }

        System.out.println("x to the power n is : "+ result);*/




/*Scanner sc = new Scanner(System.in);

        System.out.println("enter your X : ");
        int x = sc.nextInt();//base

        System.out.println("enter your N : ");
        int n = sc.nextInt();//power

        int result =1;
        for (int i=1; i<=n; i++ ){
            result = result*x;
        }

        System.out.println("x to the power n is : "+result);*/



/** fibonnacci series **/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print(a+" ");

        if(n > 1) {
            //find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }

            System.out.println();
        }





























    }
}
