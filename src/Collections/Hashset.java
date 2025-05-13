package Collections;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println(set); // Output: [Banana, Cherry, Apple] (order not guaranteed)
    }
}
