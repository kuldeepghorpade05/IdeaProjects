
/** TWO POINTERS - OPTIMAL APPROACH **/

public class Q003_Remove_duplicates_in_place_sorted_array {

    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        int k = removeduplicates(arr);

        for(int i=0; i<k; i++){
            System.out.print(arr[i]+" ");
        }


    }

    static int removeduplicates(int[] arr){

        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }




}
