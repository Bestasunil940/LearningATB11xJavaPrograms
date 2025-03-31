package ex_programs;

import java.util.Scanner;

public class palindromeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = s.nextLine();
        s.close();

        if (isPalindrome(input)) {
            System.out.println("The input is already a palindrome.");
        }
        else{
            String palindrome = makePalindrome(input);
            System.out.println("Palindrome: " + palindrome);
            System.out.println("Characters added: " + (palindrome.length() - input.length()));
        }
    }

    public static boolean isPalindrome(String str){
        String reversed = "";
        for (int i = str.length() -1; i>0 ; i--) {
            reversed = reversed + str.charAt(i);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=reversed.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    public static String makePalindrome (String str) {
        String result = str;
        for (int i = str.length() - 2; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
