import java.lang.reflect.Array;
import java.util.*;

public class Q001_Second_largest_element_in_an_array {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 7, 7, 5};
        int n = arr.length;

        int[] result = getSecondOrderElements(arr, n);
        System.out.println(Arrays.toString(result));


        
    }

    static int secondLargestFunc(int[] arr, int n) {

        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }

        return slargest;
    }

    static int secondSmallestFunc(int[] arr, int n) {
        
        //test case
        if(n < 2){
            return -1;
        }

        int smallest = Integer.MIN_VALUE;
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }

        return ssmallest;
    }

    static int[] getSecondOrderElements(int[] arr, int n) {

        int sl = secondLargestFunc(arr, n);
        int ss = secondSmallestFunc(arr, n);

        return new int[]{sl, ss};
    }
}

/** TC - 0(N)  **/