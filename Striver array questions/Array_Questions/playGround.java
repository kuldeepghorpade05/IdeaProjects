
import java.util.*;

class playGround{
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6, 7};

        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:arr2){
            System.out.print(i+" ");
        }
        System.out.println();

        Set<Integer> values =   unionarray(arr1,arr2);

        System.out.print(values+" ");


    }

    static Set<Integer> unionarray(int[] arr1, int[] arr2){

        Set<Integer> unique = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            unique.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            unique.add(arr2[i]);
        }

        return unique;


    }






}