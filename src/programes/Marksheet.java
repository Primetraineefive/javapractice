package programes;

import java.util.Scanner;

/**
 * Created by Jay
 */
/*3. Write a java program to input student Name, roll No, and three subjects Math, Science and
    English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
    Input, Marks should between 0 to 100”) and find out total, percentage and result.
    If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
    %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     _______________________________
    |                               |
    |        Mark Sheet             |
    |_______________________________|
    |        Name   : Jay           |
    |       Roll No : 08            |
    |_______________________________|
    |      Subjects : Marks         |
    |_______________________________|
    |        Math   : 98            |
    |       Science : 90            |
    |       English : 85            |
    |_______________________________|
    |       Total   : 273           |
    |_______________________________|
    |    Percentage : 91.0          |
    |       Result  : Pass          |
    |       Grade   : A+            |
    |_______________________________| */
public class Marksheet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter Student Name  : \t");
        String name = input.next();
        System.out.println("Enter Student Roll Number  : \t");
        int rollNumber = input.nextInt();
        System.out.println("Enter Marks of Subject Meths :\t");
        int mathsMarks = input.nextInt(); // -2
        if (mathsMarks<0 || mathsMarks>100){
            System.out.print("Invalid input, Marks should between 0 to 100"); // print
            System.out.print("\nPlease enter correct marks\t\t:");
            mathsMarks = input.nextInt(); // 45
        }
        System.out.println("Enter marks of subject science : \t");
        int scienceMarks = input.nextInt();
        if (scienceMarks<0 || scienceMarks>100){
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks\t\t:");
            scienceMarks = input.nextInt();
        }



    }
}
