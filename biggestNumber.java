package data;
import java.util.Scanner;
public class biggestNumber {
    public static void main(String[]args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = number.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = number.nextInt();
        System.out.print("Enter a third number : ");
        int num3 = number.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.print("Biggest number of :"+ max);

    }
}
