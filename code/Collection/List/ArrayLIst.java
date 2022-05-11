import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayLIst {
    public static void main(String[] args) {

        // ArrayList<Integer> list = new ArrayList<Integer>();
        List<Integer> list = new LinkedList<Integer>();

        // add element
        list.add(3);
        list.add(2);
        list.add(0);
        list.add(81);

        // System.out.println(list);

        // get element
        // int ele=list.get(1);
        // System.out.println("The element is : "+ele);

        // add at position
        // list.add(0, 199);
        // System.out.println(list);

        // set element
        // list.set(1, 303);
        // System.out.println(list);

        // delete element
        // list.remove(2);
        // System.out.println(list);

        // size
        // int length= list.size();
        // System.out.println(length);

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println("Element at index " + i + " is " + list.get(i));
        // }


        // add all
        // List<Integer> a = new ArrayList<>();
        // a.add(9);
        // a.add(7);
        // a.add(8);

        // System.out.println(a);

        // list.addAll(a);
        // System.out.println(list);

        // clear
        // list.clear();
        // System.out.println(list);

        // List<Integer> now = new ArrayList<>();
        
        // now.add(17);
        // now.add(107);
        // now.add(90);

        // list.removeAll(now);

        // contains
        System.out.println("the value is : " + list.contains(3));

        // Iterator<Integer> it = list.iterator();

        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        System.out.println("\n\n\ncode is finished");
    }
}
