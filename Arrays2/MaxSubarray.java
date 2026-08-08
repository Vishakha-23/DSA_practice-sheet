package Arrays2;

public class MaxSubarray {
    //  brute force method
    public static void bruteForce(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {// loop-1
            for (int j = i; j < arr.length; j++) {// loop-2
                int currSum = 0;
                for (int k = i; k <= j; k++) {// loop-3
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Subarray Sum: " + maxSum);
    }

    // prefix sum method
    public static void prefixSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;

        int prefix[]= new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1;i<prefix.length;i++){
            //calculate prefix array
            prefix[i]=prefix[i-1]+arr[i];
           
        }

        //calculate max subarray
        for(int i=0;i<prefix.length;i++){
            int start=i;
            for(int j=i;j<prefix.length;j++){
                int end =j;
                 currSum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }

        System.out.println("Max Subarray sum: " + maxSum);
    }

    public static void kadane(int arr[]){
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr<0){
                curr=0;
            }
            if(maxSum<curr){
                maxSum=curr;
            }
        }

        System.out.println("Max subarray sum: " + maxSum);
    }


    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        int number[]={-2,-3,4,-1,-2,1,5,-3};
       // bruteForce(num);
       //prefixSum(num);
       kadane(number);

    }
}
