package staticexample;

public class Innerclasses {

  static class test{
        String name;
        public test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test t1 = new test("kuldeep");
        test t2 = new test("honey");

        System.out.println(t1.name);
        System.out.println(t2.name);

    }


}


