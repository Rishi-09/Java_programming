package Arrays;
import java.util.*;
public class pairsOfArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        allPairs(arr);
    }
    public static void allPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print("( "+arr[i]+","+arr[j]+" ),");
            }
            System.out.println("");
        }
    }
}
