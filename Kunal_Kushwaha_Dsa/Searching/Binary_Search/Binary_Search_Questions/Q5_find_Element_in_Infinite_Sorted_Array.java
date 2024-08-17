package Searching.Binary_Search.Binary_Search_Questions;

/** Q5 : Position of an Element in Infinite Sorted Array **/

public class Q5_find_Element_in_Infinite_Sorted_Array {
    public static int findPosition(int[] arr, int target) {

        int low = 0;
        int high = 1;

        while (target > arr[high]) {

            int newstart = high + 1;
            high = high + (high - low + 1) * 2;
            low = newstart;

            if (high >= arr.length) {
                high = arr.length - 1; //make high index=last index of array
                if (target > arr[high])
                    return -1;
            }

        }
        return binarySearch(arr, target, low, high);
    }


    public static int binarySearch(int[] arr, int target, int low, int high)
    {
        while(low <= high)
        {
            int mid = low + (high-low) / 2;
            if(target == arr[mid])
                return mid;
            else if(target < arr[mid])
                high = mid-1;
            else if(target > arr[mid])
                low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {


        int arr[] = {12, 16, 23, 45, 55, 61, 78, 87, 96, 102, 201, 368};

        System.out.println(findPosition(arr,368));

    }




}
