package Searching.Binary_Search.Binary_Search_Questions;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/


public class Q12_find_minimum_in_rotated_sorted_array {


        static int findMin(int[] nums) {

            int low = 0;
            int high = nums.length-1;

            while(low < high){
                int mid = (low + high)/2;

                if(nums[mid] > nums[high]){
                    low = mid + 1;
                }else {
                    high = mid;
                }
            }
            //returns element
            return nums[low];

        }

    public static void main(String[] args) {

      int[]  nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));

    }

}
