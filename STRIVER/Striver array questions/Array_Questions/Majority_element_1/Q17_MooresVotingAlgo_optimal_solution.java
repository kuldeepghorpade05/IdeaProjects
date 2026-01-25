package Majority_element_1;

/* TC = O(N) Moore's Voting Algorithm */

public class Q17_MooresVotingAlgo_optimal_solution {
    public static void main(String[] args) {

        //        int[] arr = {2, 2, 3, 3, 1, 2, 2};

        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(MooreVoting(arr));

    }

   public static int MooreVoting(int[] arr){

       int count = 0;
       int candidate = 0;

       for(int i=0; i<arr.length; i++){
           if(count == 0){
               count = 1;
               candidate = arr[i];
           }
           if(arr[i] == candidate) count++;
           else count--;
       }

       count = 0;
       for(int i=0; i<arr.length; i++){
           if(arr[i] == candidate) count++;
       }
       return (count > arr.length/2) ? candidate : -1;
    }

}
