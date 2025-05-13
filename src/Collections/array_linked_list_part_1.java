package Collections;

import java.util.LinkedList;

public class array_linked_list_part_1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");

        System.out.println(linkedList); // Output: [Dog, Elephant, Fox]
        linkedList.addFirst("Cat");
        System.out.println(linkedList); // Output: [Cat, Dog, Elephant, Fox]
    }
}
