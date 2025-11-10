package star_pattens;
import java.util.*;
public class butterfly {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :");
        int size = sc.nextInt();
        printButterfly(size);
    }
    public static void printButterfly(int size){
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*(size-i))+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=size-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
