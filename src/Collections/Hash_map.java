package Collections;

import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3,"Apple");
        System.out.println(map.values());
    }
}
