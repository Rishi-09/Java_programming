package star_pattens;

import java.util.Scanner;

public class invt_half_pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows :");
        int rows = sc.nextInt();
        printInvtHalfPyramid(rows);
    }
    public static void printInvtHalfPyramid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
