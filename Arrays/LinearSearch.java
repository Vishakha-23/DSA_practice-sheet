package Arrays;

public class LinearSearch {

    public static int linear_search(int arr[], int key){
      for(int i=0;i<=arr.length;i++){
        if(arr[i]==key){
            return i;
        }
      }

      return -1;
    }
    
    public static void main(String [] args){

        int num[]={2,6,4,8,10,7,1};
        int key = 10;

        int index =linear_search(num, key);

        if(index == -1){
            System.out.println("NOT FOUND");
        }else{
             System.out.println("Key is at index " + index );
        }
            
        
        
    }
}
