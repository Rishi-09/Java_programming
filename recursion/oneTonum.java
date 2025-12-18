package recursion;

import java.util.Scanner;

public class oneTonum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        printRange(1,num);
    }
    public static void printRange(int start,int num){
        if(start==num+1) return;
        System.out.println(start++);
        printRange(start, num);
    }
}
