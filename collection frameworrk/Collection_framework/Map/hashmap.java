package Collection_framework.Map;
import java.util.*;
import java.util.Map;

/**
 1. put
 2. (containskey)
 3. (putIfAbsent)
 4. iterate - method 1
 5. iterate - method 2
 5. containskey
 6. containsvalue
 7. isEmpty
 8. clear
 9. remove


 **/

/** MAP -  HASHMAP **/
public class hashmap {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
        numbers.put("four",4);

        numbers.remove("two" );
        System.out.println(numbers);


        /** overides values if we insert same value with same key **/
        //numbers.put("four", 74);

       /* if(!numbers.containsKey("two")){
            numbers.put("four", 74);
         }
        System.out.println(numbers); */

         /** OR **/

        /* numbers.putIfAbsent("five",5);
        System.out.println(numbers); */

        //System.out.println(numbers);

        //method 1 to iterate map
        /** iterate map key - values -------------------------------------- **/

        for(Map.Entry<String, Integer> e : numbers.entrySet()){
            /** to get key and value **/
            //System.out.println(e);
            /** to get only key **/
            //System.out.println(e.getKey());
            /** to get only value **/
            //System.out.println(e.getValue());
        }

        //method 2 to iterate map
        /** to get only keys **/
//        for(String key : numbers.keySet()){
//            System.out.println(key);
//        }

        /** to get only values **/
//        for(int value : numbers.values()){
//            System.out.println(value);
//        }

        /** contains **/
//        System.out.println(numbers.containsKey("nine"));
//        System.out.println(numbers.containsValue(4));

        /** to check if map is empty **/
//        System.out.println(numbers.isEmpty());

        /** clear the map **/
//        numbers.clear();
//        System.out.println(numbers);






    }
}
