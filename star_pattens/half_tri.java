package star_pattens;

import java.util.Scanner;

public class half_tri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Number of Rows : ");
        int rows = sc.nextInt();
        printHalfTri(rows);
    }
    public static void printHalfTri(int rows){
        for(int i = 1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.err.print(j);
            }
            System.err.println();
        }
    }
}
