package JAVA_CONCEPT;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * SET :
 *  It's a child interface of collection
 *  In this interface Duplicate obj are not allowed
 *  It's doesn't preserve a order of elements
 *  It's according to it's hash code .
 *   Note :
 *     >> It's doesn't had any method
 *  classes of this interface :
 *   >>HashSet
 *   >>LinkedHashSet()
 *
 * */
public class B1_SET {
    public static void main(String[] args) {
        ArrayList arp = new ArrayList(3);
        arp.add("D");
        arp.add("A");
        arp.add("c");
        arp.add("Munna");
        arp.add("chandan");
        arp.add("Bansari");

        HashSet house = new HashSet();
        house.add("A");
        house.add("Aaman");
        house.add("Babu");
        house.add("B");
        house.add("Champak");
        house.add("Dadu");
        house.add("F");
        house.add("D"); //Duplicate are not allowed

        //Remember All member are set as hash codeZ
        System.out.println(house);


        //It has 4 Constructor
       /*
       HashSet()
        default
        capacity is 16;
        After filled a 75 % of object, It 's grow Dynamically
        so fill ratio or load factor is 0.75

        HashSet(Capacity)
        you also provide a capacity of hashset object

        HashSet( int capacity, float lead-factor)

        HashSet(Collection c);
        you can store a all collection interfaces object


        */

        HashSet hs = new HashSet(arp);
        System.out.println(hs);

    }
}
