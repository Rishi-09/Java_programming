package recursion;

import java.util.Scanner;

public class binaryString {
    public static void printBinString(int n, int lp, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinString(n - 1, 0, str + "0");
        if (lp == 0) {
            printBinString(n - 1, 1, str + "1");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size (n) :");
        int n = sc.nextInt();
        printBinString(n, 0, "");

    }
}
