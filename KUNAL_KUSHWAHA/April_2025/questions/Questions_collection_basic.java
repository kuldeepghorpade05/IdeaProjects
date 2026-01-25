package April_2025.questions;

public class Questions_collection_basic {

    public static void main(String[] args) {


/** Q. M ALPHABET PATTERN **/

//      int fp = 0;
//      int sp = 0;

        //outer
//        for(int row = 1; row <= 10; row++ ){
//            for(int col = 1; col <= 11; col++){
//                if(col == 1 || col == 11 || (col == fp || col == sp) && row <= 6){
//                    System.out.print(" *");
//                }else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//            if(row == 1){
//                fp = 1;
//                sp = 11;
//            }
//            fp++;
//            sp--;
//        }

//------------------------------------------------------------------------------
/** A ALPHABET PATTERM **/

//        int afp = 20 / 2;
//        int asp = 20 / 2;
//
//        //outer
//        for (int row = 1; row <= 10; row++) {
//            for (int col = 1; col <= 20; col++) {
//                if (col == afp || col == asp || row == 10 / 2 && col > afp && col < asp && col % 2 == 0) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//            afp--;
//            asp++;
//
//        }

//-------------------------------------------------------------------
/** N ALPHABET PATTERM **/

//int nm = 0;
//
//for(int row = 1; row <= 10; row++){
//    for(int col = 1; col <= 11; col++){
//        if(col == 1 || col == 11 || col == nm){
//            System.out.print("*");
//        }else{
//            System.out.print(" ");
//        }
//    }
//    System.out.println();
//    if(row == 1){
//        nm = 1;
//    }
//    nm++;
//}

//---------------------------------------------------------------
/** A ALPHABET PATTERM **/

//int afp = 20/2;
//int asp = 20/2;
//
////outer
//for(int row = 1; row <= 10; row++ ){
//    for(int col = 1; col <= 20; col++){
//        if(col == afp || col == asp || row == 10/2 && col > afp && col < asp && col % 2 == 0){
//            System.out.print("*");
//        }else {
//            System.out.print(" ");
//        }
//    }
//    System.out.println();
//    afp--;
//    asp++;
//}

//------------------------------------------------------------
/** S ALPHABET PATTERM **/

//int rs = 0;
//int ls = 0;
//
//for(int row = 1; row <= 15; row++){
//    for(int col = 1; col <= 15; col++){
//        if(row == 1 || row == 15 || row == 15/2 ){
//            System.out.print(" *");
//        }else if(row <= 15/2 && col == 1){
//            System.out.print(" *");
//        } else if (row >= 15/2 && col == 15) {
//            System.out.print(" *");
//        }else {
//            System.out.print("  ");
//        }
//    }
//    System.out.println();
//
//}

//----------------------------------------------------------
/** V ALPHABET PATTERN **/

//int f = 1;
//int s = 16;
//
//for(int row = 1; row <= 8; row++){
//    for(int col = 1; col <= 16; col++){
//        if(col == f || col == s){
//            System.out.print("*");
//        }else {
//            System.out.print(" ");
//        }
//    }
//    System.out.println();
//    f++;
//    s--;
//}

//----------------------------------------------------------
/** I alphabet pattern **/

//for(int row = 1; row <= 10; row++){
//    for(int col = 1; col <= 9; col++ ){
//        if(row == 1 || row == 10 || col == 5){
//            System.out.print("*");
//        }else {
//            System.out.print(" ");
//        }
//    }
//    System.out.println();
//}

//----------------------------------------------------------
/** age check **/

//        System.out.println("enter your age");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//
//        if(age > 18){
//            System.out.println("can vote");
//        }else {
//            System.out.println("cant vote");
//        }

//-------------------------------------------------------------
/** odd num check **/

//        System.out.println("enter number");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if(num % 2 != 0){
//            System.out.println("its a odd number");
//        }else {
//            System.out.println("its a even number");
//        }

//-----------------------------------------------------------------
/** 3 conditios check **/

//Scanner sc = new Scanner(System.in);
//int num1 = sc.nextInt();
//int num2 = sc.nextInt();
//
//if(num1 == num2){
//    System.out.println("both numbers are equal");
//} else if (num1 > num2) {
//    System.out.println("num1 is greater");
//}else {
//    System.out.println("num2 is greater");
//}

//-------------------------------------------------------------
/** switch case print hello bonjur namste **/

//Scanner sc = new Scanner(System.in);
//System.out.println("enter number :");
//int button = sc.nextInt();
//
//switch(button){
//    case 1 :
//        System.out.println("namste");
//        break;
//    case 2 :
//        System.out.println("bonjur");
//        break;
//    case 3 :
//        System.out.println("hello");
//    break;
//
//    default:
//        System.out.println("invalid button");
//}

//------------------------------------------------------
/** area of a circle **/

//Scanner sc = new Scanner(System.in);
//double radius = sc.nextDouble();
//
//double area =  Math.PI * radius * radius;
//System.out.println(area);

//----------------------------------------------------------
/** circumfernece of a circle **/

//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter radius :");
//        double radius = sc.nextDouble();
//
//        double circumference  = 2 * Math.PI * radius;
//        System.out.println(circumference);

//------------------------------------------------------------
/** diameter of a circle **/

//Scanner sc = new Scanner(System.in);
//        System.out.println("enter radius :");
//        double radius = sc.nextDouble();
//
//        double diameter = 2 * radius;
//        System.out.println(diameter);

//-------------------------------------------------------
/** average of 3 numbers **/

// Scanner sc = new Scanner(System.in);
//        System.out.print("enter num1 :");
// int num1 = sc.nextInt();
//        System.out.print("enter num2 :");
// int num2 = sc.nextInt();
//        System.out.print("enter num3 :");
// int num3 = sc.nextInt();
//
// double average = (num1 + num2 + num3 )/3.0;
//        System.out.println(average);

//--------------------------------------------------------

/** positive, neagtive and zeros entered **/

//        int pos = 0;
//        int neg = 0;
//        int zero = 0;
//        System.out.println("enter 1 to continue and 0 to end");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();

//        while (input == 1) {
//            System.out.println("enter ur number :");
//            int n = sc.nextInt();
//
//            if (n > 0) {
//                pos++;
//            } else if (n < 0) {
//                neg++;
//            } else {
//                zero++;
//            }
//
//            System.out.println("enter 1 to continue and 0 to end");
//            input = sc.nextInt();
//        }
//
//        System.out.println("pos:" + pos + " " + "neg:" + neg + " " + "zero:1" + zero);

//---------------------------------------------------------------------------------------

        /**  mini game guess correct number  **/
//        Scanner sc = new Scanner(System.in);
//        int systemnumber = (int)(Math.random()*100);
//        int usernumber = 0;
//
//        do{
//            System.out.println("guess my number (1-100) : ");
//            usernumber = sc.nextInt();
//
//            if(usernumber == systemnumber){
//                System.out.println("perfect match!!!");
//            }else if(usernumber < systemnumber){
//                System.out.println("your number is smaller");
//            }else {
//                System.out.println("your number is greater");
//            }
//
//        }while(usernumber > 0 && usernumber < 100);
//
//        System.out.println("user number : "+ usernumber);
//        System.out.println("system number : "+ systemnumber);

//-----------------------------------------------------------------------
        /** sum of all n natural numbers **/
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

//----------------------------------------------------
//        /** print all even till n **/
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i<=n; i++){
//            if(i % 2 == 0){
//                System.out.print(i + " ");
//            }
//        }

//--------------------------------------------------
        /** print all odd till n **/
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i<=n; i++){
//            if(i % 2 != 0){
//                System.out.print(i + " ");
//            }
//        }

//-------------------------------------------------------
        /** marks based comments **/
//        Scanner sc = new Scanner(System.in);
//        int input;
//
//        do{
//            System.out.print("enter marks :");
//            int marks = sc.nextInt();
//
//            if(marks >= 90 && marks <= 100){
//                System.out.println("excellet!");
//            }else if(marks >= 70 && marks <= 90){
//                System.out.println("good!!!");
//            }else if(marks >= 40 && marks <= 70){
//                System.out.println("bad performance");
//            } else if (marks >= 1 && marks <= 40) {
//                System.out.println("fail!!!!!");
//            }else {
//                System.out.println("invaild marks");
//            }
//            System.out.println("want to continue enter 1 else 0");
//           input = sc.nextInt();
//
//        }while(input == 1);


//-----------------------------------------------------------
        /** print the table of num **/

       /* Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.print(num+" "+"*"+" "+ i+" "+"="+" "+2*i);
            System.out.println();
        }*/

//--------------------------------------------------------------
        /** factorial **/
       /* Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n = 1;
        for(int i=num; i>=1; i--){
           n = n * i;
        }
        System.out.println(n);*/
//----------------------------------------------
        /** solid rectangle **/
        //outer loop
        /*for(int i=1; i<=5; i++){
            //inner loop
            for(int j=1; j<=5; j++){
                System.out.print(" *");
            }
            System.out.println();
        }*/
//------------------------------------------------
        /** hollow rectangle **/
        //outer loop
        /*for(int i=1; i<=5; i++){
            //inner loop
            for(int j=1; j<=5; j++){
                if(i==1 || j==1 || i==5 || j==5){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/
//---------------------------------------------------
        /** half pyramid **/
        //outer loop
       /* for(int i=1; i<=5; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }*/
//---------------------------------------------
        /** inverted half pyramid **/
        //outer loop
       /* for(int i=5; i>=1; i--){
            //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

//-------------------------------------------------------

 /** inverted and rotated half pyramid **/
       //outer loop
      /* for(int i=1; i<=5; i++){
           //inner loop
           for(int j=1; j<=5-i; j++){
               System.out.print("  ");
           }
           //stars
           for(int k=1; k<=i; k++){
               System.out.print(" *");
           }
           System.out.println();
       }*/

//--------------------------------------------------------------

        /** half pyramid with number **/

        //outer
       /* for(int i=1; i<=5; i++){
            //inner
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

//---------------------------------------------------------------

        /** inverted half pyramid with number **/

        //outer
       /* for(int i=5; i>=1; i--){
            //inner
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

//-------------------------------
        //        //outer loop
//        for (int i=1; i<=5; i++ ){
//            //inner loop
//            for (int j=1; j<=5-i+1; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

 //---------------------------------------------------------------

        /** floyds triangle **/

        //outer
       /* int c = 1;
        for(int i=1; i<=6; i++){
            //inner
            for(int j=1; j<=i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }*/

//-----------------------------------------------------------------

        /** 0-1 triangle **/

        /*for(int i=1; i<=6; i++){
            //inner
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }*/

//--------------------------------------------------------------------

        /** triangle **/

        //outer loop
       /* for(int i=1; i<=6; i++){
            //spaces
            for(int j=1; j<=6-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }*/

//---------------------------------------------------------------------

/** inverted and rotated half pyramid **/

     //outer
    /* for(int i=1; i<=6; i++){
         //spaces
         for(int j=1; j<=i; j++){
             System.out.print("  ");
         }
         //stars
         for(int k=6-i; k>=1; k--){
             System.out.print(" *");
         }
         System.out.println();
     }*/

//---------------------------------------------------------------------

/** print number pyramid **/

        /*for (int i = 1; i <= 6; i++) {
          //spaces
            for(int j=6-i; j>=1; j--){
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=i; k++){
                System.out.print(" "+i);
            }
            System.out.println();
        }*/


//-------------------------------------------------------------------------

        /** rhoumbus **/
       //outer
     /*  for(int i=1; i<=6; i++){
           //spaces
           for(int j=6-i; j>=1; j--){
               System.out.print("  ");
           }
           //stars
           for(int k=1; k<=6; k++){
               System.out.print(" *");
           }
           System.out.println();
       } */

    //---------------------------------------

  /*  for(int i=1; i<=6; i++){
        //spaces
        for(int j=1; j<=6-i; j++){
            System.out.print("  ");
        }
        //star
        for(int k=1; k<=6; k++){
            System.out.print(" *");
        }
        System.out.println();
    } */

//------------------------------------------------------------------------------

        /** butterfy patter **/

       /* for(int i = 1; i <= 5; i++){
            //left half
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            //spaces
            for(int k = 1; k <= 2*(5-i); k++){
                System.out.print("  ");
            }
            //right half
            for(int t = 1; t <= i; t++){
                System.out.print(" *");
            }
            System.out.println();
        }
        //lower
        for(int i = 4; i >= 1; i--){
            //left half
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            //spaces
            for(int k = 1; k <= 2*(5-i); k++){
                System.out.print("  ");
            }
            //right half
            for(int t = 1; t <= i; t++){
                System.out.print(" *");
            }
            System.out.println();
        }*/


//--------------------------------------------------------------------

     /** hollow rhombus  **/

    /* for(int i=1; i<=6; i++){
         for(int j=1; j<=6-i; j++){
             System.out.print("  ");
         }
         for(int k=1; k<=6; k++){
             if(k==1 || k==6 || i==1 || i==6){
                 System.out.print(" *");
             }else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     } */

//----------------------------------------------------------------------------

        /** numbered pyramid 1 22 333 **/
      /* for(int i=1; i<=6; i++){
           //spaces
           for(int j=1; j<=6-i; j++){
               System.out.print(" ");
           }
           for(int k=1; k<=i; k++){
               System.out.print(" "+i);
           }
           System.out.println();
       } */

//------------------------------------------------------------------------------

      /** palindromic numbers **/

      //outer
       /* for(int i = 1; i <= 6; i++){
            //spaces
            for(int j = 1; j <= 6-i; j++){
                System.out.print("  ");
            }
            for(int k=i; k>=1; k--){
                System.out.print(" "+k);
            }
            for(int b=2; b<=i; b++){
                System.out.print(" "+b);
            }

            System.out.println();
        } */

//---------------------------------------------------------------------------------

       /** diamond pattern **/

       //upper
     /*  for(int i=1; i<=6; i++){
           //spaces
           for(int j=1; j<=6-i; j++){
               System.out.print("  ");
           }
           //left half
           for(int k=1; k<=i; k++){
               System.out.print(" *");
           }
           //right half
           for(int n=2; n<=i; n++){
               System.out.print(" *");
           }
           System.out.println();
       }
       //inner
        for(int i=5; i>=1; i--){
            //spaces
            for(int j=1; j<=6-i; j++){
                System.out.print("  ");
            }
            //left half
            for(int k=1; k<=i; k++){
                System.out.print(" *");
            }
            //right half
            for(int n=2; n<=i; n++){
                System.out.print(" *");
            }
            System.out.println();
        }*/

//---------------------------------------------------------------------------

      /** upside down triangle **/

     /* for(int i=1; i<=6; i++){
          //spaces
          for(int j=1; j<=i; j++){
              System.out.print("  ");
          }
          //left
          for(int t=1; t<=6-i; t++){
              System.out.print(" *");
          }
          //right
          for(int p=2; p<=6-i; p++){
              System.out.print(" *");
          }
          System.out.println();
      }*/

 //-----------------------------------------------------------------------

       /** diamond palindromic numbers **/

       //upper
      /* for(int i=1; i<=6; i++){
           //spaces
           for(int j=1; j<=6-i; j++){
               System.out.print("  ");
           }
           //left
           for(int k=i; k>=1; k--){
               System.out.print(" "+k);
           }
           //right
           for(int m=2; m<=i; m++){
               System.out.print(" "+m);
           }
           System.out.println();
       }
       //lower
        for(int i=5; i>=1; i--){
            //spaces
            for(int j=1; j<=6-i; j++){
                System.out.print("  ");
            }
            //left
            for(int k=i; k>=1; k--){
                System.out.print(" "+k);
            }
            //right
            for(int m=2; m<=i; m++){
                System.out.print(" "+m);
            }
            System.out.println();
        }*/

//----------------------------------------------------------------

        /** solid rectangle **/

       /* for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                System.out.print(" *");
            }
            System.out.println();
        } */

//----------------------------------------------------------------

        /** hollow rectangle **/
        /*for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                if(j==1 || j==6 || i==1 || i==6){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/

//-------------------------------------------------------------------

        /** inverted half pyramid with numbers **/

       /* for(int i=1; i<=6; i++){
            for(int j=1; j<=6-i; j++){
                System.out.print(" "+j);
            }
            System.out.println();
        } */


//-----------------------------------------------------------------------

        /** program to check prime number from n to m **/
      /*  Scanner sc = new Scanner(System.in);
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
        } */

//---------------------------------------------------------------------

        /** mirror inverted and rotated numbers half pyramid **/
        //upper half
        /*for(int i=1; i<=6; i++){
            //spaces
            for(int j=1; j<=6-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        //lower half
        for(int i=5; i>=1; i--){
            //spaces
            for(int j=1; j<=6-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }*/

//-------------------------------------------------------------------


        /** heart pattern **/
       /* for (int row=0; row<6; row++ ){
            for (int col=0; col<7; col++ ){
                if ( (row==0 && col%3!=0) || (row==1 && col%3==0) || row-col==2 || row+col==8 ){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }*/

//------------------------------------------------------------------------

/** fibonacchi series 3 methods **/

/** 1st version using iterartive **/

        /*Scanner sc = new Scanner(System.in);
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
        }*/

/** 2nd version using iterative (best method) **/

/* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        if(n >= 1) System.out.print(a + " ");
        if(n >= 2) System.out.print(b + " ");

        for(int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        } */

/** 3rd version recursive **/

        // function
        /*public static int fib(int n) {
            if (n <= 1) return n;
            return fib(n - 1) + fib(n - 2);
        }*/


//-----------------------------------------------------------

        /** counts a particular number from big number **/

       /* long num = 1385757879;

        int count = 0;
        while(num > 0){

            long mod = num % 10;
            if(mod == 7){
                count++;
            }
            //update num
            num = num / 10;
        }

        System.out.println(count); */

//--------------------------------------------------------------------

        /** reverse a number **/
        /* int num = 46096;

        int ans = 0;

        while(num > 0){
            int rem = num % 10;        //extracts last digit
            ans = ans * 10 + rem;    //stores final ans
            num = num / 10;            // updates original num
        }
        System.out.println(ans); */

//------------------------------------------------------------------------

      /** maximum number check **/
       /* int a = 45;
        int b = 12;
        int c = 96;

        int ans =  Math.max(Math.max(a,b),c);
        System.out.println(ans);*/

//-------------------------------------------------------------------

        /** program to find exponent of a number **/
        // example 5^5 = 5×5×5×5×5 = 3125

       /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int exponent = 1;
        for(int i=1; i<=n; i++){
            exponent = exponent * n;
        }
        System.out.println(exponent); */

//---------------------------------------------------------------

      /** program to find factorial of a number **/
        // example - 5! = 5×4×3×2×1 = 120

       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial); */

//------------------------------------------------------------------

        /** array reverse function call **/
       /* int[] arr = {45, 32, 14, 85, 69};

        reversearr(arr, 0, arr.length-1);

        for(int i : arr){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr)); */

//-------------------------------------------------------------------------







































// function calls ---------------------------------------------------------------


//        leetcode - 1295
        int[] nums = {12,345,2,6,-7896};
        System.out.println(sol1295.findNumbers(nums));


        /** fq1 sum of odd numbers **/
//        System.out.println(oddsum(20));
//        System.out.println(oddsum2(20));

        // calculate power of number
//        System.out.println(powernum(2, 5));


        // GCD USING EUCLIDEAN ALGO (SUBTACTION)
//        System.out.println(gcd_sub(48,23));

        // GCD USING EUCLIDEAN ALGO (module %) optimized
//        System.out.println(gcd_mod(42,24));

        /* prime number **/
//        primenum(13);

        /** nth fibonacchi number using recursive **/
//        System.out.println(fib(4));


        /** prints all armstrong numbers from 100 to 1000 **/
        /* for(int i=100; i<1000; i++){
            if(armstrongcheck(i)){
                System.out.print(i+" ");
            }
        }*/
        // armstrongcheck function call
        //System.out.println(armstrongcheck(153));







}

//-------------------------------------------------------------------------------------------------------------------------

    /** function to reverse an array **/
    static void reversearr(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    // swaping function
    static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }




    /** armstrong number check **/
    public static boolean armstrongcheck(int n){

        // store the original number
        int orig = n;

        //storing cube addition
        double cubestore = 0;
        // run loop untill n is greater then 0
        while(n > 0) {
            // extrct the last digit using rem technique
            int rem = n % 10;
            // store cube addition and cube the reminder
            cubestore = cubestore + Math.pow(rem,3);
            // update the n
            n = n / 10;
        }
        //check if it matches input and return true or false
        if(cubestore == orig) return true;
        return false;
    }



    /** fibonacchi series using recursive method **/
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }



    /** fq1 sum of odd numbers **/

    public static int oddsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) { // Loop from 1 to n (inclusive)
            if (i % 2 != 0) { // Check if i is odd
                sum += i;
            }
        }
        return sum; // Return the final sum
    }


    // using formula
    public static int oddsum2(int n) {
        int m = (n + 1) / 2;
        return m * m;
    }
//-------------------------------------------------------------------
    // condition ? value_if_true : value_if_false;
    public static int returngreater(int a, int b) {
        return (a > b) ? a : b;
    }

//-----------------------------------------------------------------------

    // calculate power of number
    public static int powernum(int n, int m) {
        int result = 1;

        for (int i = 1; i <= m; i++) {
            result = result * n;
        }
        return result;
    }
//----------------------------------------------------------------------------------
    // find GCD

    /**
     * HCF (Highest Common Factor) and GCD (Greatest Common Divisor) are the same.
     * HCF (Highest Common Factor) → The largest number that divides both numbers completely.
     * GCD (Greatest Common Divisor) → The greatest divisor common to both numbers.
     **/

    // GCD USING EUCLIDEAN ALGO (SUBTACTION)
    public static int gcd_sub(int n1, int n2) {

        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n2;
    }

    // GCD USING EUCLIDEAN ALGO (module %) optimized

    public static int gcd_mod(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

//---------------------------------------------------------------------
    /** prime number **/

    public static void primenum(int n){

        int counter = 0;
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                counter++;
            }
        }

        if(counter > 0){
            System.out.println("not a prime number");
        }else {
            System.out.println("prime number");
        }

    }


    static int maximumWealth(int[][] accounts) {
//   https://leetcode.com/problems/richest-customer-wealth/
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum = 0;
            for (int accs = 0; accs < accounts[person].length; accs++) {
                rowsum += accounts[person][accs];
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }






}

class sol1295 {
//    https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    static int findNumbers(int[] nums) {

        int anstore = 0;
        for(int i=0; i<nums.length; i++){
            //test case
//            nums[i] = Math.abs(nums[i]);

            if(nums[i] < 0){
                nums[i] = nums[i] * -1;
            }


            int n = digitcount(nums[i]);
            if(n % 2 == 0){
                anstore++;
            }
        }
        return anstore;
    }

    static int digitcount(int num){
        if (num == 0) return 1;
        int countnum = 0;

        while( num != 0){
            num = num / 10;
            countnum++;
        }
        return countnum;
    }
}