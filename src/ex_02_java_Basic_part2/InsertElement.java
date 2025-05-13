package ex_02_java_Basic_part2;

public class InsertElement {
    public static void main (String[] args) {
        int [] oldArray = {10,20,40,50};
        int elementToAdd = 30;
        int pos = 2;

        int[] newArray = new int[oldArray.length+1];

        for (int i = 0; i < pos; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[pos] =elementToAdd;

        for (int i = pos; i < oldArray.length; i++) {
           newArray[i+1] = oldArray[i];
        }

        System.out.println("After insertion of element: ");
        for (int i = 0; i <newArray.length ; i++) {
            System.out.print(i + " ");
        }
    }
}
