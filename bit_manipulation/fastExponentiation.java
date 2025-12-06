package bit_manipulation;
import java.util.*;
public class fastExponentiation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the expontnet: ");
        int pow = sc.nextInt();
        System.err.println("Answer:"+expo(num,pow));
    }
    public static int expo(int num,int pow){
        int ans =1;
        while (pow!=0) {
            if((pow&1)==1){
                ans *= num;
            }else{
                ans*=1;
            }
            num*=num;
            pow = pow>>1;
        }
        return ans;
    }
}
