package data;

public class overloadingConstructor {
        private String name;
        private int age;
        public overloadingConstructor(){
            this.name = "Bappy";
            this.age = 0;
        }
        public overloadingConstructor(String name){
            this.name = name;
        }
        public overloadingConstructor(String name , int age){
            this.name = name;
            this.age = age;
        }
        public void display(){

            System.out.println("Name :"+ name + " Age : "+age);
        }
        public static void main(String [] args){
            overloadingConstructor data = new overloadingConstructor();
            data.display();
            overloadingConstructor data1 = new overloadingConstructor("Bappy");
            data1.display();
            overloadingConstructor data2 = new overloadingConstructor("Abu Anas Bappy",20);
            data2.display();
        }
}
