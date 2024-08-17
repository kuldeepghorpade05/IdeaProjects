import java.util.*;
// coder-army

public class quickSort {

               /** partition **/
public static int partition(int arr[], int low, int high){

    int pos = low;
    for(int i=low; i<=high; i++){
        if(arr[i] <= arr[high]){
            //swap                         //Collections.swap(arr[i],arr[pos]);
          int temp = arr[i];
          arr[i] = arr[pos];
          arr[pos] = temp;

          pos++;
        }
    }
    return pos-1;
}

                  /** quicksorting **/
public static void quickSorting(int arr[], int low, int high){

     //base condition
     if(low >= high) return;

     //to make partition
     int pivot = partition(arr,low,high);
     //left
     quickSorting(arr,low,pivot-1);
     //right
     quickSorting(arr,pivot+1,high);

 }


                       /** main **/
    public static void main(String[] args){

        int arr[] = {74,58,69,25,32,12,45,8};

        quickSorting(arr, 0,arr.length-1);

        for(int i=0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }












    }
}
