package ex_02_java_Basic_part2;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck_with_utility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("One or both strings are null or empty. Cannot check for anagram.");
            return;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("Not anagrams (different lengths)");
            return;
        }
        char[]arr1 = str1.toCharArray();
        char[]arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }
        sc.close();
    }
    public static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}
