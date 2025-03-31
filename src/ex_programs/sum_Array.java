package ex_programs;

import java.util.Arrays;
import java.util.Scanner;

public class sum_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements: ");

        for (int i = 0; i < n ; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Your elements in Array are: ");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < n; i++) {
             sum = sum + arr[i];
        }
        System.out.println("Sum of elements of a given array is: " + sum);
        s.close();
    }
}
