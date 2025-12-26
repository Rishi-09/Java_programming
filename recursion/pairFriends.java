package recursion;

import java.util.Scanner;

public class pairFriends {
    public static int countPairingWays(int n){
        if(n==0 || n==1) return 1 ;
        return countPairingWays(n-1) + (n-1)*countPairingWays(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of friends: ");
        int n = sc.nextInt();
        System.out.println("Ways : "+countPairingWays(n));
    }
}
