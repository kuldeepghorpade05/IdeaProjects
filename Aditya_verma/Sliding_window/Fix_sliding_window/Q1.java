package Sliding_window.Fix_sliding_window;//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {

            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N);

            // Appending new elements at
            // the end of the list
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x);
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){


        if(N < K){
            return -1;
        }


        long maxsum = 0;

        for(int i = 0; i < K; i++){
            maxsum = maxsum + Arr.get(i);
        }

        long windowsum = maxsum;


        for(int i = K; i < N; i++){
            windowsum = windowsum + Arr.get(i) - Arr.get(i - K);
            if(windowsum > maxsum){
                maxsum = windowsum;
            }
        }



        return maxsum;


    }


}