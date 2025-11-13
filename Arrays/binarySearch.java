package Arrays;
import java.util.*;

public class binarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
        int idx = binSearch(arr,key);
    }
    public static int binSearch(int arr[],int key){
        int res = 0;
        int left = 0,right=arr.length-1;
        int mid;
        // Array.sort(arr/)
        while(left<=right){
            mid = left+(right-left)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]>key){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
}
