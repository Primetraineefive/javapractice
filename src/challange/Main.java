package challange;

import java.util.Scanner;

/**
 * Created by Jay
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        int addResult = Calculator.addition(a, b);
        System.out.println("Addition of two numbers :" + addResult);
        Calculator cal = new Calculator();
        int subResult = cal.subtraction(a, b);
        System.out.println("Subtraction of two numbers :" + subResult);
    }
}
