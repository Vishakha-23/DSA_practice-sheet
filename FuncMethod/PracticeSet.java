package FuncMethod;

public class PracticeSet {

    //utility function: to find lastdigit
    public static int lastDigit(int n){
        return n%10;
    }

    //average of three numbers
    public static int avg(int a,int b,int c){
        return (a+b+c)/3 ;
    }

    //return true if the argument is even, or false otherwise
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
     return false;
    }

    //to check if a number is a palindrome
    public static void isPalindrome(int s) {
        int myNum =s;
        int rev =0;

        while(s>0){
           rev = rev *10 + lastDigit(s);
           s=s/10;

        }

        if(myNum==rev){
            System.out.println(myNum + " is a palindrome");
        }else{
            System.out.println(myNum + " is NOT a palindrome");
            
        }
    }

    public static void main(String[] args) {
        // System.out.println("The average is "+avg(5,8,9));
        // System.out.println(isEven(9));
        isPalindrome(42524);
    }
}
