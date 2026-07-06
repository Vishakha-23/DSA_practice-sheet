package FuncMethod;

public class Find_product {
    public static int calculateProduct(int x, int y){
        int prod = x * y;
        return prod;
    }

    public static void main(String[] args) {
        int a =7;
        int b= 8;
        int product = calculateProduct(a, b);
        System.out.println(product);
    }
}
