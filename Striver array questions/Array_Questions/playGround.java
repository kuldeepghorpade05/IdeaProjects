
import java.lang.reflect.Array;
import java.util.*;

class playGround {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6, 7};

        ArrayList<Integer> intesec = inter(arr1,arr2);
        System.out.print(intesec+" ");


    }


    static ArrayList<Integer> inter(int[] a, int[] b) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> merge = new ArrayList<>();

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (b[j] < a[j]) {
                j++;
            } else {
                merge.add(a[i]);
                i++;
                j++;
            }
        }

        return merge;
    }


    }










