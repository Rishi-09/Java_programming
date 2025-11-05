package star_pattens;

import java.util.Scanner;

public class inverted_right_tri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the Number of Rows:");
        int rows = sc.nextInt();
        printInvertedRightTri(rows);
    }
    public static void printInvertedRightTri(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=rows-i+1;j>0;j--){
                 System.err.print("*");
            }
            System.err.println();
        }
    }
}
