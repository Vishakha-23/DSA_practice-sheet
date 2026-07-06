package Basics;
import java.util.*;
public class Javabasics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int res = a*b;

        System.out.println("Your sum is:" + sum);       
        System.out.println("Your product is:" + res);       
    }
}