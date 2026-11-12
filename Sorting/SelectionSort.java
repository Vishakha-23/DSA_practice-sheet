package Sorting;

public class SelectionSort {
    //print array
    public static void print(int arr []){
         for(int i = 0; i<arr.length;i++){
             System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    //sort array using seletion sort
    public static void sort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int minPos =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            } 
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            print(arr);//array after each swap
             System.out.println(" "); 
        }
    }
    
    public static void main(String[] args) {
        int num[] = {5,4,1,3,2};
        print(num);
        
        System.out.println("Array after each swap:"); 
        sort(num);

        
        System.out.println("Sorted Array: "); 
        print(num);
    }

}
