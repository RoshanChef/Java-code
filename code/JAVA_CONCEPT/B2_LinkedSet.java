package JAVA_CONCEPT;


import java.util.LinkedHashSet;

/*
* LinkedHashSet :
*   >>It's preserved a order of element .
*    >> It has same constructor as HashSet
* */
public class B2_LinkedSet {
    public static void main(String[] args) {
        LinkedHashSet house = new LinkedHashSet();
        house.add("A");
        house.add("Aaman");
        house.add("Babu");
        house.add("Champak");
        house.add("Dadu");
        house.add("D");

        System.out.println(house);




    }
}
