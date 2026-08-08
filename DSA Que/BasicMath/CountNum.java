//Count number of digits in a number
public class CountNum {
    public static void main(String [] args){
        int myNum =12345;
        
      //brute force
      int count=0;
        while(myNum>0){
           myNum/=10;
           count++;
        }
        System.out.println("Count of digit :"+ count);

        //optimal approach
        int myNum2 = 123456;
        int count2 =(int) (Math.round(Math.log10(myNum2)+1));
         System.out.println("Count of digit :"+ count2);
    }
}
