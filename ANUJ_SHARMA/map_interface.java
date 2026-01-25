import java.util.*;

public class map_interface {
    public static void main(String[] args) {

        // map does not have collection interface features

        Map<String,Integer> mp = new HashMap<>();

        mp.put("one",1);
        mp.put("two",2);
        mp.put("three",3);
        mp.put("four",4);
        mp.put("five",5);
        mp.put("six",6);

//        System.out.println(mp);
//
//        mp.remove("four");
//
//        System.out.println(mp);
//
//        System.out.println(mp.containsKey("six"));
//
//        System.out.println(mp.get("five"));


        // traverse and get or print keys
//        Set<String> keys = mp.keySet();
//        System.out.println(keys);

        // we can directly put into arraylist
//        ArrayList<String> keys = new ArrayList<>(mp.keySet());




        //traverse and get or print values
//        Collection<Integer> val = mp.values();
//        System.out.println(val);


        // travserse and get key value pair
        Set<Map.Entry<String, Integer>> entries = mp.entrySet();

        for(Map.Entry<String, Integer> entry:entries){
            System.out.println(entry.getKey() +", "+entry.getValue());
        }





    }
}
