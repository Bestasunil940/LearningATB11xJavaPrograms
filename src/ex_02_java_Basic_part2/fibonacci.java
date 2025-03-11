package ex_02_java_Basic_part2;

import java.util.Scanner;

public class fibonacci {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = scanner.nextInt();
        int sum;
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i=0; i<=n; i++){
            sum = first + second;
            System.out.println(sum);
            first = second;
            second = sum;
        }
    }
}
