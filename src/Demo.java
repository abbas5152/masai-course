public class Demo {
    Demo(){
        System.out.println("Without argument");
    }
    Demo(int i){
        System.out.println("With int argument");
    }
    Demo(String s){
        System.out.println("With String argument");
    }
    Demo(float f){
        System.out.println("With float argument");
    }

    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo(5);
        Demo d3=new Demo("hello");
        Demo d4=new Demo(5.5f);
    }
}
