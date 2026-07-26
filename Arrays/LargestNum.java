package Arrays;

import java.util.*;

public class LargestNum {
    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String []args){
        int num[] ={1,2,6,3,5,4};
        System.out.println("The largest number in your array is:" + getLargest(num));
       
    }

}
