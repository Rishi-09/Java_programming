package recursion;

import java.util.Scanner;

public class sumOfNnums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = sc.nextInt();
        System.out.println("sum : "+sum(num));
    }
    public static int sum(int num){
        if (num == 0){
            return 0;
        }
        else{
            return num + sum(--num);
        } 
    }
}
