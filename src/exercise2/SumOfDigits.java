package exercise2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Type a number");
        int a = input.nextInt();
        int d1= a%10;
        int a1= a/10;
        int d2= a1%10;
        int a2= a1/10;
        int d3= a2%10;
        System.out.println ("Sum of digits: " +(d1+d2+d3));
    }

}