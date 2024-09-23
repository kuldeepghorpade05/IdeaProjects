package Collection_Framework.Collection;


import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Comparable_and_Comparator {
    public static void main(String[] args) {

        animal a1 = new animal(4,"ruby",45);
        animal a2 = new animal(3,"max",20);
        animal a3 = new animal(4,"jerry",35);
        animal a4 = new animal(5,"don",42);

        List<animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
//        System.out.println(dogs);

//        dogs.sort();

        Collections.sort(dogs);
        System.out.println(dogs);


    }
}

class animal implements Comparable<animal>{
    int age;
    String name;
    int weight;

    public animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}' +"\n";
    }

    @Override
    public int compareTo(animal that) {
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
//        return 0;
    }
}
