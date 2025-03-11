package ex_03_literals;

import java.util.Scanner;

public class factorial_num_for_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1;

        if (number<1){
            System.out.println(factorial);
        }
        else {
            for (int i = number; true; i--) {
                if (i==0){
                    break;
                }
                factorial = factorial*i;
            }
            System.out.println("factorial of the given number is: " + factorial);
        }
    }
}
