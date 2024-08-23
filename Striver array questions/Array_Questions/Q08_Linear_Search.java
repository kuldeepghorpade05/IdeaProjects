


public class Q08_Linear_Search {
    public static void main(String[] args) {

        int[] arr = {6, 7, 8, 4, 1};

        System.out.println(linearsearch(arr,4));

    }


    static int linearsearch(int[] arr, int num){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;

    }
}
