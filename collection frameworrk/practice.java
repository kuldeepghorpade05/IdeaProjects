public class practice {

    public static void main(String[] args) {


   //      int n =5;
//        for(int i=1; i<=n-1; i++){
//            //spaces
//            for(int j=n; j>=i; j--){
//                System.out.print(" ");
//            }
//            //stars
//            for(int k=2; k<2*i+1; k++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        for(int i=n; i>=1; i--){
//            //spaces
//            for(int j=n; j>=i; j--){
//                System.out.print(" ");
//            }
//            //stars
//            for(int k=2; k<2*i+1; k++){
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//        int n=5;
//        for(int i=1; i<=n-1; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
//        for(int i=n; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }


//         int n=5;
//
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if((i+j)%2==0){
//                     System.out.print("1"+" ");
//                 }else{
//                     System.out.print("0"+" ");
//                 }
//             }
//             System.out.println();
//         }

         //or

        //outer loop
       /* for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) { //even
                    System.out.print("1" + " ");
                } else { //odd
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }*/


//        int n=4;
//        for(int i=1; i<=n; i++){
//            //1st
//            for(int j=1; j<=i; j++ ){
//                System.out.print(j);
//            }
//          for(int k=n+3; k>=2*i; k--){
//              System.out.print(" ");
//          }
//          for(int j=i; j>=1; j-- ){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //or

//        int n=4;
//        for(int i=1; i<=n; i++){
//            //1st
//            for(int j=1; j<=i; j++ ){
//                System.out.print(j);
//            }
//            for(int k=n+n; k>=2*i+1; k--){
//                System.out.print(" ");
//            }
//            for(int j=i; j>=1; j-- ){
//                System.out.print(j);
//            }
//            System.out.println();
//        }



//        int count = 0;
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                count++;
//                System.out.print(count+" ");
//            }
//            System.out.println();
//        }

        //13

//        int count = 0;
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//               // count++;
//                System.out.print();
//            }
//            System.out.println();
//        }


//        for(int i=0; i<=5; i++){
//        for(char ch = 'A'; ch <= 'A' + i; ch++) {
//            System.out.print(ch+" ");
//           }
//            System.out.println();
//        }

//        for(int i=5; i>=0; i--){
//            for(char ch = 'A'; ch <= 'A' + i; ch++) {
//                System.out.print(ch+" ");
//            }
//            System.out.println();
//        }


//        for(int i=0; i<5; i++){
//           char ch = (char) ('A' + i);
//            for(int j=0; j<=i; j++ ){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }


//       for(int i=0; i<5; i++){
//           //spaces
//           for(int j=0; j<5-i-1; j++){
//               System.out.print(" ");
//           }
//
//           //char
//           char ch = 'A';
//           int breakpoint = (2*i+1)/2;
//           for(int j=1; j<=2*i+1; j++){
//               System.out.print(ch);
//               ch++;
//               if(j <= breakpoint){
//                   ch++;
//               }else{
//                   ch--;
//               }
//           }
//
//               //spaces
//               for(int j=0; j<5-i-1; j++){
//                   System.out.print(" ");
//               }
//           System.out.println();
//       }

//        for (int i = 0; i < 5; i++) {
//            for (char ch = (char)('E' - i); ch <= 'E'; ch++) {
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=5; i++){
//            for(int j=5; j>=i; j--){
//                System.out.print("*");
//            }
//            for(int k=2; k<=i; k++){
//                System.out.print(" ");
//            }
//            for(int k=2; k<=i; k++){
//                System.out.print(" ");
//            }
//            for(int j=5; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=5; i>=1; i--){
//            for(int j=5; j>=i; j--){
//                System.out.print("*");
//            }
//            for(int k=2; k<=i; k++){
//                System.out.print(" ");
//            }
//            for(int k=2; k<=i; k++){
//                System.out.print(" ");
//            }
//            for(int j=5; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        for(int i=1; i<=5; i++){
//            //tri
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            //spaces
//            for(int k=1; k<= 2*(5-i); k++ ){
//                System.out.print(" ");
//            }
//            //tri2
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=4; i>=1; i--){
//            //tri
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            //spaces
//            for(int k=1; k<= 2*(5-i); k++ ){
//                System.out.print(" ");
//            }
//            //tri2
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




//        int n = 5;
//        for(int i=1; i<=n; i++ ){
//            for(int j=1; j<=n; j++ ){
//                if(i==1 || j==1 || i==n || j==n) {
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


        int n=7;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print(4+" ");
                }else if(i==2 || i==n-1 || j==2 || j==n-1){
                    System.out.print(3+" ");
                }else if(i==3 || i==n-2 || j==3 || j==n-2){
                    System.out.print(2+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }






    }
}
