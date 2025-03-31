package ex_programs;

import java.util.Arrays;
import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Your elements in Array are: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
        s.close();
    }
}
