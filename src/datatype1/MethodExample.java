package datatype1;

/**
 * Created by Jay
 */
public class MethodExample {
    public static void main(String[] args) {
        MethodExample obj = new MethodExample();
        // obj.addition();
        // obj.addition1(10,20);
        // obj.printMyName("Prime",123);
        int c = addition2();
        System.out.println(c);
       // System.out.println(addition2());

        System.out.println(obj.addition3(1,2,3));
        System.out.println(obj.addition3(5,10,15));
    }
    //No return type No parameters
    public void addition() {
        System.out.println("This is addition method");
    }
    //No return type With parameters
    public void addition1(int a, int b) {
        System.out.println(a + b);
    }
    public void printMyName(String name, int empId) {
        System.out.println(name + empId);
    }
    // With return type No parameters
    public static int addition2() {
        int a = 10;
        int b = 20;
        //String name = "Prime";
        int result = a + b;
        return result;
    }
    public boolean isChild() {
        return true;
    }
    //With return type, With parameters
    public int addition3(int a, int b, int c) {
        return a + b + c;

    }

    public static MethodExample getObject(){

        MethodExample me = new MethodExample();
        return me;

    }


}
