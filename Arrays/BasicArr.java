package Arrays;

import java.util.*;

public class BasicArr {

    public static void main(String[] args) {
        // create array
        int marks[] = new int[5];
        int num[] = { 1, 2, 3, 4, 5 };
        String fruits[] = { "apple", "mango", "banana" };

        // take input in empty array marks[]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for array:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        // displaying array
        System.out.println("Your array is:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        // updating an array element
        marks[2] = 56;

    }
}
