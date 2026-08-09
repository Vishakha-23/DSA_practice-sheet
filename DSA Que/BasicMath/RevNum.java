//Problem Statement: Given an integer N return the reverse of the given number.
//Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401.
public class RevNum {

    public static void main(String[] args) {
        int myNum = 153423;
        int reverse = 0;

        while (myNum > 0) {
            int lastD = myNum % 10;

            reverse = (reverse * 10) + lastD;

            myNum /= 10;
        }
        System.out.println("Reverse number: " + reverse);

        
    }
}
