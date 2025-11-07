package star_pattens;

import java.util.Scanner;

public class hollow_rect {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns :");
        int cols = sc.nextInt();
        printHolloeRect(rows,cols);
    }
    public static void printHolloeRect(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
