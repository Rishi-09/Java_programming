package star_pattens;

import java.util.Scanner;

public class char_tri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter number of rows :");
        int rows = sc.nextInt();
        printCharTri(rows);
    }
    public static void printCharTri(int rows){
        char i = 'A';
        for(int it =0;it<rows;it++){
            for(int j=1;j<=it;j++){
                System.out.print(i++);
            }
            System.out.println();
        }
        
    }
}
