package Collection_framework.List;

/** LIST - STACK **/

import java.util.*;

/** STACK **/

/** 1. push
    2. pop
    3. peak()
 */

public class stackk {
    public static void main(String[] args) {

        Stack<String> animals =  new Stack<>();
        animals.push("lion");
        animals.push("dog");
        animals.push("horse");
        animals.push("cat");

//        for(String i : animals){
//            System.out.println(i);
//        }

//        Iterator<String> i = animals.listIterator();
//        while(i.hasNext()){
//           System.out.println(i.next());
//       }

        /** peek() to see the top element **/
        System.out.println(animals.peek());

        /** to pop (delete) top element**/
        animals.pop();

        System.out.println(animals.peek());
        System.out.println(animals );














    }
}
