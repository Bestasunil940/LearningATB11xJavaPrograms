package ex_02_java_Basic_part2;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,60};
        int indexToDelete = 2; // Deleting 30

        // Shifting elements
        for (int i = indexToDelete; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Print the updated array
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Output: 10 20 40 50 60
