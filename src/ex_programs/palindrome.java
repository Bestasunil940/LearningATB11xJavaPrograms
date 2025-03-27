package ex_programs;

import java.util.Scanner;

public class palindrome {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int n = str.length();
        String reverse ="";
        for (int i=n-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

        if (str.equals(reverse)){
            System.out.println("Given string is a palindrome");
        }else {
            System.out.println("Given string is not a palindrome");
        }
    }

}
