import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(81);
        dq.offerFirst(15);
        dq.offerLast(24);
        dq.offer(101);

        System.out.println(dq);

        // peek
        // System.out.println(dq.peek());
        // System.out.println(dq.peekFirst());
        // System.out.println(dq.peekLast());

        //poll
        // System.out.println(dq.poll());
        // System.out.println(dq.pollFirst());
        // System.out.println(dq.pollLast());






        System.out.println("\n\n\n Code is Finished");

    }

}
