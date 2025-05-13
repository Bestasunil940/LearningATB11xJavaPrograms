package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi");

        Collections.sort(list, (a, b) -> a.length() - b.length());

        System.out.println(list); // [kiwi, apple, banana]
    }
}

