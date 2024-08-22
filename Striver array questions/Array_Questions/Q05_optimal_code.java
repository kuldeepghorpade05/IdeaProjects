public class Q05_optimal_code {

    /** TC = o(2n)  **/
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        int d = 2;

        // reverse till d
        reverse(arr,0,d);
        //reverse the rest sfter the d
        reverse(arr,d+1,arr.length-1);
        // reverse full array
        reverse(arr,0,arr.length-1);


        for(int i:arr){
            System.out.print(i+" ");
        }

    }


    //reverse function
    static void reverse(int[] arr, int start, int end) {

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


}
