package programes;

import java.util.Scanner;

/**
 * Created by Jay
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = input.nextInt();
        String name = input.nextLine();
        System.out.println("Enter second number :");
        int b = input.nextInt();
        double result;
        Calculator cal = new Calculator();
        result = cal.addition(a, b);
        System.out.println("This is addition of " + a + " and " + b + " : " + result);
        result = cal.subtraction(a,b);
        System.out.println("This is subtraction of " + a + " and " + b + " : " + result);
    }

}
