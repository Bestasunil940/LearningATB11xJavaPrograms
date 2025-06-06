package ex_02_java_Basic_part2;

import java.util.Scanner;



public class AnagramCheck_without_collections {
    public static void main(String[] args) {
        // Step 1: taking input
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Step 2: checking null vlaues
        if (str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            System.out.println("One or both strings are null or empty. Cannot check for anagram.");
            return;
        }


        // Step 3: normalizing the string(coverting to lower case)
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 4: checking the both the string of same size
        if(str1.length()!=str2.length()){
            System.out.println("Not anagrams (different lengths)");
        }

        // Step 5: Convert strings to char arrays
        char[]arr1 = str1.toCharArray();
        char[]arr2 = str2.toCharArray();

        // step 6:Create visited array to track matched characters in arr2
        boolean[] visited = new boolean[arr2.length];
        boolean isAnagram = true;

        //step 7: check the char manually
        for (int i =0; i<arr1.length; i++){
            boolean found = false;
            for(int j =0; j<arr2.length; j++){
                if(arr1[i] == arr2[j] && !visited[j]){
                    visited[j] = true;
                    found = true;
                    break;
                }
            }
            if(!found){
                isAnagram = false;
                break;
            }
        }
        // Step 8: Print result
        if (isAnagram) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are NOT anagrams.");
        }

        sc.close();
    }
}
