
import java.util.*;

class PLAYGROUND{
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(BuySellStocks(arr));

    }

    static int BuySellStocks(int[] arr){

        int minimum = arr[0];  int profit = 0;

        for(int i=1; i<arr.length; i++){
            int cost = arr[i] - minimum;

            profit = Math.max(profit,cost);
            minimum = Math.min(minimum, arr[i]);
        }
        return profit;
    }
  




}