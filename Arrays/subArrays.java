package Arrays;
import java.util.*;
public class subArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the value: ");
            arr[i]=sc.nextInt();
        }
        printSubArrays(arr);
    }
    public static void printSubArrays(int arr[]){
        int size = arr.length;
        for(int i=0;i<size;i++){
            System.out.print("[");
            for(int j=i;j<size;j++){
                System.out.print(arr[j]+",");
            }
            System.out.println("]");
        }
    }
}
