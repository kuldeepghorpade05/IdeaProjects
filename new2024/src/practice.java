import java.sql.SQLOutput;
import java.util.*;


class bubblesort{

    public static void printarray(int arr[]){

        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}


class sols{

    /** merge **/
    public static void merge(int[] arr, int low, int mid, int high){
        //create a temp array
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low; //left array
        int right = mid+1; //right array

        //to compare and add elements from divided left and right array
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        //to add remaning elements from left
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }

        //to add remaning elements from right
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        //to add the temp merged array to the original array
        for(int i=low; i<=high; i++ ){
            arr[i] = temp.get(i-low);
        }


    }

    /** mergesort **/
    public static void mergesort(int[] arr,int low, int high){
        //basecase
        if(low>=high) return;
        //find out the mid
        int mid = (low+high)/2;

        mergesort(arr,low,mid);  //left divided array
        mergesort(arr,mid+1,high);  //right divided array

        //call merge function to merge divided array
        merge(arr,low,mid,high);

    }
}




class qs{

    /** partition **/
    public static int partition(int[] arr, int low,  int high){

        int pos = low;
        for(int i=low; i<=high; i++ ){
            if(arr[i]<=arr[high]){
                //swap
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;

                pos++;
            }
        }
        return pos-1;
    }

    /** quicksorting **/
    public static void quicksorting(int[] arr, int low, int high){
        //base case
        if(low>=high) return;

        //to make partition by creating pivot
        int pivot = partition(arr, low, high);

        quicksorting(arr,low,pivot-1);
        quicksorting(arr,pivot+1,high);
    }

}

class fib {
    public static int fibn(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibn(n - 1) + fibn(n - 2);
        }
    }

}

//class gcd1 {
//    public static void gcd(int n, int m) {
//        int gcd = 1;
//        for (int i = 1; i <= n && i <= m; i++) {
//            if (n % i == 0 && m % i == 0) {
//                gcd = i;
//            }
//        }
//        System.out.println(gcd);
//    }
//}










                       /** main **/
public class practice{
    public static void main(String[] args){

    // gcd1.gcd(39,64);


       // System.out.println(fib.fibn(10));




//        int arr[] = {74,54,98,32,8};
//
//            for(int i=0; i<arr.length-1; i++){
//                for(int j=0; j<arr.length-i-1; j++){
//                    if(arr[j]>arr[j+1]){
//                        //swap
//                        int temp = arr[j];
//                        arr[j] = arr[j+1];
//                        arr[j+1] = temp;
//                    }
//                }
//            }
//
//            bubblesort.printarray(arr);


//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        int p = sc.nextInt();
//
//        int count = 1;
//        for (int i=1; i<=p; i++ ){
//            count = count * b;
//        }
//        System.out.println(count);





//
//        int count = 0;
//
//        for(int i=2; i<input; i++ ){
//            if(input % 2 == 0){
//                count++;
//            }
//        }
//
//        if(count>1){
//            System.out.println("not a prime number");
//        }else {
//            System.out.println("prime number");
//        }

//        int sum = 1;
//
//        for(int i=1; i<=n; i++ ){
//            sum = sum * i;
//        }
//        System.out.println(sum);

//        int arr[] = {45, 78,25, 36, 41, 69};
//
//        for(int i=0; i<arr.length-1; i++ ){
//            for(int j=0; j<arr.length-i-1; j++){
//                if(arr[j]>arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        for(int i=0; i<=arr.length-1; i++ ){
//            System.out.print(arr[i]+" ");
//        }


       // for(int i=0; i<arr.length-1; i++){
//                for(int j=0; j<arr.length-i-1; j++){
//                    if(arr[j]>arr[j+1]){
//                        //swap
//                        int temp = arr[j];
//                        arr[j] = arr[j+1];
//                        arr[j+1] = temp;
//                    }
//                }
//            }
//
//            bubblesort.printarray(arr);















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


        /*int[] arr = {78,25,36,25,21,45,32,25,8,9};

        sols.mergesort(arr,0,arr.length-1);

        for(int i=0; i<=arr.length-1; i++ ){
            System.out.print(arr[i]+" ");
        }*/

       /* int[] arr = {78,25,36,25,21,45,32,25,8,9};

        qs.quicksorting(arr,0,arr.length-1);

        for(int i=0; i<=arr.length-1; i++ ){
            System.out.print(arr[i]+" ");
        }*/


      /*int[] arr = {78,25,36,25,21,45,32,25,8,9};

      sols.mergesort(arr,0,arr.length-1);

      for(int i=0; i<=arr.length-1; i++ ){
          System.out.print(arr[i]+" ");
      }*/

//        int arr[] = {78, 45, 21, 32, 9, 87, 25};
//
//        for(int i=0; i<arr.length-1; i++ ){
//            for(int j=0; j<arr.length-i-1; j++ ){
//                if(arr[j]>arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        for(int i=0; i<=arr.length-1; i++){
//            System.out.print(arr[i]+ " ");
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int arr[] = new int[n+1];
//
//        arr[0] = 0;
//        arr[1] = 1;
//        System.out.print("0\t1\t");
//
//        for(int i=2; i<=n; i++ ){
//            arr[i] = arr[i-1] + arr[i-2];
//            System.out.print(arr[i]+"\t");
//        }

//        Scanner sc = new Scanner(System.in);
//        double pr = sc.nextDouble();
//
//        double tp = pr + (pr *  0.18);
//        System.out.println(tp);



//        Scanner sc = new Scanner(System.in);
//        int n =  sc.nextInt();
//
//        if(n<0){
//            System.out.println("negative");
//            if(n%2==0){
//                System.out.println("even");
//            }else{
//                System.out.println("odd");
//            }
//        }
//
//        if(n>0){
//            System.out.println("positive");
//            if(n%2==0){
//                System.out.println("even");
//            }else{
//                System.out.println("odd");
//            }
//        }



//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int gcd=0;
//
//        for(int i=1; i<=a && i<=b; i++ ){
//            if(a%i==0 && b%i==0){
//                gcd = i;
//            }
//        }
//        System.out.println(gcd);

//        int arr[] = {78, 45, 69, 21, 12, 8, 7, 73};
//
//        for(int i=0; i<arr.length-1; i++ ){
//            for(int j=0; j<arr.length-i-1; j++ ){
//                if(arr[j]>arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        for(int i=0; i<arr.length; i++ ){
//            System.out.print(arr[i]+" ");
//        }
//
//
        /** STRIVERS PATTERNS **/

//        for(int i=1; i<=4; i++ ){
//            for(int j=4; j>=i; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=5; i++ ){
//            //spaces
//            for(int j=5; j>=i; j--){
//                System.out.print(" ");
//            }
//            //star
//            for(int k=1; k<=i; k++){
//                System.out.print("*");
//            }
//            //star
//            for(int m=2; m<=i; m++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        int n = 5;
        for(int i=1; i<=n; i++ ){
            //spaces
            for(int j=n; j>=i; j-- ){
                System.out.print(" ");
            }
            for(int f=2; f<2*i+1; f++ ){
                System.out.print("*");
            }
            System.out.println();
        }

















































    }
}