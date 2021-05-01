package exceptions;

/**
 * Created by Jay
 */
public class RunTimeExceptionDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Program start");
        try {
            int divide = a/b;
            System.out.println("Result :" + divide);
            int [] numbers = {1,2,4};
            System.out.println(numbers[2]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This is finally block");
        }
        System.out.println("Program End");
    }
}
