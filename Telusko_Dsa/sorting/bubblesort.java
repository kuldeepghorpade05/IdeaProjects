package sorting;

class printbubble {

    public static void pa(int arr[]) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

public class bubblesort {
    public static void main(String[] args) {

        /** BUBBLE SORT **/

        int arr[] = {78, 45, 5, 69, 32, 25, 74};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


       // printbubble.pa(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();




    }
}
