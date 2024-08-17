import java.util.*;
import java.util.Scanner;



public class arrays {
    public static void main (String[] args){


       /* int[] marks = new int[4];
        marks[0] = 56;
        marks[1] = 78;
        marks[2] = 45;
        marks[3] = 76;

        for(int i=0; i<4; i++ ){
            System.out.println(marks[i]);
        }*/


        /** make a array take input and and check for a specific number and print the index of it **/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter your x");
        int x = sc.nextInt();

        for(int i=0; i<n; i++ ){
            System.out.println(arr[i]);
            if(arr[i] == x ){
                System.out.println("x found at index : " + i);
            }
        }*/

       /** check array length java function **/
       /* int[] marks = {45, 78,87,96,25, 85};
        int length = marks.length;
        System.out.println(length); */



        /** 2D ARRAY **/

       /* Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int [rows][cols];

        //input--
        //rows
        for(int i=0; i<rows; i++ ){
            //cols
            for(int j=0; j<cols; j++ ){
                numbers[i][j]= sc.nextInt();
            }

        }

        //output--
        //rows
        for(int i=0; i<rows; i++ ){
            //cols
            for(int j=0; j<cols; j++ ){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }*/


       /* Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] marks = new int[rows][cols];

        //input--
        //rows
        for(int i=0; i<rows; i++ ){
            //cols
            for (int j=0; j<cols; j++ ){
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter your x : ");
        int x = sc.nextInt();


        //output--
        //rows
        for(int i=0; i<rows; i++ ){
            //cols
            for (int j=0; j<cols; j++ ){
                System.out.println(marks[i][j]);
                if(marks[i][j]==x){
                    System.out.println("x found at locations ("+ i + ","+ j +")");
                }
            }
        }*/





















    }
}