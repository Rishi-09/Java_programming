package bit_manipulation;
import java.util.Scanner;
public class clearIthBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        System.out.print("Enter the position:");
        int i = sc.nextInt();
        System.out.println("Cleared "+i+"th bit :"+ ( num&(~(1<<i))) );
    }
}
