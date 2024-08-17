package sorting;

class printselection {

    public static void pa(int arr[]) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

public class selectionsort {
    public static void main(String[] args) {

        int arr[] = {45, 78, 5, 65, 98, 36};


        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        printselection.pa(arr);

//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();



    }
}
