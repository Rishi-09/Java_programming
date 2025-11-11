package basics;

import java.util.*;

public class decimalToBinary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println(decToBin(num));
    }

    public static long  decToBin(int num) {
        long res = 0;
        int base = 1;
        while(num!=0){
            int rem = num%2;
            res = res+rem*base;
            base=base*10;
            num/=2;
        }
        return res;
    }
}
