

/* TC = O(N) Moore's Voting Algorithm */

public class Q17_MooresVotingAlgo_optimal_solution {
    public static void main(String[] args) {

        //        int[] arr = {2, 2, 3, 3, 1, 2, 2};

        int[] arr = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(MooreVoting(arr));

    }

    static int MooreVoting(int[] arr){
        
        int el = arr[0];
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                count = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                count++;
            }else {
                count--;
            }
        }

        int count1 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == el) count1++;

            if(count1 > arr.length/2){
                return el;
            }
        }

        return -1;
    }

}
