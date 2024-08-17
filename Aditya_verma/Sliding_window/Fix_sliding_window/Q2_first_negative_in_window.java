package Sliding_window.Fix_sliding_window;
import java.util.*;


public class Q2_first_negative_in_window {


    public static void main(String[] args) {

    }

    static List<Integer> ans(int[] arr, int k, int n){

        int i = 0;
       while(i < arr.length){
           ArrayList<Integer> store = new ArrayList<Integer>();
           if(arr[i] < 0){
               store.add(arr[i]);
           }else {
               i++;
           }
       }

        
    }





}
