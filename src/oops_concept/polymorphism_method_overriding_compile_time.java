package oops_concept;

public class polymorphism_method_overriding_compile_time {
   static class Calculator {
        // Method to add two integers
        public int add(int a, int b) {
            return a + b;
        }

        // Method to add three integers
        public int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println(calc.add(2, 3)); // Uses the method with two parameters
            System.out.println(calc.add(2, 3, 4)); // Uses the method with three parameters
        }
    }


}
