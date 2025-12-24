package recursion;

import java.util.Scanner;

public class duplicateChar {

    public static void removeDuplicateChars(String s,int idx,StringBuilder str,boolean map[]){
        if(idx==s.length()){ System.out.println(str); return;};
        if(map[s.charAt(idx)-'a']==true){
            removeDuplicateChars(s, idx+1, str, map);
        }else{
            map[s.charAt(idx)-'a'] = true;
            removeDuplicateChars(s, idx+1, str.append(s.charAt(idx)), map);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        String s = sc.next();
        removeDuplicateChars(s,0, new StringBuilder("") ,new boolean[26]);
    }
}
