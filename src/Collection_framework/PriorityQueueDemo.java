package Collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

// Priority Queue works on  FIFO Method .
public class PriorityQueueDemo {
    public static void main(String[] args) {

        Queue q = new PriorityQueue();
        q.add(10);
        q.add(55);
        q.add(60);
        q.add(75);
        q.add(40);
        System.out.println(q);
        System.out.println("Peek ele ="+q.peek());   // peek is do to display the first value in the list.
        System.out.println("Poll ele ="+q.poll());   // poll will remove the first value in the list which we peek.
        System.out.println(q);
    }
}
