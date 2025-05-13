package ex_02_java_Basic_part2;

public class linear_search {
    public static void main (String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7; // Element to search
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                System.out.println(i);
                break;
            }
        }

        if (found) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
    }
}
