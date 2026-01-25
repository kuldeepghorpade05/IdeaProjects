package Searching.Binary_Search.Binary_Search_Questions;
//https://leetcode.com/problems/find-in-mountain-array/

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Q8_Find_In_Mountain_Array {

    public static void main(String[] args) {

        int[] mountainArr = {1, 3, 5, 7, 6, 4, 2};
        int target = 3;

        System.out.println( findInMountainArray(target, mountainArr));
    }

    public static int findInMountainArray(int target, int[] arr) {
        int peakresult = findpeak(arr);

        int index = agbs(arr, target, 0, peakresult, true);

        if(index != -1) return index;

        return agbs(arr, target, peakresult + 1, arr.length - 1, false);
    }

    // Agnostic Binary Search
    static int agbs(int[] arr, int target, int low, int high, boolean isAsc) {
        while(low <= high){
            int mid = (low + high)/2;

            if(target == arr[mid]) return mid;

            //TRUE
            if(isAsc){
                if(target > arr[mid]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else{ //FALSE
                if(target < arr[mid]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    // Find Peak
    static int findpeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}


// leetcode answer below

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

 /*class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {

        int peakresult = findpeak(mountainArr);

        int index = agbs(mountainArr, target, 0, peakresult, true);

        if(index != -1) return index;

        return agbs(mountainArr, target, peakresult + 1, mountainArr.length()-1, false);

    }



    //agnostic binary search
    static int agbs(MountainArray arr, int target, int low, int high, boolean isAsc){

        while(low <= high){
            int mid = (low + high)/2;

            if(target == arr.get(mid)) return mid;

            //for ascending
            if(isAsc == true){
                if(target > arr.get(mid)){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else{
                // for desending
                if(target < arr.get(mid)){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }

        }
        return -1;
    }



    //to find peak
    static int findpeak(MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

} */