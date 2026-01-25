import java.util.ArrayList;

public class Q24_merge_sorted_Arrays {
    public static void main(String[] args) {

        int[] leftarr = {1, 3, 5, 7}; int[] rightarr = {0, 2, 6, 8, 9};
        // 0, 1, 2, 3, 5, 6, 7, 8, 9

        ArrayList<Integer> res = merged(leftarr, rightarr);

        for (int i:res){
            System.out.print(i+" ");
        }
    }

    public static ArrayList<Integer> merged(int[] arr1, int[] arr2){

        int i = 0; int j = 0;

        ArrayList<Integer> storage = new ArrayList<>();

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                storage.add(arr1[i]);
                i++;
            }else {
                storage.add(arr2[j]);
                j++;
            }
        }

        while(i < arr1.length){
            storage.add(arr1[i]);
            i++;
        }

        while(j < arr2.length){
            storage.add(arr2[j]);
            j++;
        }

        return storage;
    }


}