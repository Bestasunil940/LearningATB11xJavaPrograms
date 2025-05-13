package Exceptions;

public class try_catch {
    public static void main (String[] args){
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero is not allowed.");
        }
    }
}
