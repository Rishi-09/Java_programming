package Strings;

import java.util.Scanner;

public class stringCompression {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println("compressed string:"+compress(sb));
    }    
    public static StringBuilder compress(StringBuilder string){
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<string.length();){
            char ch = string.charAt(i); //a
            res.append(ch);
            int count =1 ;
            i++;
            while(i<string.length() && string.charAt(i)==ch){
                count++;
                i++;
            }
            if(count>1) res.append(count);
        }
        return res;
    }
}
