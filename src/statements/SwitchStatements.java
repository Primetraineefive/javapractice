package statements;

import java.util.Scanner;


public class SwitchStatements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name of the day : ");
        String day = sc.next();
     //   String day =text.;
        //int day =33;
        switch(day.toLowerCase()){
            case "monday" :
                System.out.println("1");
                break;
            case "tuesday" :
                System.out.println("2");
                break;
            case "Wednesday" :
                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("Thursday");
//                break;
//            case 5 :
//                System.out.println("Friday");
//                break;
//            case 6 :
//                System.out.println("Saturday");
//                break;
//            case 7 :
//                System.out.println("Sunday");
//                break;
            default:
                System.out.println("There is no day");
        }
    }
}
