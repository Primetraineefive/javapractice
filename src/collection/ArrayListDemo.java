package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jay
 */
public class ArrayListDemo {

    /**
     * 1. Insertion of value is in preserve order - one of important thing of list
     * 2. You can store the null value as well
     * 3. You can add duplicate value into list
     *
     */

    public static void main(String[] args) {
        // How to add the value into list
        ArrayList list = new ArrayList();
        list.add(10);
        list.add("Prime");
        list.add(20.25);
        list.add(null);
        list.add(true);
        list.add("Prime");

        System.out.println(list);

        // How to fetch the values from the list
        System.out.println(list.get(4));

        // Print the size
        System.out.println(list.size());

        // Iterating the list using for loop
       /* for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }*/

        // Iterating the list using for each loop
        for ( Object value: list) {
            System.out.println(value);
        }

        //Remove element from list
        list.remove(4);

        // Iterating the list using Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }





    }
}
