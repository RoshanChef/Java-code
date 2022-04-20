package Questions;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class employ {
    private int sal;
    private int id;
    private String name;

    employ(int sal, int id, String name) {
        this.sal = sal;
        this.id = id;
        this.name = name;
    }

    int getSal() {
        return sal;
    }

  int getId() {
        return id;
    }

    String getName() {
        return name;
    }

}

class cm implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        employ em1 = (employ) obj1;
        employ em2 = (employ) obj2;

        if (em1.getSal() < em2.getSal()) {
            return -1;
        } else if (em1.getSal() > em2.getSal()) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class exam {
    public static void main(String[] args) throws Exception {

        employ e1 = new employ(100, 10423, "munna");
        employ e2 = new employ(50, 5023, "laloo");
        employ e3 = new employ(10, 23, "munna");

        TreeSet tr = new TreeSet(new cm());

        tr.add(e1);
        tr.add(e2);
        tr.add(e3);

        System.out.println(tr);
        employ pr;
        Iterator it = tr.iterator();
        while (it.hasNext()) {
            pr = (employ) it.next();
            System.out.println(pr.getSal() + " " + pr.getName() + " " + pr.getId());

        }


    }
}
