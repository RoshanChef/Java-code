import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class collections {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(1);
        list.add(23);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(84);
        list.add(8);

        // sorting
        // Collections.sort(list);
        // Collections.sort(list,Comparator.reverseOrder());

        // System.out.println(Collections.min(list));
        // System.out.println(Collections.max(list));
        // System.out.println(Collections.frequency(list, 7));

        System.out.println("The min value is : " + Collections.min(list));
        System.out.println("The max value is : " + Collections.max(list));
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        System.out.println(list2);

        System.out.println("After changing these things "+list);



        

        System.out.println("\n\n\n code is finished");
    }
}
