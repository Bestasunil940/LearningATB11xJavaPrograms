package ex_02_java_Basic_part2;

import java.util.Scanner;

public class reverseStringUsingBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        original = original.toLowerCase();
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        if (original.equals(reversed)){
            System.out.println("Given string is a Palindrome");
        }
        else{
            System.out.println("Given string is NOT a Palindrome");
        }
        sc.close();
    }
}
