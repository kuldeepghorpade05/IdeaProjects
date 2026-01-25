package Collection_Framework.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {

        /* in priority queue - it sorts in ascending order and implements min heap
         and every time we poll and element it will remove smallest element */

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(74);
        pq.offer(25);
        pq.offer(95);
        pq.offer(85);
        pq.offer(84);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);







    }
}
