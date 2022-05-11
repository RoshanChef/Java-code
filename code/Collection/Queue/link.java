import java.util.LinkedList;
import java.util.Queue;

public class link {
    public static void main(String[] args) {

        Queue<Integer> inter = new LinkedList<>();
        inter.offer(10);
        inter.offer(78);
        inter.offer(98);
        inter.offer(15);

        // 10 78 98 15
        // System.out.println("Queue is : " + inter);

        inter.poll();
        System.out.println("After : " + inter);

        // methods ( opposite it's throw an exception )
        // offer > add
        // peek > element
        // poll > remove
        

        System.out.println("Next is : " + inter.peek());

        System.out.println("\n\n code is finished ");

    }
}
