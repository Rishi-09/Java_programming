package bit_manipulation;

import java.util.*;

public class updateIthBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        System.out.print("Enter the position:");
        int i = sc.nextInt();
        System.out.print("Enter the new Bit:");
        int newBit = sc.nextInt();
        updateIthBit(num,i,newBit);
    }
    public static void updateIthBit(int num,int i,int newBit){
        num = newBit==1?(num | (1<<i-1)):(num & ~(1<<i-1));
        System.out.println("bit updated:"+num);
    }
}
