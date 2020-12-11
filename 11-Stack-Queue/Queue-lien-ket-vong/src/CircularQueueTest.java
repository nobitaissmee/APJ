public class CircularQueueTest {
    public static void main(String[] args) {
        CircularQueue<String> queue = new CircularQueue<>();
        queue.enQueue("one");
        queue.enQueue("two");
        queue.enQueue("three");
        queue.enQueue("four");
        queue.enQueue("five");
        System.out.println("Dequeue elements: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.deQueue());
        }
    }
}