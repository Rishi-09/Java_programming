package recursion;

import java.util.Scanner;

public class numto1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        printrange(num);
    }

    public static void printrange(int num) {
        if(num==0) return;
        System.out.println(num);
        printrange(--num);
    }
}
