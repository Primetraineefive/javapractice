package PolyMorphism;

/**
 * Created by Jay
 */
public class MethodOverLoading {

    void m1(int a){
        System.out.println(a);
    }
    void m1(int a,int b){
        System.out.println();
    }
    void m2(int b){

    }
    void m2(String name){

    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.m1(10);
        obj.m1(10,20);
        obj.toString();
    }
}
