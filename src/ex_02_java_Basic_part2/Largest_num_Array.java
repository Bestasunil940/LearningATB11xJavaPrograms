package ex_02_java_Basic_part2;

public class Largest_num_Array {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 9, 3, 8, 4, 7, 6, 5};
        int Largest =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=Largest){
               Largest=arr[i];
            }
        }
        System.out.println("Largest number in the given array is: " + Largest);
    }
}