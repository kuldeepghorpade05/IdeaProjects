import java.util.ArrayList;

//optimal soution TL -> O(n log n)
public class Q26_count_inversion_optimal_solution {
    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 1, 4};
        int res = countInversionOptimal(arr);
        System.out.println(res);

    }

    static int cnt = 0;
    public static void mergesort(int[] arr, int low, int high){
        //base case
        if(low >= high) return;

        //mid
        int mid = (low + high)/2;

        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);

        merge(arr, low, mid, high);

    }

    public static void merge(int[] arr, int low, int mid, int high){
        //temp arr
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else {
                temp.add(arr[right]);
                cnt += (mid  - left + 1);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i - low);
        }

    }

    public static int countInversionOptimal(int[] arr){
        mergesort(arr, 0, arr.length-1);
        return cnt;
    }
}
