import java.util.List;

public class Pascals_Triangle {
    public static void main(String[] args) {

        generateTriangle(5);
//        generateRow(5);

    }

    /** time complexity => O(n^2) */
    public static void generateTriangle(int n) {
        for (int r = 1; r <= n; r++) {
            long val = 1;
            for (int c = 1; c <= r; c++) {
                System.out.print(val + " ");
                val = val * (r - c) / c;
            }
            System.out.println();
        }
    }


    /** time complexity => O(n) */
    public static void generateRow(int r) {
        long val = 1;
        System.out.print(val + " ");

        for (int c = 1; c < r; c++) {
            val = val * (r - c) / c;
            System.out.print(val + " ");
        }
    }


}
