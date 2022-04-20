package JAVA_CONCEPT;

/*
 SET has two interface
       >> 1.SortedSet
         >> 2.Navigable

1.SortedSet :

 >> It's store an element in logical order .
 >> It has some method
        1.first()  return a first element
        2.last()   return a first element
        3.headSet(Element e)  return a  view portion which is strictly less than from Element
             >> It's return a whole set (whole portion)
        4 tailSet(Element e) return a view portion which is greater than or equal to Element
        5.subSet(index include, index exclude) return a sub-set
        6.comparator()  it's a interface by using this you can sort a collection in your own logic



*/


import java.util.TreeSet;

public class C1_SortedSet {
    public static void main(String[] args) {

        TreeSet sr= new TreeSet();
        sr.add("A");
        sr.add("D");
        sr.add("G");
        sr.add("F");
        sr.add("a");
        sr.add("B");
        System.out.println("First element of this Set : "+sr.first());
        System.out.println("Last element of this Set : "+sr.last());
        System.out.println("HeadSet is : "+sr.headSet("a"));
        System.out.println("TailSet is : "+sr.tailSet("D"));






//        System.out.println("Higher element is : "+sr.higher("A"));
//        System.out.println("Lower element is : "+sr.lower("A"));


    }
}
