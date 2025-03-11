package ex_programs;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        // Check for valid input (no zero or negative values)
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: Side lengths must be greater than zero.");
        }
        // Check Triangle Inequality Theorem
        else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("✅ The given sides form a valid triangle.");

            // Check for Equilateral Triangle
            if (a == b && b == c) {
                System.out.println("Type: Equilateral Triangle (All sides are equal)");
            }
            // Check for Isosceles Triangle
            else if (a == b || a == c || b == c) {
                System.out.println("Type: Isosceles Triangle (Two sides are equal)");
            }
            // Check for Right-Angled Triangle (Pythagorean theorem)
            else if (isRightAngled(a, b, c)) {
                System.out.println("Type: Right-Angled Triangle (Pythagorean theorem holds)");
            }
            // Otherwise, it's a Scalene Triangle
            else {
                System.out.println("Type: Scalene Triangle (All sides are different)");
            }
        }
        else {
            System.out.println("❌ Invalid Triangle: The given sides do not satisfy the Triangle Inequality Theorem.");
        }

        sc.close();
    }

    // Function to check if the triangle is right-angled
    private static boolean isRightAngled(double x, double y, double z) {
        double max = Math.max(x, Math.max(y, z));
        double sumOfSquares = x * x + y * y + z * z;
        return 2 * (max * max) == sumOfSquares;
    }
}

