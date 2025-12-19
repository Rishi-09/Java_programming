package recursion;

import java.util.Scanner;

public class fact {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is: "+fact(num));
    }
    public static int fact(int num){
        if( num==0)return 1;
        return num * fact(num-1);

    }
}
