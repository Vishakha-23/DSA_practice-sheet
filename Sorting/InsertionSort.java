package Sorting;

public class InsertionSort {
    // print array
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    // sort array using insertin sort
    public static void sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // finding out correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion 
            arr[prev+1]=curr;
            print(arr);
        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 4, 1, 3, 2 };
        print(num);

        System.out.println("Array after each swap:");
        sort(num);

        System.out.println("Sorted Array: ");
        print(num);
    }
}
