class BasicMath {

    // Problem Statement: Given an integer N, return the number of digits in N.
    public static void countDigit(int n) {
        int num = n;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int num =987654;
        countDigit(num);
    }
}