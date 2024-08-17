package Fourfundamentals.Interfaces_Abstraction;

public class daughter extends parent{

    @Override
    void career(String name){
        System.out.println("i want to be "+" "+name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("his name is "+" "+name+" "+"he is"+" "+age);
    }

}
