package recursion;

import java.util.Scanner;

public class power {
    public static int power(int x,int n){
        if (n==0) return 1;
        return x * power(x,n-1);
    }
    public static int optPower(int x,int n){
        if(n==0) return 1;
        if(n%2==0) return optPower(x, n/2)*optPower(x, n/2);
        else return x*optPower(x, n/2)*optPower(x, n/2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent : ");
        int n = sc.nextInt();
        System.out.println("result : "+optPower(x, n));
    }
}
