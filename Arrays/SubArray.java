package Arrays;

public class SubArray {
    public static void printSubarray(int arr[]){
         int ts =0;//to calculate total num of subarrays
        for(int i=0; i<arr.length;i++){
            int start =i;
            for(int j = i; j<arr.length;j++){
                int end = j;
                int sum=0;//to calculate sum of each subarray
                for(int k=start;k<=end;k++){
                    
                    System.out.print(arr[k] + " ");
                    sum+=arr[k];
                }
                System.out.println("Sum=" + sum);
                ts++;
                 
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        int num[] = {2,4,6,8,10};

        printSubarray(num);
    }
}
