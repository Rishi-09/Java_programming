package Arrays;
import java.util.*;
public class insertionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value:");
            arr[i] = sc.nextInt();
        }
        insSort(arr);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void insSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j =i-1,key=arr[i];
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
