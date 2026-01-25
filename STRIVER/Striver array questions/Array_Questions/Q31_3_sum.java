import java.util.*;
import java.util.Arrays;


public class Q31_3_sum {

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4}; int target = 0;



    }


    /* optimal approch Time Complexity = O(n^2) */
//    public static List<List<Integer>> threesum3(int[] arr){
//
//        Arrays.sort(arr);
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for(int i=0; i<arr.length; i++){
//            if(i>0 && arr[i] == arr[i-1]) continue;
//            //pointers
//            int left = i+1;    int right = arr.length-1;
//
//            while(left < right){
//                int sum = arr[i] + arr[left] + arr[right];
//
//                if(sum == 0){
//                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
//                    left++;
//                    right--;
//
//                    while(left < right && arr[left] == arr[left - 1]) left++;
//                    while(left < right && arr[right] == arr[right + 1]) right--;
//                }else if(sum < 0) left++;
//                else right--;
//            }
//        }
//        return ans;
//    }



    /* better apporch Time Complexity = O(n^2) */
//    public static List<List<Integer>> threesum2(int[] arr){
//
//        Set<List<Integer>> ans = new HashSet<>();
//
//        for(int i=0; i<arr.length; i++){
//            Set<Integer> hashSet = new HashSet<>();
//            for(int j=i+1; j<arr.length; j++){
//                int third = - (arr[i] + arr[j]);
//                if(hashSet.contains(third)){
//                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
//                    Collections.sort(temp);
//                    ans.add(temp);
//                }
//                hashSet.add(arr[j]);
//            }
//
//        }
//        return new ArrayList<>(ans);
//    }



    /* time complexity = O(n^3) extreme brute approch */
//    public static List<List<Integer>> threesum(int[] arr, int target){
//
//        Set<List<Integer>> store = new HashSet<>();
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                for(int k=j+1; k<arr.length; k++){
//                    int sum = arr[i] + arr[j] + arr[k];
//                    if(sum == target){
//                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
//                        Collections.sort(triplet);
//                        store.add(triplet);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(store);
//    }



}
