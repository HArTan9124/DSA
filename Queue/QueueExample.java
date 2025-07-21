import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("Queue: " + queue); // Output: [Apple, Banana, Cherry]

        // Peek at the front element
        System.out.println("Front element: " + queue.peek()); // Output: Apple

        // Dequeue the front element
        queue.remove("Banana");
        System.out.println("Queue after dequeue: " + queue); // Output: [Apple, Cherry]


        queue.add("Grapes");
        System.out.println("Final Queue: " + queue); // Output: [Apple, Cherry, Grapes]
    }
}
