

public class Q07_optimal_solution {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        shiftzerooptimal(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }


    }


    static int[]  shiftzerooptimal(int[] arr){
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                //swap
                if(i != j){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }



}
