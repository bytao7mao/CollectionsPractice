package HashMaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import static java.util.Collections.synchronizedMap;

/**
 * Created by taoLen on 5/1/2018.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, Book> map = synchronizedMap(new HashMap<>());
        Book b1 = new Book(23, "Harry Potter", "Billy");
        Book b2 = new Book(244, "Pocahontas", "James");
        map.put(1, b1);
        map.put(2, b2);

        //traversing map
        for (Map.Entry<Integer,Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.printf("%d KEY\n", key);
            System.out.printf("The Value: %d  %s  %s\n", b.id, b.name, b.author);

        }

    }
}
