package star_pattens;

import java.util.Scanner;

public class invt_rotated {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows :");
        int rows = sc.nextInt();
        printInvtRotatedTri(rows);
    }
    public static void printInvtRotatedTri(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
