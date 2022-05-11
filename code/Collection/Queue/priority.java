import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority {
    public static void main(String[] args) {

        // min heap
        // PriorityQueue<Integer> pq = new PriorityQueue<>();

        // max heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(78);
        pq.offer(34);
        pq.offer(24);
        pq.offer(15);

        // 78 34 24 15

        // pq.poll();
        // pq.poll();

        System.out.println(pq);
        // System.out.println(pq.peek());

        System.out.println("\n\n\n code is finished");
    }
}
