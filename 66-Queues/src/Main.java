import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //Queue = FIFO data structure. First-In First-Out
        //A collection designed for holding elements prior to processing
        //Linear data structure

        //add = enqueue = offer()
        //remove = dequeue = poll()

        //Where are queues useful?

        //1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        //2. Printer Queue (Print jobs should be completed in order)
        //3. Used in LinkedLists, PriorityQueues, Breadth-first search

        Queue<String> queue = new LinkedList<String>();

        queue.offer("John");
        queue.offer("Tom");
        queue.offer("Steve");
        queue.offer("Andy");

        //System.out.println(queue.peek());
        //queue.poll();
        //System.out.println(queue);

        //System.out.println(queue.isEmpty());
        //System.out.println(queue.size());
        //System.out.println(queue.contains("Andy"));

    }
}
