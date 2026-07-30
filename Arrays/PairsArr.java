package Arrays;

public class PairsArr {
    
    public static void pairs(int arr[]){
        int tp=0;
        for(int i =0; i<arr.length;i++){
            int curr = arr[i];
            for(int j =i+1;j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
                 tp++;
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        int num[]={1,2,3,4,5};
        pairs(num);

    }
}
