import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>(0);
        // System.out.println("the capacity is : "+v.capacity());
        // System.out.println(v.size());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        v.addElement(5);
        v.addElement(6);
        v.addElement(7);
        v.addElement(8);
        v.addElement(9);
        v.addElement(10);
        v.addElement(11);

        // System.out.println("the capacity is : "+v.capacity());
        // System.out.println(v.firstElement());
        // System.out.println("the last element is : "+v.lastElement());

        Iterator it = v.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj + " ");
        }

        // System.out.println(v);

        System.out.println("\n\n\n code is finished");
    }
}
