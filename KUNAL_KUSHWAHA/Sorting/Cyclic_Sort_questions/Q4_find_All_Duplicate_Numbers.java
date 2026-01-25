package Sorting.Cyclic_Sort_questions;
import java.util.*;



public class Q4_find_All_Duplicate_Numbers {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = FindAllDuplicateNumber(arr);
        System.out.println(ans);

    }


    static List<Integer> FindAllDuplicateNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct  = nums[i] - 1;
            if(nums[i] != nums[correct]){
                //swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }

        }

        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }

}
