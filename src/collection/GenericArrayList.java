package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jay
 */
public class GenericArrayList {

    public static void main(String[] args) {

        /*List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);*/

        List<String> list = new ArrayList<String>();
        list.add("Prime");
        list.add("Prime1");
        list.add("Prime2");
        list.add("Prime3");
        list.add("Prime4");
        list.add("Prime5");

        /*for ( String value: list) {
            if (value.equals("Prime3")){
                list.remove();
            }
            System.out.println(value);
        }*/

        for (int i = 0; i <list.size(); i++){
            if (list.get(i).equals("Prime3")){
                list.remove(i);
            }
            System.out.println(list.get(i));
        }
    }
}
