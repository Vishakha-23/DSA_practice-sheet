public class Largest {
    
    public static int largest(int arr[]){
        int max= Integer.MIN_VALUE ;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String [] args){

        int num[]={2, 5, 1, 3, 0} ;

        System.out.println("Largest value in array: " + largest(num));
    }
}
