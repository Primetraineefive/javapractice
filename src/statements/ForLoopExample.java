package statements;

/**
 * Created by Jay
 */
public class ForLoopExample {


    public static void main(String[] args) {

        int i;
        for (i=1; i<11; i++){
            if(i!=5 && i!=7 && i!=8){
                System.out.println(i);
            }
            if (i==8){
                System.out.println("Hello");
                break;
            }

        }
    }
}
