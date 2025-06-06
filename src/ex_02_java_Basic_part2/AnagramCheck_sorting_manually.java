package ex_02_java_Basic_part2;

import java.util.Scanner;

public class AnagramCheck_sorting_manually {
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
        bubbleSort(arr1);
        bubbleSort(arr2);

        boolean isAnagram = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }


        sc.close();
    }

    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

}
