package statements;

/**
 * Created by Jay
 */
public class NestedIfElse {
    public static void main(String[] args) {
        int mathsMarks =78;
        int scienceMarks = 75;
        int englishMarks =90;
        int grade = (mathsMarks+scienceMarks+englishMarks)/3;
        System.out.println("Average marks" +grade);
        if (grade>=80){
            System.out.println("Distinction");
        }else if (grade>=70 || grade<80){
            System.out.println("First class");
        }else if (grade>=50 || grade<70){
            System.out.println("Second class");
        }else {
            System.out.println("Fail");
        }



    }
}
