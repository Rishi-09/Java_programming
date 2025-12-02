package bit_manipulation;
import java.util.Scanner;
public class setIthBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number:");
    int num = sc.nextInt();
    System.out.print("Enter the position:");
    int i = sc.nextInt();
    int res = (num | (1<<(i-1)));
    System.out.println("Setted "+i+"th bit:"+res);
    }
}
