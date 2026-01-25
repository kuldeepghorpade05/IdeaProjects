package Searching.Binary_Search.Binary_Search_Questions;

public class Q11_Find_Rotation_Count {


    static int RotationIndex(int[] arr){
        int low = 0;;
        int high = arr.length-1;

        while(low < high){
            int mid = (low + high)/2;

            if(arr[mid] > arr[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        // returns  index
        return low;
    }


    /** method 01 **/
   /* static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end)/2;
            //case 1
            if( mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // case 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            // case 3
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                // case 4
                start = mid + 1;

            }
        }
        return -1;
    }*/

//    static int Rotationcount(int[] arr){
//        int pivot = findpivot(arr);
//        return pivot + 1;
//
//    }



    /** method 02 **/
    /** directly returns the count of rotation of array without using another method (modified FindPivot method) **/
  /* static int findRotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            //case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            // case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            }
            // case 3
            if (arr[mid] <= arr[start]) {
                end = mid;
            } else {
                // case 4
                start = mid + 1;

            }
        }
        return -1;
    }*/

    public static void main(String[] args) {

        int[] arr = {8, 9, 10, 11, 12, 0, 2, 4, 5, 6, 7};

        System.out.println(RotationIndex(arr));


    }

}
