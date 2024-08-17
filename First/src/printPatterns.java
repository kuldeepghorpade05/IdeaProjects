import java.util.Scanner;
public class printPatterns {
    public static void main(String[] args) {


        /**01 solid rectangle **/
        /*int n=4;
        int m=5;

        //outer loop
        for (int i=1;  i<=n; i++ ){
        //inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/



        /**02 hollow rectangle **/
        /*int n =4;
        int m= 5;

       //outer loop
        for (int i=1; i<=n; i++ ) {
        //inner loop
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }*/

        /**03 half pyramid **/
        /*int n=4;

         //outer loop
        for( int i=1; i<=n; i++ ){
        //inner loop
            for (int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /**04 inverted half pyramid **/
       /* int n= 4;

        //outer loop
        for (int i=n; i>=1; i-- ){
        //inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
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
//---------------------------------------------
      /* int n= 5;

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

        /*int n=5;

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

       /* int n=5;

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
        /*int n= 5;
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
      /*  int n= 5;
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
            int spaces =2*(n-i);
            for (int p=1; p<=spaces; p++){
                System.out.print(" ");        //extra space for K
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
                System.out.print("*");
            }
            //spaces
            int spaces =2*(n-i);
            for (int p=1; p<=spaces; p++){
                System.out.print(" "); //extra space for K
            }
            //2nd part
            for (int k=1; k<=i; k++){
                System.out.print("*");
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
        /*int n=6;
        for(int i=n; i>=1; i-- ){
            for (int j=1; j<=n-i; j++ ){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }*/

        /** diamond palindromic numbers **/
        /*int n=5;
        //outer
        for (int i=1; i<=n; i++ ){
            //spaces
            for (int j=1; j<=n-i; j++ ){
                System.out.print("  ");
            }
            //1st part
            for (int p=i; p>=1; p--){
                System.out.print(p+" ");
            }
            //2nd part
            for (int m=2; m<=i; m++ ){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        //lower
        for (int i=4; i>=1; i-- ){
            //spaces
            for (int j=1; j<=n-i; j++ ){
                System.out.print("  ");
            }
            //1st part
            for (int p=i; p>=1; p--){
                System.out.print(p+" ");
            }
            //2nd part
            for (int m=2; m<=i; m++ ){
                System.out.print(m+" ");
            }
            System.out.println();
        }*/





























    }
}
