package Collection_Framework.Collection;

import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {

        /* USING DEQUE - WE CAN CREATE STACK | QUEUE | DEQUE */

        // DEQUE

        //adding elements----------
        // addFirst | offerFirst
        // addlast | offerLast

        //removing elements-------
        // removeFirst | pollFirst
        // removelast | pollLast

        //accessing elements-----------
        // getFirst | peekFirst
        // getLast | peekLast



        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10); // inserts from lasts
        dq.addFirst(45); // inserts from first
        dq.addLast(52); // inserts from last

        System.out.println(dq);

        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq);

    }
}
