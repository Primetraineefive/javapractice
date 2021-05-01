package inheritence;

/**
 * Created by Jay
 */
public  class ChildClass extends ParentClass  {
    public void m3(){
        m1();
        System.out.println("Child class method m3");
    }
    public void m4(){
        System.out.println("Child class method m4");
    }

    public static void main(String[] args) {
              ChildClass cc = new ChildClass();

    }
}
