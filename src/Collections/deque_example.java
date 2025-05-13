package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque_example {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");

        System.out.println(deque.removeFirst()); // Outputs: A
        System.out.println(deque.removeLast());  // Outputs: C
    }
}
