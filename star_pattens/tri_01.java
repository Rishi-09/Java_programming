package star_pattens;

import java.util.Scanner;

public class tri_01 {

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entyer Number of rows :");
        int rows = sc.nextInt();
        print01Tri(rows);
    }
    public static void print01Tri(int rows){
        int printDg =1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(printDg);
                printDg = (printDg==0?1:0);
            }
            System.out.println();
        }
    }
}