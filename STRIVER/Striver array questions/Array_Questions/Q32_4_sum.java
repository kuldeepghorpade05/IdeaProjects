import java.util.*;

public class Q32_4_sum {
    public static void main(String[] args) {







    }





/*  better+ approch Time complexity => O(n^3)  */
//    public static List<List<Integer>> foursum3(int[] arr, int target) {
//        Arrays.sort(arr);
//        List<List<Integer>> ans = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i > 0 && arr[i] == arr[i - 1]) continue;
//
//            for (int j = i + 1; j < arr.length; j++) {
//                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
//
//                int left = j + 1;
//                int right = arr.length - 1;
//
//                while (left < right) {
//                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
//
//                    if (sum == target) {
//                        ans.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
//
//                        while (left < right && arr[left] == arr[left + 1]) left++;
//                        while (left < right && arr[right] == arr[right - 1]) right--;
//
//                        left++;
//                        right--;
//                    } else if (sum < target) {
//                        left++;
//                    } else {
//                        right--;
//                    }
//                }
//            }
//        }
//        return ans;
//    }



/*  better approch Time Complexity => O(n^3)  */
//    public static List<List<Integer>> foursum2(int[] arr){
//        Set<List<Integer>> ans = new HashSet<>();
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                Set<Integer> hashset = new HashSet<>();
//                for(int k=j+1; k<arr.length; k++){
//                    int fourth = - (arr[i] + arr[j] + arr[k]);
//                    if(hashset.contains(fourth)){
//                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
//                        Collections.sort(temp);
//                        ans.add(temp);
//                    }
//                    hashset.add(arr[k]);
//                }
//            }
//        }
//        return new ArrayList<>(ans);
//    }


/* Extreme brute force approch Time Complexity => O(n^4)  */
//    public static List<List<Integer>> foursum(int[] arr){
//        Set<List<Integer>> ans = new HashSet<>();
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                for(int k=j+1; k<arr.length; k++){
//                    for(int l=k+1; l<arr.length; l++){
//                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
//                        if(sum == 0){
//                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
//                            Collections.sort(temp);
//                            ans.add(temp);
//                        }
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(ans);
//    }









}
