



public class Logics {




    /** Richest Customer Wealth (leetcode) **/
        public static int maximumWealth(int[][] accounts) {
            int maxwealth = Integer.MIN_VALUE;

            for(int i=0; i<accounts.length; i++){
                for(int j=0; j<accounts[i].length; j++){
                    int sum = addelements(accounts[i]);
                    if(sum > maxwealth){
                        maxwealth = sum;
                    }
                }
            }
            return maxwealth;
        }

        static int addelements(int[] arr){
            int count = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] != 0){
                    count = count + arr[i];
                }
            }
            return count;
        }


    /** find even number (leetcode question) **/
    static boolean even(int num){
        int numberofdigits = digits(num);
        if(numberofdigits % 2 == 0){
            return true;
        }
        return false;
    }


    //count numbers of digits
    static int digits(int num){

        if(num < 0){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

    static int findnumbers(int[] nums){
        int count = 0;

        for(int i : nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }



    /** function to print armstrong numbers from 100 - 1000  **/
    public static boolean arm(int n){
        int sum = 0;
        int originalnumber = n;

        while (n != 0) {
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
        }
        return sum == originalnumber;

    }

    /** -------------------------- main ----------------------------------**/
    public static void main(String[] args) {

//        int[][] arr = {
//                {78, 54, 34},
//                {47, 21, 96},
//                {12, 98, 31}
//        };

//        System.out.println(maximumWealth(arr));

        /** find number (leetcode question) **/
        /*int[] arr = {56, 5, 698, 74, 8542};
        System.out.println(findnumbers(arr));*/


        /** call to arm **/
        /*for(int i=100; i<1000; i++){
            if(arm(i)){
                System.out.print(i+"  ");
            }
        }*/


        /**  count repeated numbers ex 5 **/
       /* int n = 4582554;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem==5){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);*/

        /** reverse a number (1st method) **/
        /*int n = 784562;
        while(n>0){
            int rem = n%10;
            int arr[] = new int[1];
            arr[0] = rem;
            n = n/10;
            System.out.print(arr[0]);
        }*/

        /** reverse a number (2nd method) **/
        /*int n = 547856;
        int ans = 0;

        while(n>0){
            int rem = n%10;
            n = n/10;
            ans = ans*10+rem;
        }
        System.out.print(ans);*/

        /** Palindrome **/
        /*int num = 859;
        int originalNumb = 859;
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            num = num/10;
            ans = ans*10+rem;
        }
        System.out.println(ans);

        if(ans == originalNumb){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");

         }*/

        /** armstrong number **/
       /* int n = 371;
        int sum = 0;
        int originalnumber = n;

        while (n != 0) {
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
        }
        System.out.println(sum);

        if (sum == originalnumber) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not a armstrong number");
        }*/




    }
}
