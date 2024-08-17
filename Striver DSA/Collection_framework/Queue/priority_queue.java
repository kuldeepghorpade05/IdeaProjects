package Collection_framework.Queue;
import java.util.*;

/** PRIORITY QUEUE - QUEUE **/

/**
  1. offer
  2. poll
  3. peek
 **/


public class priority_queue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        /**   Comparator.reverseOrder()    **/

        pq.offer(45);
        pq.offer(78);
        pq.offer(65);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.peek());





    }
}
