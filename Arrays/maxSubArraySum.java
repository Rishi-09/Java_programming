package Arrays;
import java.util.Scanner;
public class maxSubArraySum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the Value:");
            arr[i] = sc.nextInt();
        }
        int maxSum = kadanes(arr);
        System.out.println("maxSUm: "+maxSum);
    }
    public static int kadanes(int arr[]){
        int res  =0,currSum=0;
        // [2,4,-1,0,-8,10]
        for(int i=0;i<arr.length;i++){
            if(res+arr[i]<0){
                currSum=0;
            }else{
                res = currSum;
                currSum+=arr[i];
            }
        }
        return res<currSum?currSum:res;
    }
}
