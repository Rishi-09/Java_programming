package basics;

import java.util.*;

public class binaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s binary number:");
        long bin = sc.nextLong();
        System.out.println("Bin to decimal :" + binToDec(bin));
    }

    public static long binToDec(long bin) {
        long res = 0;
        int base = 1;
        while (bin != 0) {
            int rem = (int) bin % 10;
            res = res + base * rem;
            base = base * 2;
            bin /= 10;
        }
        return res;
    }
}