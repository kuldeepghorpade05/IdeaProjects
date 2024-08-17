package Searching.Binary_Search;

import java.util.*;

public class Binary_Search {

    public static int bs(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int steps = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            steps++;
            System.out.println("steps : " + steps);
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {12, 16, 25, 36, 42, 56, 64, 73, 89};

        int indx = bs(arr, 73);
        System.out.println("index : " + indx);

    }
}
