package data;
import java.util.Scanner;
class breakContinue{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter your number : ");
            int number = num.nextInt();
            if(number ==0 ){
                break;
            }
            if(number < 0 ){
                System.out.print("Negative number are not allowed.");
                continue;
            }
            sum += number;
        }
        System.out.println("The sum is "+ sum);
    }
}