package data;
public class constructorMethod {
    String name;
    int roll;
    float mark;
    public constructorMethod (){
        name = "Bappy";
        roll = 572263;
        mark = 85.6f;
        System.out.println("my name is : " + name);
        System.out.println("my roll : " + roll);
        System.out.println("mart : " + mark);
    }
    public static void main (String [] args){

        constructorMethod data = new constructorMethod();
    }
}
