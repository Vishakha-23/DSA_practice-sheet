package Patterns;

public class Patterns {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        // solid rectangle
        System.out.println("Solid Rectangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print('*');
            }
            System.out.println(" ");
        }

        // hollow rectangle
        System.out.println("Hollow Rectangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {

                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        // half pyramid
        System.out.println("Half pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // inverted half pyramid
        System.out.println("Inverted Half pyramid");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("Inverted Half pyramid 180deg rotated");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");

            }

            System.out.println(" ");
        }
    }
}
