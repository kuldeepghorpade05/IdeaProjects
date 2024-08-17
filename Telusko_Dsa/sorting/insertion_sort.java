package sorting;

class printarray1{

    public static void pa1(int arr[]){
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();


    }

}

/** insertion sort **/
public class insertion_sort {
    public static void main(String[] args) {

        int arr[] = {45, 85, 96, 8, 65, 21, 19};

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];

            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

       printarray1.pa1(arr);

//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();



    }
}
