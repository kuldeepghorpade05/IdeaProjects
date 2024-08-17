package Searching.Binary_Search.Binary_Search_Questions;

public class Q3_next_Greatest_Letter {

    public static int nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target >= letters[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            /** above condion is also same as below condition  **/

//            if (target < letters[mid]) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
        }
        /** low % arr.length ex: low will be exceed array length and arr.length = 6 and  low after exceed array length both will be equal numbers like : 6 % 6 = 0   **/
         return letters[low % letters.length];

    }


    public static void main(String[] args) {

        char[] arr = {'d', 'f','j','n','p','s'};
        System.out.println((char)nextGreatestLetter(arr,'s'));

        //System.out.println(arr[0]);







    }
}
