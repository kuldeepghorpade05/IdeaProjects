

/**  TC = O(N) XOR TECHNIQUE **/
class Q13_xor_optimal_solution {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(findone(arr));
    }

    static int findone(int[] arr){
        int xor = 0;
      for( int i=0; i<arr.length; i++){
          xor = xor ^ arr[i];
      }
      return xor;
    }

}

