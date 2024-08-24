import java.util.ArrayList;

// TWO POINTERS (OPTIMAL SOLUTION)  TC = O(n1 + n2)

public class Q10_Intersection_of_2_sorted_array {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6, 7};

        ArrayList<Integer> inter = new ArrayList<>();
        inter = intersection(arr1,arr2);

        System.out.print(inter+" ");

    }

    static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;

        ArrayList<Integer> merge = new ArrayList<>();

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j] < arr1[i] ){
                j++;
            }else {
                merge.add(arr1[i]);
                i++;
                j++;
            }
        }
        return merge;
    }
}
