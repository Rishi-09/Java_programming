package basics;
import java.util.*;

public class revNum {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = inp.nextInt();
        System.out.println("Reverse :"+revNum(num));
    }
    
    public static int revNum(int num){
        int res = 0;
        while (num!=0) {
            int rmd = num%10;
            res = res*10 + rmd;
            num/=10;
        };
        return res;
    }
}
