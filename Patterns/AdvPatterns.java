package Patterns;

public class AdvPatterns {
    // hollow rectangle
    public static void hollowRectangle(int totRow, int totCol) {
        for (int i = 1; i <= totRow; i++) {
            for (int j = 1; j <= totCol; j++) {
                if (i == 1 || j == 1 || i == totRow || j == totCol) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println(' ');
        }
    }

    // inverted rotated half pyramid , row=col=n
    public static void inverted_Rotated_Half_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');

            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }
    }

    // inverted half pyramid with numbers
    public static void inv_half_pyramid_w_numbers(int Row) {
        for (int i = Row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(' ');
        }
    }

    // Floyd's triangle
    public static void floyds_triangle(int Row) {
        int x = 1;
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println(' ');
        }
    }

    // zero one triangle
    public static void zero_one_triangle(int Row) {
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    // butterfly pattern
    public static void butterfly(int Row) {
        // first half
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <= (2 * (Row - i)); j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // second half
        for (int i = Row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <= (2 * (Row - i)); j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // solid rhombus pattern
    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(' ');
            }
            // star
            for (int j = 1; j <= n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // hollow rhombus pattern
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(' ');
            }
            // star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }

            }
            System.out.println();
        }
    }

    // diamond pattern
    public static void diamond(int n) {
        int x = 1;
        // first half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(' ');
            }
            // star

            for (int j = 1; j <= x; j++) {
                System.out.print('*');
            }
            x += 2;
            System.out.println();
        }

        //second half
        for (int i = n; i >=1; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(' ');
            }
            // star
            x -= 2;
            for (int j = 1; j <= x; j++) {
                System.out.print('*');
            }
            
            System.out.println();
        }

    }

    // main function
    public static void main(String[] args) {
        // hollowRectangle(5, 6);
        // inverted_Rotated_Half_Pyramid(6);
        // inv_half_pyramid_w_numbers(5);
        // floyds_triangle(5);
        // zero_one_triangle(5);
        // butterfly(5);
        // solid_rhombus(5);
        //hollow_rhombus(5);
        diamond(4);
    }

}
