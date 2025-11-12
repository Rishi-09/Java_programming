package Arrays;

import java.util.*;

public class linearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Element to search:");
        int key = sc.nextInt();
        int idx = lin_search(arr,key);
        if(idx!=0){
            System.out.println(key+" found at index:"+idx);
        }
        else{
            System.out.println(key+" not found");
        }
    }
    public static int lin_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return 0;
    }
}
