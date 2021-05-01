package carpetcostcalulator;

import java.util.Scanner;

/**
 * Created by Jay
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter carpet cost : ");
        double cost = scanner.nextDouble();
        System.out.print("Please enter Width  : ");
        double width = scanner.nextDouble();
        System.out.print("Please enter Length : ");
        double length = scanner.nextDouble();

        Carpet carpet = new Carpet(cost);
        Floor floor = new Floor(width, length);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(" Total : " + calculator.getTotalCost());
    }
}
