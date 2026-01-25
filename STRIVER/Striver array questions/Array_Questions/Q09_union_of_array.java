import java.util.*;

//  TWO POINTERS (OPTIMAL APPROACH)  TC = O(n1 + n2)

class Q09_union_of_array{
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.isEmpty() || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.isEmpty() || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }

        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
    public static void main(String args[]) {

        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}














































/** import java.util.*;
 // BRUTE FORCE APPROCH
class Q09_union_of_array{
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6, 7};

        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr2){
            System.out.print(i+" ");
        }
        System.out.println();

        Set<Integer> values =   unionarray(arr1,arr2);

        System.out.print(values+" ");


    }

    static Set<Integer> unionarray(int[] arr1, int[] arr2){

        Set<Integer> unique = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            unique.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            unique.add(arr2[i]);
        }

        return unique;


 }

} **/