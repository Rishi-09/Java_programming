package oop;
public class test {
    public static void main(String args[]){
        Complex a = new Complex(1, 2);
        a.show();
        Complex b = new Complex(2, -2);
        b.show();
        Complex sum = a.prod(b);
        sum.show();
    }
}
