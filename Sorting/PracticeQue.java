package Sorting;
//Question : Use the following sorting algorithms to sort an array in DESCENDING order :
// a. Bubble Sort
// b. Selection Sort
// c. Insertion Sort
// d. Counting Sort
// You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]

public class PracticeQue {

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    
    //bubble sort
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
          }
        }
        System.out.println("Bubble Sort");
        printArr(arr);
    }

    //insertion sort
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr =arr[i];//current element
            int prev = i-1; //previous element i-1
           
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
           arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        
        int nums[] ={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        bubbleSort(nums);
    }
}
