
//  brute force solution TL -> O(n^2)

public class Q26_count_inversions {
    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 4, 1};

        System.out.println(countInversions(arr));

    }

    static int countInversions(int[] arr){

        int count = 0;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    count += 1;
                }
            }
        }
        return count;
    }

}
