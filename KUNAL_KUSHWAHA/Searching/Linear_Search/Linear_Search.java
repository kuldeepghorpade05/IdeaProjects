package Searching.Linear_Search;
import java.util.*;

class linearSearch{

    /** linearSearch for number(target) **/
    static int ls(int arr[], int n){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    /** linearSearch for string char **/
    static boolean lsb(String str, char n){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==n){
                return true;
            }
        }
        return false;
    }

    /** returns index of char in string using linear search **/
    static int lichar(String str, char n) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == n) {
                return i;
            }
        }
        return -1;
    }

    /** linear search in string to find a char using for each loop and toCharArray method **/
    static boolean linforeach(String str,  char target){
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }

    // ------------------------------- 2D linear search -----------------------------------------------------

    /** linear search on 2d array **/
    // returns indexes of target
    static int[] linear2DA(int[][] arr, int target){
      for (int row=0; row<arr.length; row++){
          for (int col=0; col<arr[row].length; col++){
              if(arr[row][col]==target){
                  return new int[]{row, col};
              }
          }
      }
      return new int[]{-1, -1};
    }

 /** returns true false in linear search on 2d array **/
 // returns true false
    static boolean linearsearch2d(int[][] arr, int target){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    /** finding maximum element in 2d array **/
    // returns target
    static int max2d(int[][] arr){
        int max = arr[0][0];
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    /* find indexes of maximum no. linear search 2d array **/
    // returns indexes
    static int[] max2dlinear(int[][] arr){
        int max = arr[0][0];
        int row = 0;
        int col = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
//                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
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



public class Linear_Search {
    public static void main(String[] args) {

        /** for numbers **/
//        int arr[] = {45, 54, 25, 36, 87, 41 };
//        System.out.println(Searching.Linear_Search.linearSearch.ls(arr,20));

        /** for string **/
//        String str = "kuldeep";
//        System.out.print(Searching.Linear_Search.linearSearch.lsb(str,'o'));

//         creates string into charcter array
//        System.out.println(Arrays.toString(str.toCharArray()));



        /** linear search on 2d array **/
        int[][] arr = {
                {78, 45, 12},
                {74, 65, 3, 96},
                {72, 98, 14},
                {54, 9, 18, 7, 45}
        };

//        int target = 98;
//        int[] ans = Searching.Linear_Search.linearSearch.linear2DA(arr,target);
//        System.out.println(Arrays.toString(ans));

        /** finding maximum element in 2d array **/
//        System.out.println(linearSearch.max2d(arr));

        /* find indexes of maximum no. linear search 2d array **/
//        int[] ans = linearSearch.max2dlinear(arr);
//        System.out.println(Arrays.toString(ans));




//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);


//        System.out.println(linearSearch.maximumWealth(arr));








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