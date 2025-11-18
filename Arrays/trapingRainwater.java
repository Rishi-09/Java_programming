package Arrays;
import java.util.Scanner;
public class trapingRainwater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the Value: ");
            arr[i] = sc.nextInt();                     
        }
        int res = trappingRainwater(arr);
        System.out.println("Total Trapped Water:"+res);
    }
    public static int trappingRainwater(int arr[]){
        int trappedWater =0;
        int bound[] = {};
        for(int i=0;i<arr.length;i++){
            bound = getBoundaries(arr,i);
            int min = min(bound);
            System.out.println( bound[0]+","+bound[1]);
            
            trappedWater+= min-arr[i]<0?0:min-arr[i];
            System.out.println(trappedWater);
        }
        return trappedWater;
    };
    public static int[] getBoundaries(int arr[],int idx){
        int leftMax=0,rightMax=0;
        int bound[] =  new int[2];
        for(int i=0;i<=idx;i++){
            if(arr[i]>=leftMax){
                leftMax=arr[i];
            }
        }
        if(idx==0) leftMax =0;
        
        for(int i=idx;i<arr.length;i++){
            if(arr[i]>rightMax){
                rightMax=arr[i];
            }
        }
        if(idx==arr.length-1) rightMax =0;
        
        
        bound[0] = leftMax;
        bound[1] = rightMax;
        return bound ;
    }
    public static int min(int arr[]){
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }
}
