package exercise2;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Type r= ");
        double r= input.nextDouble();
        double C= 2*Math.PI*r;
        double A= Math.PI*r*r;
        System.out.println("Circumference: "+C);
        System.out.println("Area: "+A);
    }


}