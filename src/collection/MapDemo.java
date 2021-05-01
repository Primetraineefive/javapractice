package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jay
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "bmw");
        map.put(6, "Audi");
        map.put(4, "Honda");

        System.out.println(map);

        System.out.println(map.get(4));

        map.put(4, "BMW");

        System.out.println(map.get(4));
    }
}
