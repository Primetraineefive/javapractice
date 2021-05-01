package arrays;

/**
 * Created by Jay
 */
public class ArraysExample {
   int a [] ;
    String [] b;

    public static void main(String[] args) {
        int [] x = new int[7];
        x[0]=10;
        x[1]=20;
        x[2]=30;
        x[3]=40;
        x[4]=50;
        x[5]=60;
        x[6]=70;
      int  size =x.length;
        System.out.println(size);
        for (int i=0; i<7; i++){
            System.out.println(x[i]);
        }


    }

}
