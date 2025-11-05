package star_pattens;

import java.util.Scanner;

public class right_tri {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.err.print("Enter Number of Rows :");
        int rows = inp.nextInt();
        printRightTri(rows);
    }
    public static void printRightTri(int rows){
        for(int i =1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
