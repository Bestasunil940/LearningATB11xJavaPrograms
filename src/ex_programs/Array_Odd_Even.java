package ex_programs;

import java.util.Scanner;

public class Array_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;

        // Taking array input and counting even & odd numbers
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++; // Count even numbers
            } else {
                oddCount++;  // Count odd numbers
            }
        }
        System.out.println("size of even array is: " + evenCount);
        System.out.println("size of odd array is: " + oddCount);

        // Creating new arrays with exact size
        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];

        // Filling the even and odd arrays
        int eIndex = 0, oIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[eIndex] = arr[i];
                eIndex++;
            } else {
                oddArr[oIndex] = arr[i];
                oIndex++;
            }
        }
        sc.close(); // Closing Scanner

        // Printing Even Numbers in Array Format
        System.out.print("Even numbers: [");
        for (int i = 0; i < evenArr.length; i++) {
            System.out.print(evenArr[i]);
            if (i < evenArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Printing Odd Numbers in Array Format
        System.out.print("Odd numbers: [");
        for (int i = 0; i < oddArr.length; i++) {
            System.out.print(oddArr[i]);
            if (i < oddArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

