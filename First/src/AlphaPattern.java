public class AlphaPattern {
    public static void main(String[] args) {

        /** M **/
        int fp = 0;
        int sp = 0;

        //outer loop
        for (int row = 1; row <= 10; row++) {

            for (int col = 1; col <= 11; col++) {
                if (col == 1 || col == 11 || (col == fp || col == sp) && row <= 10 / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (row == 1) {
                fp = 1;
                sp = 11;
            }
            fp++;
            sp--;
        }


        /** A **/

        int afp = 20 / 2;
        int asp = 20 / 2;

        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 20; col++) {
                if (col == afp || col == asp || row == 10 / 2 && col > afp && col < asp && col % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            afp--;
            asp++;

        }

        /** N **/
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if (col == 1 || col == 10 || col == row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        /** A **/

        int k = 20 / 2;
        int r = 20 / 2;

        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 20; col++) {
                if (col == k || col == r || row == 10 / 2 && col > k && col < r && col % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            k--;
            r++;

        }

        /** S **/
        for (int row=1; row<=10; row++ ){
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
        }


        /**  V **/
        int f=1;
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
        }

/** I **/

        for (int row=1; row<=8; row++ ){
            for (int col=1; col<=8; col++ ){
                if ( row==1 || row==8 || col==8/2){
                    System.out.print("*"+" ");
                }else {
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }

/** heart **/
        for (int row=0; row<6; row++ ){
            for (int col=0; col<7; col++ ){
                if ( (row==0 && col%3!=0) || (row==1 && col%3==0) || row-col==2 || row+col==8 ){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }






    }
}