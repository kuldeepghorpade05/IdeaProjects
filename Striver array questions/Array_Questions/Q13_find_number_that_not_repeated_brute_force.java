
/** TC = O(n^2)  **/
/** brute force approach **/
public class Q13_find_number_that_not_repeated_brute_force {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(findone(arr));

    }

    static int findone(int[] arr){
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1) return num;
        }
        return -1;
    }


}
