package Comparable;

import java.util.Arrays;

public class AlphabetSort {
    public static void main(String[] args) {
        String[] names = { "Zara", "Anna", "John" };
        Arrays.sort(names); // uses Comparable of String
        System.out.println(Arrays.toString(names));
    }
}

