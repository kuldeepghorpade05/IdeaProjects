

public class Q05_left_rotate_an_array_by_D_places {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

    }

    static void roatebyDplaces(int[] arr, int d){
        int n = arr.length;
        int temp[] = {arr[0], arr[1], arr[3]};

        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }

        for(int i=n-d; i<n; i++){
            arr[i] = temp[i-(n-d)];
        }
    }


}
