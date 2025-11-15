package Arrays;
import java.util.*;
public class reverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        revArr(arr);
        System.out.print("Reversed array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void revArr(int arr[]){
        int size = arr.length;
        int left = 0,right=size-1;
        while(left<=right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
        }       
    }
}
