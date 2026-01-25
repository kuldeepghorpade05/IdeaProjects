package Searching.Binary_Search.Binary_Search_Questions;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1640089344/

import java.util.Arrays;

public class Q4_Find_First_and_Last_Position_of_Element_in_Sorted_Array{

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        // check for first occurance if target first
        ans[0] = search(nums, target, true);
        // check for second occurance if target first
        ans[1] = search(nums, target,false);

        return ans;
    }


    // this function just returne the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {5, 6,  7, 7, 7, 7, 8, 8, 8, 10, 10};

        System.out.println(Arrays.toString(searchRange(arr,10 )));


    }
}












class brute{

    // 1st brute approch using 2 ppointers
    static int[] elemnetindexes(int[] arr, int target){

        int first = -1;
        int last = -1;

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            if(arr[start] == target && first == -1){
                first = start;
            }
            if(first == -1) start++;


            if(arr[end] == target && last == -1){
                last = end;
            }
            if(last == -1) end--;

            //stop if both are found
            if(first != -1 && last != -1) break;
        }
        return new int[]{first,last};
    }


    // 2nd brute approch
    static int[] elemnetindexes1(int[] arr, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                first = i;
                break;
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                last = i;
                break;
            }
        }

        return new int[]{first, last};
    }



}
