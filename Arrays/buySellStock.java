package Arrays;

import java.util.*;


public class buySellStock {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0 ;i<size;i++){
            System.out.print("Enter the value:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Profit: "+computeProfit(arr));
    }    
    public static int computeProfit(int arr[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit  = 0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice<arr[i]){
                int profit = arr[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice=arr[i];
            }
        }
        return maxProfit;
    }
}
