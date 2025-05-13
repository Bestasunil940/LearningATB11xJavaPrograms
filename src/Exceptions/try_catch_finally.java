package Exceptions;

public class try_catch_finally {
    public static void main (String[] args) {
        try {
            int result = 0/10; // This will throw ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            int result = 10/0;
            System.out.println("This block will always execute.");
        }
    }
}
