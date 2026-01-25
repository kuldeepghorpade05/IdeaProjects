package Sorting.Cyclic_Sort_questions;
import java.util.*;

public class Q2_findDisappearedNumbers{


    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = findDisappearedNumbers(nums);
        System.out.println(missingNumbers); // Output: [5, 6]

    }


        static  List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                } else {
                    i++;
                }
            }

            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    ans.add(index + 1);
                }
            }

            return ans;

        }





  }