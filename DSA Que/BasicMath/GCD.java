public class GCD {
    
    public static void main(String [] args){
         int num1 = 56;
         int num2 = 12;

         while(num2>0){
            int rem = num1 % num2;
            num1 = num2;
            if(rem==0){
               // num2 =num2;
                break;
            }
            num2 = rem;
         }
         System.out.println("GCD=" + num2);

        
        
    }
}
