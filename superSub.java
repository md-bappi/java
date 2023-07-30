package data;
import java.util.Scanner;
public class superSub {
    String name = "bappy";
    int roll = 572263;
}
class data extends superSub{
    float mark = 85.5f;
    void getdata(){
        System.out.println("my name is : " + name);
        System.out.println("roll : " +roll);
        System.out.println("mark : " + mark);
    }

    public static void main(String[] args) {
        data d = new data();
        d.getdata();
    }
}