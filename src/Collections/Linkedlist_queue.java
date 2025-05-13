package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist_queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Outputs: A, B, C
        }
    }
}
