package JAVA_CONCEPT;

import java.util.ArrayList;

/*
 * Remember it has a both method of Collection and List
 * ArrayList is use concept of a dynamic array
 * It's resizeable .
 * It's growable array
 *
 * Constructor of ArrayList
 *
 * ArrayList(initial capacity)
 *  >> create a empty ArrayList object of given capacity
 *
 * ArrayList( )
 *  >> create a empty ArrayList object of default 10 size capacity
 *
 * ArrayList(Collection a)
 * >>   create a ArrayList of given collection size
 * >>    And copy all the element in this ArrayList
 *
 * */
public class A3_ArrayLIst {

    public static void main(String[] args) {

        ArrayList alist = new ArrayList(3);
        alist.add("Jio");
        alist.add("Airtel");
        alist.add("VI");
        alist.add("BSNL"); // It's grow dynamically

        System.out.println(alist);
        alist.set(0, "Relance");
        System.out.println(alist);


    }
}
