package star_pattens;

import java.util.Scanner;

public class floyds_tri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :");
        int rows = sc.nextInt();
        printFloydsTri(rows);
    }
    public static void printFloydsTri(int rows){
        int it= 1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                System.out.print(it++ + " ");
            }
            System.out.println();
        }
    }
}
