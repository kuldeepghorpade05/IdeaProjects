package Searching.Binary_Search.Binary_Search_Questions;

/** Find Peak Element **/ //Same like Question 06

public class Q7_Find_Peak_Element {
    public static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(arr));


    }
}
