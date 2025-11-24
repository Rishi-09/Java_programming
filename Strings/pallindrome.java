package Strings;

import java.util.*;

public class pallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = sc.next();

        if (isPallindrome(input)) {
            System.out.println("String is Pallindrome.");
        } else {
            System.out.println("String is NOT Pallindrome.");
        }
    }

    public static boolean isPallindrome(String input) {
        int n = input.length();
        for (int i = 0; i <=n/2; i++) {
            if(input.charAt(i)!=input.charAt(n-1-i)) return false;
        }
        return true;
        
    }
}
