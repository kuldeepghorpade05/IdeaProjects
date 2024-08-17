package Inprog;

class student{
    private String name;
    private int age;
    private int roll_no;

     public String getName(){
         return name;
     }
     public int getage(){
         return age;
     }

     public int getRoll_no(){
         return roll_no;
     }

     public void setname(String name){
         this.name = name;
     }

     public void setAge(int age){
         this.age =  age;
     }

     public void setRoll_no(int roll_no){
         this.roll_no = roll_no;
     }


}

public class getter_setter {
    public static void main(String[] args) {

        student s1 =  new student();
        s1.setname("kuldeep");
        s1.setAge(45);
        s1.setRoll_no(14);

        System.out.println(s1.getName());
        System.out.println(s1.getage());
        System.out.println(s1.getRoll_no());

    }
}
