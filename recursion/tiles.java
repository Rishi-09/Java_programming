package recursion;

import java.util.Scanner;
public class tiles{

    public static int waysToPlaceTiles(int n){
        if(n==0 || n==1) return 1;
        return waysToPlaceTiles(n-1) + waysToPlaceTiles(n-2);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n :");
        int n = sc.nextInt();
        System.out.println("Ways : " + waysToPlaceTiles(n));
    }
}