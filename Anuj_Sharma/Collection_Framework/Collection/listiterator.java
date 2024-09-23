package Collection_Framework.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listiterator {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("kiwi");
        fruits.add("papaya");
        fruits.add("mango");
        fruits.add("apple");

        //normal for loop iterartor
//        for(int i=0; i<fruits.size(); i++){
//            System.out.println(fruits.get(i));
//        }

        //for each loop
//        for(String i:fruits){
//            System.out.println(i);
//        }

        // Iterator class - from collection
//        Iterator<String> fe = fruits.iterator();
//        while(fe.hasNext()){
//            System.out.println(fe.next());
//        }


        // Iterator class - from collection
//        Iterator<String> fe = fruits.listIterator();
//        while(fe.hasNext()){
//            System.out.println(fe.next());
//        }

        List<String> sublist = fruits.subList(1,3);
        System.out.println(sublist);






    }
}
