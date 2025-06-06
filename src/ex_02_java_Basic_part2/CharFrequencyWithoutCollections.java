package ex_02_java_Basic_part2;

import java.util.Scanner;

public class CharFrequencyWithoutCollections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner object

        System.out.print("Enter the String: ");
        String input = sc.nextLine();// Read entire line

        // Step 1: Convert to lowercase and remove spaces
        input = input.toLowerCase().replace(" ","");

        // Step 2: Convert string to character array
        char[] ch = input.toCharArray();

        // Step 3: Create a visited array to track counted characters
        boolean [] visited = new boolean[ch.length];

        System.out.println("\nCharacter frequencies (case-insensitive, excluding spaces):");

        // Step 4: Count character frequencies
        for (int i = 0; i < ch.length; i++) {
            if(visited[i]){
                continue;
            }
            int count = 1;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(ch[i] + ": " + count);
        }
        sc.close(); // Close scanner
    }
}
