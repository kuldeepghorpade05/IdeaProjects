import java.util.*;
import java.util.Scanner;

public class patterns24{
    public static void main(String[] args ){
        /** PATTERNS **/



        /** 01 solid rectangle **/
           /*int n=4;
            int m=5;

            //outer loop
            for (int i=1;  i<=n; i++ ){
            //inner loop
                for(int j=1; j<=m; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }*/

        /** 02 hollow rectangle **/
            /*int n =4;

           //outer loop
            for (int i=1; i<=n; i++ ) {
            //inner loop
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || j == 1 || i == n || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }*/

        /**03 half pyramid **/
           /* int n=5;

             //outer loop
            for( int i=1; i<=n; i++ ){
            //inner loop
                for (int j=1; j<=i; j++ ){
                    System.out.print("*  ");
                }
                System.out.println();
            }*/


        /**04 inverted half pyramid **/
           /*int n= 5;

            //outer loop
            for (int i=n; i>=1; i-- ){
            //inner loop
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }*/

        /** inverted and rotated half pyramid **/

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



        /** half pyramid with number **/
              /* int n = 5;

                //outer loop
               for(int i=1; i<=n; i++ ){
               //inner loop
                   for (int j=1; j<=i; j++){
                       System.out.print(j+" ");
                   }
                   System.out.println();
               }*/



        /** inverted  half pyramid with number **/

                /*int n = 5;
                 //outer loop
                for (int i=n; i>=1; i-- ){
                //inner loop
                    for(int j=1; j<=i;j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }*/
        // ------------------------------------------
                /*int n= 5;

                //outer loop
                for (int i=1; i<=n; i++ ){
                //inner loop
                    for (int j=1; j<=n-i+1; j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();
                }*/

        /** floyd's triangle **/

           /* int n= 5;
            int number = 1;

            //outer loop
            for (int i=1; i<=n; i++ ){
                //inner loop
                for (int j=1; j<=i; j++ ){
                    System.out.print(number+" ");
                    number++;
                }
                System.out.println();
            }*/


        /** 0-1 triangle **/

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
        /*int n =5;

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


        /** inverted  and rotated half pyramid **/

      /*int n=5;

        //outer loop
        for (int i=1; i<=n; i++ ) {
            //inner for spaces
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //inner loop  for numb
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/


        /** hwq print number pyramid 1 22 333**/
           /* int n= 5;
            //outer loop
            for (int i=1; i<=n; i++ ){
                //inner loop-->spaces
                for (int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for (int j=1; j<=i; j++ ){
                    System.out.print(i+" ");
                }
                System.out.println();

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
       /* int n=4;

        //upper half
        for (int i=1; i<=n; i++ ){

            //1st half
            for (int j=1; j<=i; j++){
                System.out.print(" *");
            }

            //spaces
            int spaces = 2*(n-i);
            for (int p=1; p<=spaces; p++){
                System.out.print("  ");        //extra space for K
            }

            //2nd part
            for (int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        //lower half
        for (int i=n; i>=1; i-- ){
            //1st half
            for (int j=1; j<=i; j++){
                System.out.print(" *");
            }
            //spaces
            int spaces =2*(n-i);
            for (int p=1; p<=spaces; p++){
                System.out.print("  "); //extra space for K
            }
            //2nd part
            for (int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }*/




        /** 11 22 333 pyramid **/
           /*int n=5;
              for(int i=1; i<=n; i++ ){
                  //spaces
                  for(int j=1; j<=n-i; j++ ){
                      System.out.print(" ");
                  }

                  for(int k=1; k<=i; k++){
                      System.out.print(" "+i);
                  }
                  System.out.println();

              }*/


        /** print hollow rhoumbus **/
                /*int n= 5;
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

        /** numberd pyramid 1 22 333 **/
            /*int n=5;
            for (int i=1; i<=n; i++){
                for (int j=1; j<=n-i; j++ ){
                    System.out.print(" ");
                }

                for (int k=1; k<=i; k++ ){
                    System.out.print(i+" ");
                }
                System.out.println();
            }*/

            /** palindromic numbers **/
            /*int n=5;
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
        for(int i=1; i<=n; i++ ){

            for(int j=1; j<=n-i; j++ ){
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++ ){
                System.out.print(" *");
            }

            for(int h=2; h<=i; h++ ){
                System.out.print(" *");
            }
            System.out.println();

        }

        // lower half
        for(int i=n; i>=1; i-- ){

            for(int j=1; j<=n-i; j++ ){
                System.out.print("  ");
            }

            for(int k=1; k<=i; k++ ){
                System.out.print(" *");
            }

            for(int h=2; h<=i; h++ ){
                System.out.print(" *");
            }
            System.out.println();

        }*/


        /** upside down triangle **/
           /*int n=6;
            for(int i=n; i>=1; i-- ){
                //spaces
                for (int j=1; j<=n-i; j++ ){
                    System.out.print("  ");
                }
                //stars
                for (int j=1; j<=2*i-1; j++ ){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }*/


        /** diamond palindromic pattern **/
          /* int n=5;

            for(int i=1; i<=n; i++ ){

                //spaces
                for(int k=1; k<=n-i; k++){
                    System.out.print("  ");
                }
                //left
                for(int t=i; t>=1; t-- ){
                    System.out.print(" "+t);
                }
                //right
                for(int x=2; x<=i; x++ ){
                    System.out.print(" "+x);
                }
                System.out.println();

            }

            //lower
            for(int i=n-1; i>=1; i-- ){

                //spaces
                for(int k=1; k<=n-i; k++){
                    System.out.print("  ");
                }
                //left
                for(int t=i; t>=1; t-- ){
                    System.out.print(" "+t);
                }
                //right
                for(int x=2; x<=i; x++ ){
                    System.out.print(" "+x);
                }
                System.out.println();

            } */

        /** 'X' alphabet **/
           /*int n= 6;
           for(int row=1; row<n; row++ ){
               //inner
               for(int col=1; col<n; col++){
                   if(row==col || col+row==n){
                       System.out.print(" * ");
                   }else{
                       System.out.print("   ");
                   }
               }
               System.out.println();
           }*/


        /** m **/
        /*int n=6;
        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<=n; col++ ){
                if( col==1 || row==2 && col==2 || row==3 && col==3 || col==4 && row==2 || col==5    ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        /** a **/
        /*int c=5;
        int r =5;
        for(int row=1; row<=r; row++ ){
            //inner
            for(int col=1; col<=c; col++ ){
                if( col==1 || col ==c || row==1 || row==3 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        /** n **/
        /*int n=6;
        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<=n; col++ ){
                if( col==1 || col==n || row==col  ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        /** a **/
       /* int c=5;
        int r =5;
        for(int row=1; row<=r; row++ ){
            //inner
            for(int col=1; col<=c; col++ ){
                if( col==1 || col ==c || row==1 || row==3 ){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        /** s **/
       /* int r = 5;
        int c = 4;

        for(int row=1; row<=r; row++ ){
            //inner
            for(int col=1; col<=c; col++ ){
                if( row==1 || row==r || col==1 && row==2 || row==3 || col==c && row==4){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        /** v **/
        /*int n = 6;

        for(int row=1; row<=n; row++){
            //inner
            for(int col=1; col<=n; col++ ){
                if(row==col ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for(int col=n; col>=1; col-- ){
                if(row==col ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }*/

        /** i **/

       /* int n=5;

        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++ ){
                if(row==1 || row==n || col==3){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        /** ------------------------------------------------ **/


        /** k **/
        /*int n= 5;

        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<=n; col++ ){
                if(col==1 ||row==3 && col==2 ||row==2 && col==3 || col==4 && row==1 || row==4 && col==3 || col==4 && row==6 || col==4 && row==5 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        /** triangle up down **/
       /* int n=5;

        for(int row=n; row>=1; row-- ){
            for(int col=1; col<=row; col++ ){
                System.out.print("*");
            }
            System.out.println();
        }*/


        /** play button **/
        /*int n =4;

        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<=row-1; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int row=n; row>=1; row-- ){
            //inner
            for(int col=1; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/


        /** triangle **/
        /*int n = 5;

        for(int row=1; row<=n; row++ ){
            //spaces
            for(int col=1; col<=n-row; col++ ){
                System.out.print(" ");
            }
            //star
            for(int j=1; j<=row; j++){
                System.out.print("*");
            }

            for(int j=2; j<=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        /** * * * * *
         * * * *
         *  *
         *     */
       /* int n =5;
        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<=row; col++){
                System.out.print("   ");
            }
            //2nd
            for(int j=n; j>=row; j-- ){
                System.out.print(" * ");
            }
            System.out.println();
        }*/

       /* int n= 5;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++ ){
                if(j<i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/

        /** upside down triangle **/

       /* int n=6;
        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<=row; col++){
                System.out.print("  ");
            }
            //star
            for(int j=1; j<=n-row; j++ ){
                System.out.print(" *");
            }
            //star2
            for(int j=1; j<=n-row-1; j++ ){
                System.out.print(" *");
            }
            System.out.println();

        }*/

       /* int n=6;
        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<=row; col++){
                System.out.print("  ");
            }
            //star
            for(int j=1; j<=2*(n-row)-1; j++ ){
                System.out.print(" *");
            }
            System.out.println();
        }*/

        /** paralleogram **/

        /*int n= 6;

        for(int row=1; row<=n; row++){
            //spaces
            for(int col=1; col<=row; col++ ){
                System.out.print("   ");
            }
            //star
            for(int j=1; j<=n; j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }*/

        /** \ **/

        /*int n=6;
        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<n; col++ ){
                if(col==row ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        //or

       /* int n=6;
        for(int row=1; row<=n; row++ ){
            //inner
            for(int col=1; col<row; col++ ){
                System.out.print(" ");
            }
            for(int h=1; h<=n; h++ ){
                if(h==1)
                    System.out.print("*");
            }
            System.out.println();
        }*/

        //or

        /*int n=6;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=i; j++ ){
                System.out.print(" ");
            }
            System.out.println(i);
        }*/

        /**   /  **/

        /*int n = 6;

        for(int row=1; row<=n; row++ ){
            for(int col=1; col<=n; col++ ){
                if(col+row==n) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }*/

        //or

       /* int n=6;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }*/

        /** A  **/

       /* int n =6;

        for(int row=1; row<=n; row++ ){
            //spaces
            for(int sp=1; sp<=n-row; sp++ ){
                System.out.print(" ");
            }
            //star
            for(int st=1; st<=2*row; st++){
                if(st==1 || st==2*row-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /** hollow triangle **/

       /* int n =6;

        for(int row=1; row<=n; row++ ){
            //spaces
            for(int sp=1; sp<=n-row; sp++ ){
                System.out.print(" ");
            }
            //star
            for(int st=1; st<=2*row; st++){
                if(st==1 || st==2*row-1 || row==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /** v  **/

         /* int n =6;

        for(int row=1; row<=n; row++ ){
            //spaces
            for(int sp=1; sp<=row; sp++ ){
                System.out.print(" ");
            }
            //star
            for(int st=1; st<=2*(n-row); st++){
                if(st==1 || st==2*(n-row)-1 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        /** upside down hollow triangle **/

         /*int n =6;

        for(int row=n; row>=1; row-- ){
            //spaces
            for(int sp=1; sp<=n-row; sp++ ){
                System.out.print(" ");
            }
            //star
            for(int st=1; st<=2*row; st++){
                if(st==1 || st==2*row-1 || row==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/




























    }
}

