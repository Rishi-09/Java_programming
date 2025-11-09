package star_pattens;
import java.util.*;

public class solid_rhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int rows = sc.nextInt();
        printSolidRhombus(rows);
    }
    public static void printSolidRhombus(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=rows;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
