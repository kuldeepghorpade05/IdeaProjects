package Fourfundamentals.Interfaces_Abstraction;

public class son extends parent{

    @Override
    void career(String name){
        System.out.println("i  want to be "+" "+name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("her name is "+" "+name+" "+"she is"+" "+age);
    }


}
