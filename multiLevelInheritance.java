package data;

public class multiLevelInheritance {
    public void eat(){
        System.out.println("Animal is eating.");
    }
}
class animal extends multiLevelInheritance{
    public void walk(){
        System.out.println("Animal is walking");
    }
}
class dog extends animal{
    public void bark(){
        System.out.println("Dog is barking.");
    }
    public static void main (String [] args){
        dog n =new dog();
        n.eat();
        n.walk();
        n.bark();
    }
}