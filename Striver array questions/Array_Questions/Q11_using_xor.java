
import java.util.*;

/** TC = O(N) using xor^ method **/
class Q11_using_xor {
    public static int missingNumber(int []a, int N) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number

//        int missingnum = xor1 ^ xor2;
//        return missingnum;

    }

    public static void main(String args[]) {

        int a[] = {1, 2, 4, 5};
        int N = a.length + 1;

        int ans = missingNumber(a, N);
        System.out.println(ans);
    }
}

