package Strings;
import java.util.*;
public class upperCase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine()); 
        StringBuilder cp = capitalise(sb);
        System.out.println(cp);
    }
    public static StringBuilder capitalise(StringBuilder sb){
        StringBuilder res = new StringBuilder("");
        char ch = Character.toUpperCase(sb.charAt(0));
        res.append(ch);
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                ch = Character.toUpperCase(sb.charAt(++i));
                res.append(' ');
            }else{
                ch = sb.charAt(i);
            }
            
            res.append(ch);
        }
        return res;
        
    }
}
