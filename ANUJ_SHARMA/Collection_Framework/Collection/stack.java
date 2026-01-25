package Collection_Framework.Collection;

import java.util.ArrayDeque;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {

//        Stack<String> fruits = new Stack<>();
//
//        fruits.push("a");
//        fruits.push("r");
//        fruits.push("t");
//        fruits.push("u");
//        fruits.push("l");
//
//        System.out.println(fruits);
//
//        System.out.println(fruits.peek());
//        System.out.println(fruits.pop());
//
//        System.out.println(fruits);
//
//        System.out.println(fruits.isEmpty());

        // STACK USING ARRAYDEQUE - USE THIS INSTEAD OF STCAK CLASS

        ArrayDeque<Integer> stck = new ArrayDeque<>();

        stck.push(74);
        stck.push(58);
        stck.push(45);
        stck.push(96);

        System.out.println(stck);
        stck.pop();
        System.out.println(stck);









    }

}
