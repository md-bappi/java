package data;
import java.util.Scanner;
public class evenNumberAddition {
    public static void main(String[] args) {
        Scanner even = new Scanner(System.in);
        System.out.print("Enter your positive number : ");
        int num = even.nextInt();
        int sum = 0;
        for(int i = 2 ; i <= 100; i++){
            sum += i;
        }
        System.out.print("all number of additon : " + sum);
    }
}
