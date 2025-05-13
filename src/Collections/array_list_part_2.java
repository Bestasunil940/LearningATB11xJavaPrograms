package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class array_list_part_2 {
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addFirst(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.addLast(5);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.indexOf(3));
    }
}
