package Searching.Linear_Search;

// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

public class Q_Search_in_Rotated_Sorted_Array_2 {
    class Solution {
        public boolean search(int[] nums, int target) {

            for(int i=0; i<=nums.length-1; i++){
                if(nums[i] == target){
                    return true;
                }
            }
            return false;
        }
    }


}
