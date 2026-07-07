package Patterns;

public class PatterWnum {
    public static void main(String[] args) {
        int n=5;
       
        //half pyramid with numbers
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
        
            }
            System.out.println(" ");
        }

        System.out.println(" ");
       
        //inverted half pyramid with numbers
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i+1);j++){
               System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    
}
