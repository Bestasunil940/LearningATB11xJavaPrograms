package Collections;

import java.util.Hashtable;

public class Hash_Table {
    public static void main (String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        System.out.println(map.values()); // output in descending order.
    }
}
