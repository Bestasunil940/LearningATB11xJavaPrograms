package ex_03_literals;

import java.util.Scanner;

public class factorial_num_while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        int factorial = 1;

        if (number<1){
            System.out.println(factorial);
        }
        else {
            while(number!=0){
                factorial = factorial*number;
                number--;
            }
            System.out.println("factorial of the given number is: " + factorial);
        }
    }
}
