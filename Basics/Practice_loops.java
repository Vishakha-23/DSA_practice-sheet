package Basics;
import java.util.Scanner;

public class Practice_loops {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //break loop while entered num is multiple of 10
       /*

       do{
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n%10 == 0){
            System.out.println("The entered number is a multiple of 10.");
            break;
        }
        // System.out.println(n);
       }while(true);
       */

       //Question 3 :Write a program to find the factorial of any number entered by the user
       System.out.println("Enter a number:");
       int n = sc.nextInt();
       int factorial = 1;
       for(int i=1;i<=n;i++){
             factorial *= i;
            }
            System.out.println("Factorial:"+ factorial);


       //Question 4:Write a program to print the multiplication table of a number N,entered by the user
         System.out.println("MULTIPLICATION TABLE OF"+n);
         for(int i =1;i<=10;i++){
            System.out.print(n + "x" + i+ "=");
            System.out.println(n*i);
         }

    }
}
