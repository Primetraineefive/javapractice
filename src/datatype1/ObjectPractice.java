package datatype1;

/**
 * Created by Jay
 */
public class ObjectPractice {

    int a =10;
    static int b=20;
    public static void main(String [] args){
        //object creation
        String name ="Prime";
        ObjectPractice obj = new ObjectPractice();
        //Prime t = new Prime();
        //Maths y = new Maths();
        obj.myFirstMethod();
        System.out.println(obj.a);
        System.out.println(b);


    }

    public void myFirstMethod(){
        int c =2;
        int d =3;
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);
    }


}
