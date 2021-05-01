package statements;

/**
 * Created by Jay
 */
public class WhileLoopExample {
    public static void main(String[] args) {
        /*int a =1;
        while(a>0){

            System.out.println(a);
            if(a==5) {
                System.out.println(a);
                break;
            }
            a++;
        }*/
        int i = 3;
        int a = i++;
        int b = ++i;
        System.out.println(a);
        System.out.println(b);
    }
}
