package data;

public class overloading {
    public static void addNumber (int a){
        System.out.println("Adding one number : "+a);
    }
    public static void addNumber (int a, int b){
        int sum = a+b;
        System.out.println("Adding two number : "+a+"+"+b+"="+sum);
    }
    public static void addNumber(double a, double b){
        double sum = a+b;
        System.out.println("Add two number : "+a+"+"+b+"="+sum);
    }
    public static void main (String [] args){
        addNumber(5);
        addNumber(4,8);
        addNumber(3.5,6.6);
    }
}
