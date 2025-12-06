package bit_manipulation;
import java.util.*;
public class countSetBits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = sc.nextInt();
        System.out.println("set bits:"+countSetBits(num));
    }
    public static int countSetBits(int num){
        int count=0;
        while (num!=0) {
            if((num&1)==1){
                count++;
            }
            num = (num>>1);
        }
        return count;
    }
}
