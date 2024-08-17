package Inprog;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.UUID;

/** interface **/
interface utility{
    public void get_details();
    public void set_details();
}

/** class cars **/
class cars extends showroom implements utility{

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details(){

        System.out.println("name : "+car_name);
        System.out.println("color : "+car_color);
        System.out.println("fuel type : "+car_fuel_type);
        System.out.println("price : "+car_price);
        System.out.println("car type : "+car_type);
        System.out.println("transmission : "+car_transmission);
    }

    @Override
    public void set_details(){

        Scanner sc = new Scanner(System.in);
        System.out.println("============================= *** ENTER CAR DETAILS *** ==================================");
        System.out.println();

        System.out.println("car name : ");
        car_name = sc.nextLine();

        System.out.println("car color : ");
        car_color = sc.nextLine();

        System.out.println("car fuel type(petrol/desiel) : ");
        car_fuel_type =  sc.nextLine();

        System.out.println("car price : ");
        car_price = sc.nextInt();
        sc.nextLine();

        System.out.println("car type (sedan/suv/hatchback) : ");
        car_type = sc.nextLine();

        System.out.println("transmission type (automatic/manual) : ");
        car_transmission = sc.nextLine();

        total_cars_in_stock++;

    }


}

/** class employees **/
class employees extends showroom implements utility{
     String emp_id;
     String emp_name;
     int emp_age;
     String emp_department;

     @Override
     public void get_details(){
         System.out.println("id : "+emp_id);
         System.out.println("name : "+emp_name);
         System.out.println("age : "+emp_age);
         System.out.println("department : "+emp_department);
         System.out.println("showroom name "+showroom_name);
     }

     public void set_details(){
         Scanner sc = new Scanner(System.in);
         // uuid to generate random emp_id
         UUID uuid = UUID.randomUUID();
         emp_id = String.valueOf(uuid);

         System.out.println("========================= *** ENTER EMPLOYEE DETAILS *** ==============================");
         System.out.println();

         System.out.println("employee name : ");
         emp_name = sc.nextLine();

         System.out.println("employee age : ");
         emp_age = sc.nextInt();
         sc.nextLine();

         System.out.println("employee department : ");
         emp_department =  sc.nextLine();

         System.out.println("showroom name : ");
         showroom_name = sc.nextLine();

     }



}

/** class showroom **/
class showroom implements utility{

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars_in_stock = 0;
    String manager_name;

    @Override
    public void get_details(){
        System.out.println("showroom name : "+showroom_name);
        System.out.println("showroom address : "+showroom_address);
        System.out.println("manager name : "+manager_name);
        System.out.println("total employees : "+total_employees);
        System.out.println("total cars in stock : "+total_cars_in_stock);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("============================== *** ENTER SHOWROOM DETAILS *** ===============================");
        System.out.println();

        System.out.print("showroom name : ");
        showroom_name = sc.nextLine();

        System.out.print("showroom address : ");
        showroom_address = sc.nextLine();

        System.out.print("manager name : " );
        manager_name = sc.nextLine();

        System.out.print("total employess : ");
        total_employees = sc.nextInt();

        System.out.print("total cars in stock : ");
        total_cars_in_stock = sc.nextInt();

    }


}





public class carshowroom {

    static void main_menu(){
        System.out.println();
        System.out.println("=========================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** ====================================");
        System.out.println();
        System.out.println("============================ *** ENTER YOUR CHOICE *** =================================");
        System.out.println();
        System.out.println("1] ADD SHOWROOMS \t\t\t 2] ASS EMPLOYEES \t\t\t 3] ADD CARS");
        System.out.println();
        System.out.println("4] GET SHOWROOMS \t\t\t 5] GET EMPLOYEES \t\t\t 6] GET CARS");
        System.out.println();
        System.out.println("=========================== *** ENTER 0 TO EXIST *** ====================================");



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        showroom showroom[] = new showroom[5];
        employees employee[] = new employees[5];
        cars car[] = new cars[5];

        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;

        while(choice !=0){
            main_menu();

            choice = sc.nextInt();

            while(choice !=9 && choice !=0 ){

                switch (choice){
                    case 1:
                        showroom[showroom_counter] = new showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1] ADD NEW SHOWROOM");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employee[employees_counter] =  new employees();
                        employee[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2] ADD NEW EMPLOYEE");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        car[car_counter] =  new cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3] ADD NEW CAR");
                        System.out.println("9] GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        for(int i=0; i<showroom_counter; i++ ){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for(int i=0; i<employees_counter; i++ ){
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for(int i=0; i<car_counter; i++ ){
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] GO BACK TO MAIN MENU");
                        System.out.println("0] EXIT");
                        choice = sc.nextInt();
                        break;

                }
            }



        }


    }
     
}
