import java.util.Arrays;

/* TC = O(N) + O(N LOG N)  - USING TWO POINTERS APPROCH*/

public class Q15_two_sum_using_two_pointers {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int[] ans = sumof(arr,14);
        System.out.println(Arrays.toString(ans));

    }

    static int[] sumof(int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                return new int[]{arr[left], arr[right]};
            }else if(sum < target) left++;
            else right--;
        }
        return new int[]{-1,-1};
    }

}
