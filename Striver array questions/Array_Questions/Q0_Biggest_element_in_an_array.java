

public class Q0_Biggest_element_in_an_array {

    public static void main(String[] args) {

        int arr[] = {3, 2, 1, 5, 2};
        System.out.println(biggestelement(arr));


    }

    static int biggestelement(int[] arr) {

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;

    }

    /** TC = O(N) **/


}

