package Strings;
import java.util.*;
public class largestString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings:");
        int size = sc.nextInt();
        String arr[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the Element:");
            arr[i] = sc.next();
        }
        printLargestString(arr);
    }
    public static void printLargestString(String arr[]){
        String largest = "";
        for(int i=0;i<arr.length;i++){
            if(largest.compareToIgnoreCase(arr[i])<=0){
                largest=arr[i];
            }
        }
        System.out.println("Largest String: "+largest);
    }
}