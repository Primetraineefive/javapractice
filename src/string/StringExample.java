package string;

/**
 * Created by Jay
 */
public class StringExample {
    public static void main(String[] args) {
        String text = "This is a string";
        String name ="Prime";
        int length = text.length();
        int a =123;

        System.out.println(text.charAt(0));
        System.out.println(text.concat(name));
        System.out.println(text.contains("This"));
        System.out.println(text.equals("This is a string"));
        System.out.println(text.substring(7));
        System.out.println(text.toCharArray());
     //   System.out.println();

    }
}