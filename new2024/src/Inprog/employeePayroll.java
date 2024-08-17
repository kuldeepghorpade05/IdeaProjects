package Inprog;

abstract class employee {
    private String name;
    private int id;

    public employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getname(){
        return  name;
    }

    public int getid(){
        return id;
    }

   public abstract double calculatesalary();

    public String toString(){
        return "Employee[name="+name+", id="+id+", salary="+calculatesalary()+"]";
    }


}

//class FulltimeEmployee extends employee{
//
//}
//
//public class employeePayroll {
//
//}

