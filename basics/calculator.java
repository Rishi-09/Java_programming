package basics;
import java.util.*;

public class calculator{
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = inp.nextInt();
        System.out.print("Enter operation :");
        String operation = inp.next();
        System.out.print("Enter b :");
        int b = inp.nextInt();
        switch (operation) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                break;
        }
    }
}