public class Divisor {

    //brute force
    public static void divisor(int myNum){
        for(int i= 1; i<=myNum;i++){
            if(myNum%i == 0){
                System.out.print(i + " ");
            }
        }
    }

    //optimal method to be understood
        public static void main(String [] args){
        int num = 12;
        divisor(num);
    }
    
}
