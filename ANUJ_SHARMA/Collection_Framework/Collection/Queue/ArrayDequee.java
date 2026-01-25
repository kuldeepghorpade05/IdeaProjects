package Collection_framework.Queue;
import java.util.*;
import java.util.ArrayDeque;
/**  QUEUE - ARRAYDEQUE  **/

/**
 1. offer
 2. offerFirst
 3. offerLast

 4. peek
 5. peekFirst
 6. peekLast

 7. poll
 8. pollFirst
 9. PollLast

 **/

/** QUEUE -  ARRAYDEQUEUE  **/

public class ArrayDequee {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        /** offer --------------------------------------------- **/
        adq.offer(78);
        adq.offer(54);
        adq.offer(15);
        adq.offer(36);
        adq.offer(25);

        System.out.println(adq);

        /** offerFirst **/
        adq.offerFirst(85);

        System.out.println(adq);

        /** offerLast **/
        adq.offerLast(65);
        System.out.println(adq);

        /** peek -------------------------------------------------- **/
        System.out.println(adq.peek());
        /** peekFirst elements **/
        System.out.println(adq.peekFirst());
        /** peekLast elements **/
        System.out.println(adq.peekLast());


        /** poll --------------------------------------------------- **/
        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        /** pollFirst elements **/
        System.out.println(adq.pollFirst());
        System.out.println("poll() " + adq);

        /** pollLast elements **/
        System.out.println(adq.pollLast());
        System.out.println("poll() " + adq);









    }
}
