package bit_manipulation;
import java.util.Scanner;
public class even_odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check:");
        int num = sc.nextInt();
        if((num & 1)==1){
            System.out.println(num+" is odd.");
        }else{
            System.out.println(num+" is Even.");
        }
    }
}
