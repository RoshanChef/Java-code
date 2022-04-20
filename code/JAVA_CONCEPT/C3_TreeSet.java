package JAVA_CONCEPT;
/*
 * Tree :
 * It's a implemented class of navigableSet
 * only homogeneous obj are allowed it means only same class objects are allowed .
 * >> default sorting follows some rules
 *    >>for Number obj : it's follows natural sorting  like for a number 1 2 3
 *          >>For String obj :it's follows a alphabetical order like .. a b c d
 *
 * >>wrapper class and string class implement a comparable interface
 *    >> in comparable interface it has only compareTo() fun.
 *       compareTo() >> obj1.compareTo.obj2;
 *        return -1 if obj 1 < obj 2
 *        return 1  if obj 1 > obj 2
 *        return 0  if obj 1 = obj 2
 *     >> which is compare two obj and sort into ascending order
 * that's why when declare tree() obj then it's call a compareTo() and it sorted in ascending order
 *
 * when you want to a sort into a in your own logic then you need to implement comparator() interface
 *      >> comparator interface has a compare() function
 *      >> compare(obj 1, obj 2);  you need to implement a compare function.
 *        return -1 if obj 1 < obj 2
 *        return 1  if obj 1 > obj 2
 *        return 0  if obj 1 = obj 2
 *   >> In a tree (comparator ) It's call compare fun and sort into logic of compare fun ..
 *
 * >> It has 4 constructor
 *    TreeSet()
 *    TreeSet(Comparator c)
 *    TreeSet(Collection c )
 *    TreeSet(sortedSet s)
 *
 * */

//By using Comparator we can do default sorting of objj.
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Book {
    private String title;
    private double price;

    Book(String name, double price) {
        title = name;
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    double getPrice() {
        return price;
    }

}

class mycom implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {

        Book bk1 = (Book) o1;
        Book bk2 = (Book) o2;

        if (bk1.getPrice() < bk2.getPrice()) {
            return -1;
        } else if (bk1.getPrice() > bk2.getPrice()) {
            return 1;
        } else {
            return 0;
        }

    }
}


public class C3_TreeSet {


    public static void main(String[] args) {

        Book b1 = new Book("JAVA", 600);
        Book b2 = new Book("PHP", 100);
        Book b3 = new Book("C", 400);

        TreeSet com = new TreeSet(new mycom());
        com.add(b1);
        com.add(b2);
        com.add(b3);

        Iterator it = com.iterator();
        Book pr;
        while (it.hasNext()) {
            pr = (Book) it.next();
            System.out.println(pr.getTitle() + " " + pr.getPrice());

        }

    }
}
