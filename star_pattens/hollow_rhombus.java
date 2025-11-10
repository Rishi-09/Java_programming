package star_pattens;

import java.util.Scanner;

public class hollow_rhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        printHollowRhombus(rows);
    }
    public static void printHollowRhombus(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                if(j==1 || j==rows || i==1 || i==rows){
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}