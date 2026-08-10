public class Armstrong {
    public static int countDigit(int myNum) {
        int count = 0;
        while (myNum > 0) {
            myNum /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int myNum) {
        int pow = countDigit(myNum);
        int a = myNum;
        int sum = 0;
        while (a > 0) {
            int x = a % 10;
            sum += Math.pow(x, pow);
            a /= 10;
        }

        if (myNum == sum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 371;

        System.out.println("is Armstrong: " + isArmstrong(num));

    }
}
