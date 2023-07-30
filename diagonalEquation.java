package data;
import java.util.Scanner;
public class diagonalEquation {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        double a = number.nextDouble();
        System.out.print("Enter a second number : ");
        double b = number.nextDouble();
        System.out.print("Enter a third number : ");
        double c = number.nextDouble();
        double d = b * b - 4.0 * a * c;
        if(d > 0.0){
            double r1 = (-b + Math.pow(d,0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d,0.5)) / (2.0 * a);
        }
        else if( d == 0.0){
            double r1 = -b / (2.0 * a);
            System.out.print("The root is : "+ r1);
        }
        else{
            System.out.print("Roots are not real. ");
        }
    }
}
