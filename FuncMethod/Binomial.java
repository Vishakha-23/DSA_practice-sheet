package FuncMethod;

public class Binomial {

    public static int factorial(int n){
        int f=1;
        for(int i =1;i<=n;i++){
            f *= i;
        }
        return f;//factorial
    }

    public static int binomialCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact =factorial(r);
        int nmr = factorial(n-r);
        int bino = n_fact/(r_fact*nmr);
        return bino;
    }
    public static void main(String[] args) {
        
        System.out.println(factorial(6));
        System.out.println(binomialCoeff(5,2));

    }
}
