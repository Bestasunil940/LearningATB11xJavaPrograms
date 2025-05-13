package Collections;

import java.util.TreeMap;

public class Tree_map {
    public static void main(String[]args){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Cherry");
        map.put(1, "Apple");
        System.out.println(map.values());
    }
}
