package ex_02_java_Basic_part2;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram_using_mapping {

    public static boolean areAnagrams(String str1, String str2) {
        // If the lengths differ, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to lowercase to handle case insensitivity
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Frequency maps for both strings
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Count the frequency of each character in both strings
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Compare the frequency maps
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
        sc.close(); // Close scanner
    }
}
