package PolyMorphism;

/**
 * Created by Jay
 */
public class ChildClass extends ParentClass{
    @Override
    void m1(int a, int b) {
    //    super.m1(a, b);
        System.out.println(a-b);
    }


    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.m1(10,20);
    }
}
