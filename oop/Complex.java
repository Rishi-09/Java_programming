package oop;

public class Complex {
    int real;
    int img;

    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public Complex add(Complex num2) {
        return new Complex(this.real + num2.real, this.img + num2.img);
    }

    public Complex diff(Complex num2) {
        return new Complex(this.real - num2.real, this.img - num2.img);
    }

    public Complex prod(Complex num2) {
        // (a+c) + (b+d)i
        int newReal = (this.real * num2.real) - (this.img * num2.img);
        int newImg = (this.real * num2.img) + (this.img * num2.real);
        return new Complex(newReal, newImg);
    }
    public void show(){
        if (img < 0) {
            System.out.println(this.real + " - " + Math.abs(this.img)+"i");
        } else {
            System.out.println(this.real + " + " + Math.abs(this.img)+"i");
        }
    }
}
