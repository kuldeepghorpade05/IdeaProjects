package Genrics_and_Wrapper_Classes.Generics;

import java.security.DigestException;

public class g1 {
    public static void main(String[] args) {

        dog<String, Integer> d1 = new dog<>("hwlooo",74);

        dog<Integer, Integer> d2 = new dog<>(78,41);

        dog<Boolean, Integer> d3 = new dog<>(true, 45);

        System.out.println(d2.getId() + " " + d2.getName());

    }
}


// generics

class dog<E, I>{

    E id;
    I name;

    //constructor
    public dog(E id, I name){
        this.id = id;
        this.name = name;
    }

    E getId() {
        return id;
    }

    I getName(){
        return name;
    }


}
