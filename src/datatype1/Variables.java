package datatype1;

/**
 * Created by Jay
 */
public class Variables {

    int x = 100;// instance variable/global variable
    int y = 200;
    String myName = "Amit"; // instance variable/ global variable
    static int z = 200; // static variable / globle variable
    static String yourName = "Prime"; // static variable
    int c;

    public void myFirstMethod() {
       // Variables obj = new Variables();
        int a = 10; // local variable
        String name = "Amit"; // local variable
        System.out.println(a);
        System.out.println(name);
        System.out.println(x);
        System.out.println(myName);
       // System.out.println(obj.z);
        //System.out.println(obj.yourName);
        System.out.println(z);
        System.out.println(yourName);
        c = x + y;
    }

    public void mySecondMethod() {
        int result = x * y;
        // System.out.println(a);
        //System.out.println(name);
        System.out.println(x);
        System.out.println(myName);
    }

    public static void myThirdMethod() {

        System.out.println(z);
        System.out.println(yourName);
        Variables obj = new Variables();
        System.out.println(obj.x);
        System.out.println(obj.y);

          }
}
