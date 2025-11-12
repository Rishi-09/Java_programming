package Arrays;
import java.util.*;
public class largestInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Elements:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest element in array :"+largestInArray(arr));
    }
    public static int largestInArray(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
}
