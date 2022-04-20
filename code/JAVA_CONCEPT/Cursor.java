package JAVA_CONCEPT;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * Cursor :
 * It's used to take a element one by one from ArrayList , LinkList ,Vector ,Stack etc..
 *
 * There are a three Cursor
 *      >> Note : All three are a interface
 *
 *   >>Enumerator ( single directional cursor )
 *   >>Iterator  ( single directional cursor )
 *   >>Listiterator ( Bi-directional cursor )
 *
 * All this three are a interfaces that's why we need to a implemented class of this three type
 *
 *      1. Enumerator :
 *          >> It's introduce in version 1.0 that's why it's legacy interface that's why we can use this only vector and stack
 *          >> two method of enumerator
 *          >> hasMoreElement()
 *          >> nextElement() It's return a successive element of a list

 *  Vector has a element() method that return a obj of enumerator implemented class
 *  >> alte jene enumerator ne implement keryu hoy eno obj return kerse
 *
 *      2. Iterator :
 *      >> It's interface of list that's why you can use this in all of the list implemented classes
 *    Note :
 *       All the list class has iterator() method
 *       And all collection implemented classes has iterator()
 *       iterator() method :
 *               it's return a obj of a implemented class of Iterator
 *
 *      >> it has three method
 *         >> hasNext()
 *           >> next()
 *             >> remove()
 *
 *     3. ListIterator :
 *      >> ListIterator is child interface of iterator .
 *      >> ListIterator is bidirectional cursor .
 *      >> All implemented class of collection has a listIterator() Method.
 *
 *          >>Method :
 *                .> hasNext()
 *              hasPrevious()
 *                .> next()
 *              previous()
 *                .> remove()
 *              add()
 *              set()
 *              nextIndex()
 *              previousIndex()
 *
 *
 *
 *
 * */
public class Cursor {
    public static void main(String[] args) {
//        Vector v = new Vector(4);
//        v.add("Udit Narayan");
//        v.add("Lata Mageshker");
//        v.add("Arijit singh");
//        v.add("Sonu Nigam");

//        for (int i = 0; i < 4; i++)
//            System.out.println(v.get(i));

//        System.out.println("Second Method : " );


        // Enumeration
//        Enumeration en=v.elements();
//
//        while (en.hasMoreElements()){
//             System.out.println(en.nextElement());
//        }

//        LinkedList list = new LinkedList();
//
//        for (int i = 0; i < 10; i++)
//            list.add(i);
//        System.out.println(list);
//
//        //Iterator ;
//        Iterator it = list.iterator();
//        while (it.hasNext()) {
//            Integer value = (Integer) it.next();
//            if (value > 2 && value < 8)
//                System.out.println(value);
//            else
//                it.remove();
//        }
//        System.out.println(list);

        ArrayList ar = new ArrayList(4);
        ar.add("Java");
        ar.add("Kotlin");
        ar.add("Python");
        ar.add("Flutter");
        ar.add("C++");

        ListIterator ls = ar.listIterator();   // listIterator() it's return a object


        /*while (ls.hasNext()) {

            System.out.println("has a Previous : "+ls.hasPrevious());
            System.out.println(ls.next());
            System.out.println("has a Next : "+ls.hasNext()+"\n");
        }*/
        while (ls.hasNext()) {

            System.out.println("Previous Index : "+ls.previousIndex());
            System.out.println(ls.next());
            System.out.println("Next Index : "+ls.nextIndex()+"\n");
            if (ls.nextIndex()==5) {
                ls.add("C");
            }

        }


        System.out.println(ar);



    }

}
