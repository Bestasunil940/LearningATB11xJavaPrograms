package ex_programs;

import java.util.Scanner;

public class OccurrenceOfVariable {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = s.nextLine();
        System.out.print("Enter the character: ");
        char var = s.next().charAt(0);
        int n = str.length();
        int count =0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == var) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + var + "': " + count);
        s.close();
    }
}

