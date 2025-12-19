package recursion;
import java.util.Scanner;
public class fib {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            System.out.println(fib(i));
        }
    }
    public static int fib(int num){
        if( num == 0 || num==1){
            return num;
        }else{
            return fib(num-2) + fib(num-1);
        }
    }
}
