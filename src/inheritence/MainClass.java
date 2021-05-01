package inheritence;

/**
 * Created by Jay
 */
public class MainClass extends ChildClass {
 public void m5(){
     super.m1();
     this.m5();
 }

    public static void main(String[] args) {

        ChildClass cc = new ChildClass();

        cc.m1();
        cc.m2();
        cc.m3();
        cc.m4();
    }
}
