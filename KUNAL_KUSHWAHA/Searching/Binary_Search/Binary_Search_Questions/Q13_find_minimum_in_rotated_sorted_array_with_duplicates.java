package Searching.Binary_Search.Binary_Search_Questions;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/

public class Q13_find_minimum_in_rotated_sorted_array_with_duplicates {


        static int findMin(int[] nums) {

            int low = 0;
            int high = nums.length-1;

            while(low < high){
                int mid = (low + high)/2;

                if(nums[mid] > nums[high]){
                    low = mid + 1;
                }else if(nums[mid] < nums[high]){
                    high = mid;
                }else{
                    if(nums[high] < nums[high - 1]) return nums[high];
                    high--;
                }
            }
            return nums[low];

        }

    public static void main(String[] args) {

        int[] nums = {2, 2, 2, 0, 1, 1, 1, 2};

        System.out.println(findMin(nums));

    }


}
