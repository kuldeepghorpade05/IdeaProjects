import java.util.*;

class Q21_Next_permutation {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(2, 1, 5, 4, 3, 0, 0);
        List<Integer> ans = nextPermutation(arr);

        System.out.println(ans);

    }

    static List<Integer> nextPermutation(List<Integer> arr) {

        int n = arr.size();

        int index = -1;
        //find the dip - index
        for (int i = n - 2; i >= 0; i--) {
            if (arr.get(i) < arr.get(i + 1)) {
                index = arr.get(i);
                break;
            }
        }

        //test case
        if (index == -1) {
            Collections.reverse(arr);
            return arr;
        }

        //swaps
        for (int i = n - 1; i > index; i--) {
            if (arr.get(i) > arr.get(index)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(index));
                arr.set(index, temp);
                break;
            }
        }

        //reverse
        List<Integer> sublist = arr.subList(index + 1, n);
        Collections.reverse(sublist);
        return arr;

    }
}



// function to swap
//    static void swap(int[] arr, int right, int left){
//        int temp = arr[right];
//        arr[right] = arr[left];
//        arr[left] = temp;
//    }

//function to reverse
//    static void reverse(int[] arr, int left, int right){
//        while(left < right){
//            swap(arr, left, right);
//            left++;
//            right--;
//        }
//    }




