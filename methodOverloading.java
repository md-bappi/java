package data;

public class methodOverloading {
    public int add (int a, int b){
        return a+b ;
    }
    public double add (double a , double b){
        return a+b;
    }
    public String add (String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        methodOverloading data = new methodOverloading();
        int number = data.add(5,10);
        System.out.println(number);
        double addNumber = data.add(10.7,12.5);
        System.out.println(addNumber);
        String addString = data.add("abu anas", "bappy");
        System.out.println(addString);
    }
}

