package Inprog;

import java.util.Scanner;

class atm2 {
    double bal;
    final int pin = 1015;

    atm2(){

        System.out.println("enter your pin : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == pin) {
            menu();
        } else {
            System.out.println("invalid pin");
            menu();
        }
    }

    public void menu() {
        System.out.println("enter your choice");
        System.out.println("1] check A/C balance");
        System.out.println("2] withdraw money");
        System.out.println("3] deposit money");
        System.out.println("4] EXIST");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            checkbalance();
        } else if (option == 2) {
            withdrawmoney();
        } else if (option == 3) {
            depositmoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("enter a valid choice");
        }
    }

    public void checkbalance() {
        System.out.println("balance:" + " " + bal);
        menu();
    }

    public void withdrawmoney() {
        System.out.println("enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        if (amount > bal) {
            System.out.println("insufficient balance");
        } else {
            bal = bal - amount;
            System.out.println("money withdrawal successfull");
        }
        menu();
    }

    public void depositmoney() {
        System.out.println("enter the deposit amount");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        bal += amount;
        System.out.println("money deposited successfully");
        menu();
    }


}


public class atm {
    public static void main(String[] args) {

        atm2 obj = new atm2();
        //obj.checkpin();


    }

}

/** without using contructor **/

/** package Inprog;

 import java.util.Scanner;

 class atm2 {
 double bal;
 final int pin = 1015;

 public void checkpin() {
 System.out.println("enter your pin : ");
 Scanner sc = new Scanner(System.in);
 int enteredpin = sc.nextInt();
 if (enteredpin == pin) {
 menu();
 } else {
 System.out.println("invalid pin");
 menu();
 }
 }

 public void menu() {
 System.out.println("enter your choice");
 System.out.println("1] check A/C balance");
 System.out.println("2] withdraw money");
 System.out.println("3] deposit money");
 System.out.println("4] EXIST");

 Scanner sc = new Scanner(System.in);
 int option = sc.nextInt();

 if (option == 1) {
 checkbalance();
 } else if (option == 2) {
 withdrawmoney();
 } else if (option == 3) {
 depositmoney();
 } else if (option == 4) {
 return;
 } else {
 System.out.println("enter a valid choice");
 }
 }

 public void checkbalance() {
 System.out.println("balance:" + " " + bal);
 menu();
 }

 public void withdrawmoney() {
 System.out.println("enter amount to withdraw");
 Scanner sc = new Scanner(System.in);
 double amount = sc.nextDouble();
 if (amount > bal) {
 System.out.println("insufficient balance");
 } else {
 bal = bal - amount;
 System.out.println("money withdrawal successfull");
 }
 menu();
 }

 public void depositmoney() {
 System.out.println("enter the deposit amount");
 Scanner sc = new Scanner(System.in);
 double amount = sc.nextDouble();
 bal += amount;
 System.out.println("money deposited successfully");
 menu();
 }


 }


 public class atm {
 public static void main(String[] args) {

 atm2 obj = new atm2();
 obj.checkpin();


 }

 }  **/

