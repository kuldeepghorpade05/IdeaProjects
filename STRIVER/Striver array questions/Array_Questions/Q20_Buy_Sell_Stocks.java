import java.util.*;

class Q20_Buy_Sell_Stocks{
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(stockbuysell(arr));


    }

    static int stockbuysell(int[] arr){

        int minimal = arr[0]; int profit = 0;

        for(int i=1; i<arr.length; i++){
            int cost = arr[i] - minimal;
            profit = Math.max(profit,cost);

            minimal = Math.min(minimal, arr[i]);
        }
        return profit;
    }

}