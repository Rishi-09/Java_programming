package bit_manipulation;

import java.util.Scanner;

public class getIthBit {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int num = sc.nextInt();
    System.out.print("Enter the position:");
    int i = sc.nextInt();
    int res = (num & (1<<i))==1?1:0;
    System.out.println("ith bit: "+res);
 }   
}
