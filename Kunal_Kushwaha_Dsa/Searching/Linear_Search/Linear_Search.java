package Searching.Linear_Search;

class linearSearch{

    /** Searching.Linear_Search.linearSearch for numbers **/
    static int ls(int arr[], int n){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    /** Searching.Linear_Search.linearSearch for string **/
    static boolean lsb(String str, char n){
        for(int i=0; i<=str.length()-1; i++){
            if(str.charAt(i)==n){
                return true;
            }
        }
        return false;
    }

    /** linear search on 2d array **/
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

    /** finding maximum element in 2d array **/
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





}



public class Linear_Search {
    public static void main(String[] args) {

        /** for numbers **/
//        int arr[] = {45, 54, 25, 36, 87, 41 };
//        System.out.println(Searching.Linear_Search.linearSearch.ls(arr,20));

        /** for string **/
       // String str = "kuldeep";
        //System.out.print(Searching.Linear_Search.linearSearch.lsb(str,'o'));

       // System.out.println(Arrays.toString(str.toCharArray()));

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

        System.out.println(linearSearch.max2d(arr));

        //System.out.println(Integer.MIN_VALUE);








    }
}
