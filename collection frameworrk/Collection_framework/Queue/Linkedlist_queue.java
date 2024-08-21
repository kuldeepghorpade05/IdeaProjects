package Collection_framework.Queue;
import java.util.*;


/** QUEUE - LinkedList **/

/** 1. offer
    2. poll()
    3. peek()
 */

public class Linkedlist_queue {
    public static void main(String[] args) {

        Queue<Integer> q1 = new LinkedList<>();

        /** offer **/
        q1.offer(12);
        q1.offer(42);
        q1.offer(16);
        q1.offer(78);

        System.out.println(q1);

        for(Integer i : q1){
            System.out.println(i);
        }

        /** poll() **/
        System.out.println(q1.poll());

        System.out.println(q1);

        /** peek() **/
        System.out.println(q1.peek());





    }
}
