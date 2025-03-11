package ex_programs;

import java.util.Scanner;

public class setMatrixZero {
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

        //int M = matrix.length, N = matrix[0].length;
        boolean firstRowZero = false, firstColZero =false;

        // now setting values to zero.

        // Step 1: Check if the first row has a zero
        for(int j = 0; j< n; j++) {  // iteration over columns
            if(matrix[0][j] ==0) {
                firstRowZero =true;
                break;
            }
        }

        // Step 2: Check if the first column has a zero
        for(int i =0; i < m; i++) {  // iteration over rows
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Step 3: Use first row and column as markers
        for (int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;  // marking the first cell of the row
                    matrix[0][j] =0;   // marking the first cell of the column
                }
            }
        }

        // Step 4: Set matrix elements to zero based on markers
        for (int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: Handle the first row separately
        if(firstRowZero){
            for (int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

        // Step 6: Handle the first column separately
        if(firstColZero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }

        System.out.println("Updated Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " "); // Print matrix elements
            }
            System.out.println(); // Move to the next row
        }
        sc.close(); // Close scanner
    }

}
