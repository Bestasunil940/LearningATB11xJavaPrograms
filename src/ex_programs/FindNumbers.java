package ex_programs;

import java.util.Scanner;

public class FindNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Edge case: If array size is less than 2, we can't find second largest/smallest
        if (n < 2) {
            System.out.println("Array should have at least 2 elements.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initializing values
        int firstSmallest = arr[0];
        int firstLargest = arr[0];

        // Finding first smallest and first largest
        for (int i = 0; i < n; i++) {
            if (arr[i] < firstSmallest) {
                firstSmallest = arr[i];
            }
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];
            }
        }

        // Finding second smallest
        int secondSmallest = firstLargest; // Set it to max possible value in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstSmallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        // Finding second largest
        int secondLargest = firstSmallest; // Set it to min possible value in the array
        for (int i = 0; i < n; i++) {
            if (arr[i] < firstLargest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        // Printing results
        System.out.println("First Smallest: " + firstSmallest);
        System.out.println("First Largest: " + firstLargest);

        // Handling cases where second smallest/largest doesn't exist
        if (secondSmallest == firstLargest) {
            System.out.println("Second Smallest: No second smallest found");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }

        if (secondLargest == firstSmallest) {
            System.out.println("Second Largest: No second largest found");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

        sc.close();
    }
}
