package constructor;

/**
 * Created by Jay
 */
public class ConstructorExample {

    //This is constructor
   public  ConstructorExample(){
       System.out.println("I am a Constructor");

    }

    public ConstructorExample(int a) {
        System.out.println(a);
    }
    public ConstructorExample(String text,int a) {
        System.out.println(text+" :"+a);
    }

    public static void main(String[] args) {
        ConstructorExample obj = new ConstructorExample();
        ConstructorExample obj1 = new ConstructorExample(10);
        ConstructorExample obj2 = new ConstructorExample("Prime",20);

    }

}
