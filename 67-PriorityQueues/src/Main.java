import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Priority Queue - A FIFO data structure that serves elements
        //with the highest priorities first
        //before elements with lower priority.

        //Normal queue with NO priority
        //All the elements are displayed as they are offered to the list
        //Queue<Double> queue = new LinkedList<>();
        //Priority queue - sorts all the elements in ascending order.
        //Queue<Double> queue = new PriorityQueue<>();
        //Priority queue in reverse(descending) order.
        //Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        /*queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);*/

        //Strings in default order
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        //Strings in reverse order
        //Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
