package school.projects;
import java.util.Scanner;
public class Qadratgleichung {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ax^2+bx+c = 0");
        System.out.println("a= ");
        double a= input.nextDouble();
        System.out.println("b= ");
        double b=input.nextDouble();
        System.out.println("c= ");
        double c=input.nextDouble();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Many values");
                }else if(c!=0){
                    System.out.println("No values");
                }
            }else if(b!=0){
                double x= -c/b;
                System.out.println("x= " +x);
            }
        } else if(a!=0){
            double D=b*b-4.0*a*c;
            if(D>=0){
                double squareRootx1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
                double squareRootx2=(-b- Math.sqrt(b * b - 4 * a * c))/2*a;
                System.out.println(squareRootx1 + ", " + squareRootx2);
            }else if (D<0){
                System.out.println("Imaginary values");
            }
        }
    }
}
