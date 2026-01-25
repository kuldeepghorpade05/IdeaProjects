import java.util.*;
import java.util.Arrays;

// Time complexity = O(n log n)
public class Q29_merge_overlapping_intervals_optimal {

    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        List<List<Integer>> result = merge(intervals);

        for (List<Integer> interval : result) {
            System.out.print("[" + interval.get(0) + "," + interval.get(1) + "] ");
        }

    }

    public static List<List<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0] ));

        List<List<Integer>> merged = new ArrayList<>();

        for (int[] i : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < i[0]){
                merged.add(Arrays.asList(i[0], i[1]));
            } else {
                int last = merged.size() - 1;
                int maxEnd = Math.max(merged.get(last).get(1), i[1]);
                merged.get(last).set(1, maxEnd);
            }
        }
        return merged;
    }


}




















