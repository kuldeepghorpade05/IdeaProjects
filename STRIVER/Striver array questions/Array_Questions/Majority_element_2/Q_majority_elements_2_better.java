package Majority_element_2;

import java.util.*;

public class Q_majority_elements_2_better {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 2, 1, 1, 3};




    }




/* Optimal approch Time Complexity => O(n) Space Complexity => O(1) */
//public static List<Integer> bm(int[] arr){
//    int cnt1 = 0;
//    int cnt2 = 0;
//    int el1 = Integer.MIN_VALUE;
//    int el2 = Integer.MIN_VALUE;
//
//    for(int i=0; i<arr.length; i++){
//        if(cnt1 == 0 && el2 != arr[i]){
//            cnt1 = 1;
//            el1 = arr[i];
//        } else if (cnt2 == 0 && el1 != arr[i]) {
//            cnt2 = 1;
//            el2 = arr[i];
//        } else if (arr[i] == el1) {
//            cnt1++;
//        } else if (arr[i] == el2) {
//            cnt2++;
//        }else {
//            cnt1--;
//            cnt2--;
//        }
//    }
//
//    cnt1 = 0;  cnt2 = 0;
//    for(int i=0; i<arr.length; i++){
//        if (arr[i] == el1) cnt1++;
//        if (arr[i] == el2) cnt2++;
//    }
//
//    List<Integer> ans = new ArrayList<>();
//    if (cnt1 >= arr.length/3 + 1) ans.add(el1);
//    if (cnt2 >= arr.length/3 + 1 && el1 != el2) ans.add(el2);
//
//    return ans;
//}





/*  better approch Time Complexity => O(n)  */
//    public static List<Integer> bt2(int[] arr){
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        Set<Integer> ans = new HashSet<>();
//
//        for(int i=0; i<arr.length; i++){
//            int val = hashMap.getOrDefault(arr[i], 0);
//            hashMap.put(arr[i], val + 1);
//            if (hashMap.get(arr[i]) > arr.length / 3) {
//                ans.add(arr[i]);
//            }
//        }
//        return new ArrayList<>(ans);
//    }





/*  better approch-1 Time Complexity => O(n)  */
//    public static List<Integer> majorityelement_better(int[] arr){
//
//        HashMap<Integer, Integer> mpp = new HashMap<>();
//        Set<Integer> ans = new HashSet<>();
//
//        for(int i=0; i<arr.length; i++){
//            int value = mpp.getOrDefault(arr[i], 0);
//            mpp.put(arr[i], value + 1);
//        }
//
//        for(Map.Entry<Integer,Integer> i : mpp.entrySet()){
//            if(i.getValue() > (arr.length/3)){
//                ans.add(i.getKey());
//            }
//        }
//        return new ArrayList<>(ans);
//    }



/*  brute force approch Time Complexity => O(n^2)  */
//    public static List<Integer> mj2(int[] arr){
//        Set<Integer> ans = new HashSet<>();
//
//        for(int i=0; i<arr.length; i++){
//            int count = 0;
//            for(int j=0; j<arr.length; j++){
//                if(arr[i] == arr[j]) count++;
//            }
//            if(count > arr.length/3) ans.add(arr[i]);
//        }
//        return new ArrayList<>(ans);
//    }








}
