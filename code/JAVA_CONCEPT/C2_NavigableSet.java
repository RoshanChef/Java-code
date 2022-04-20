package JAVA_CONCEPT;


 /* NavigableSet :

   >> It's child interface of sortedSet.
   >>It has some method
     1.ceiling(ele. ) return a grater than or equal value from given element
     2.floor(ele.) return a grater than or equal value from given element
     3.pollFirst(ele. )  return
     4.pollLast(ele. )  return
     5.higher(ele. )  return greater then value from given element
     6.lower(ele. )  return  less than value from given element
   */


import java.util.TreeSet;

public class C2_NavigableSet {
    public static void main(String[] args) {


    TreeSet tr=new TreeSet();
     tr.add("A");
     tr.add("G");
     tr.add("W");
     tr.add("H");
     tr.add("F");
        System.out.println(tr);
        System.out.println("Celling Method : "+tr.ceiling("F"));
        System.out.println("Floor Method : "+tr.floor("N"));

    //  >>if it doesn't contain any higher value from that then it's return a null
        System.out.println("Higher Method : "+tr.higher("W"));
        System.out.println("Lower Method : "+tr.lower("B"));

        System.out.println(tr.pollFirst());
        System.out.println(tr.pollLast());


    }
}
