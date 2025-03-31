package ex_programs;

import java.util.Scanner;

public class Arrays {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get matrix size from user
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (N): ");
        int n = sc.nextInt();

        // Step 2: Declare the matrix
        int[][] matrix = new int[m][n];

        // Step 3: Take user input for the matrix
        System.out.println("Enter " + (m * n) + " elements row-wise:");
        for (int i = 0; i < m; i++) {  // Loop for rows
            for (int j = 0; j < n; j++) {  // Loop for columns
                matrix[i][j] = sc.nextInt();  // Taking input
            }
        }

        // Step 4: Print the matrix to verify input
        System.out.println("Your input Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " "); // Print matrix elements
            }
            System.out.println(); // Move to the next row
        }
    }
}
