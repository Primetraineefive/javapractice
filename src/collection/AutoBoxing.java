package collection;

/**
 * Created by Jay
 */
public class AutoBoxing {

    public static void main(String[] args) {
        int var = 10;
        Integer obj = new Integer(var); // wrapping   ------> AutoBoxing
        System.out.println(obj);

        Integer i = obj;
        int a = obj; // unwrapping -----> Unboxing

    }
}
