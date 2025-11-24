package Strings;
import java.util.*;
public class shortestPath {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The string: ");
        String input = sc.next();
        System.out.println("Shortest path: "+shortestPath(input));
    }
    public static double shortestPath(String input){
        int x=0,y=0;
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='w'||ch=='W'){
                x--;
            }else if(ch=='e'||ch=='E'){
                x++;
            }else if(ch=='n'||ch=='N'){
                y++;
            }else if(ch=='s'||ch=='S'){
                y--;
            }
        }
        return (Math.sqrt((x*x)+(y*y)));
    }
}
