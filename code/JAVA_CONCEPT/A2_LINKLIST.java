package JAVA_CONCEPT;
/*
It's implemented class of list
LinkList elements are not necessary to stored in continues memory location
Time of inserting an element in middle is less
Access of nth element in linklist is difficult
It has all method of list .
*/

import java.util.LinkedList;

public class A2_LINKLIST {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("Vivo");

        list.add("Oppo");
        list.add("One+");
        list.add("Samsung");

        System.out.println(list);
//        list.addFirst("Apple");
//        System.out.println("After a adding first : "+list);
//        list.addLast("Nokia");
//        System.out.println("After a adding Last : "+list);
//
//        System.out.println("Get a first : "+list.getFirst());
//        System.out.println("Get a Last : "+list.getLast());
//        list.removeFirst();
//        System.out.println("After Remove a first : "+list);
//        list.removeLast();
//        System.out.println("After Remove a Last : "+list);



    }
}
