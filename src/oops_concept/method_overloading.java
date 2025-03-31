package oops_concept;

public class method_overloading {

    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));          // int version
        System.out.println(calc.add(5.2, 3.8));      // double version
        System.out.println(calc.add(1, 2, 3));       // three int version
        System.out.println(calc.add(3,2));
        System.out.println(calc.add(2.7,3.3));
        System.out.println(calc.add(4, 5, 6));

    }

}
