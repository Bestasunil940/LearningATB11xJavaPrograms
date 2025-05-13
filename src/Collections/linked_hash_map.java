package Collections;

import java.util.LinkedHashMap;

public class linked_hash_map {
    public static void main (String[]args){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        System.out.println(map.values());
    }
}
