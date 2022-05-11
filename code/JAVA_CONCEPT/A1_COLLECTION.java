/*

COLLECTION :

 Collection and Collections both are different
    >> Collection is interface
    >> Collections is a class
     >> It means collection has some abstract method
     >> All implemented class
LIST :

  LIST interface extend a collection interface
     >> It means LIST has some abstract method
     >> You can add a different object of a different classes
     >> It has a zero base indexing


  implemented class of a LIST interface
   .> ArrayList ( Follows a array dsa )
   .> LinkList  ( Follows a LINK-LIST DSA )
   .> Vector
       >>Stack (subclass of Vector class)

    remember : All the above implemented class has both method list and collection


*/


import java.util.ArrayList;

public class A1_COLLECTION {
    public static void main(String[] args) {


//        // Methods of a Collection
//        ArrayList arr = new ArrayList(4);
//        arr.add("Roshan Kalmathe");  // void add() is used to insert a objects
//        arr.add("Chhotubhai Kalmathe");
//        arr.add("Meenaben Kalmathe");
//        arr.add("Dhara Kalmathe");
//
//        ArrayList array = new ArrayList(2);
//        array.add("Amazon");
//        array.add("Uber");
//        array.add("Zomato");
//        arr.addAll(array); // void addAll() is used to add a Collection
//
//        System.out.println(arr); // Print ALL The Element Of Class
//        arr.retainAll(array);  // boolean retainAll(collection) retain only that element in " (Collection) "
//        System.out.println("After a changes "+arr);

//        //int size() return a size of Collection
//        System.out.println("Size of a collection : "+arr.size());

//        //boolean contains(obj)
//        System.out.println("Contains : "+arr.contains("Amazon"));

//        //remove() It's used to remove a single object
//        arr.remove("Roshan Kalmathe");
//        System.out.println("After remove : " + arr);
//
//        //removeAll() It's used to remove a collection
//        arr.removeAll(array);
//        System.out.println("After removeAll : " + arr);


//        arr.clear(); // clear all element from collection
//        System.out.println(arr);

//        //Boolean isEmpty()
//        System.out.println("Is empty : "+arr.isEmpty());

        //  Method of  LIST Interface
        ArrayList meth = new ArrayList(4);
        meth.add("Google Chrome"); //you can add more element and its size is extends auto-metically
        meth.add("Microsoft Edge");
        meth.add("Fire-Fox");
        meth.add("Opera");
        meth.add("Internet Explorer");
        meth.add("Opera");

        System.out.println(meth);

//        //get(index); return the element at the given index
//        System.out.println(meth.get(3));

// //set(index,element) It's used to replace a element at given index
//        meth.set(2,"UC browser");
//        System.out.println("After changes : " + meth);

//        //indexOf() return a index of given object searching form starting
//        System.out.println("Index of Opera : " + meth.indexOf("Opera"));
//
//        //lastIndexOf() return a index of given object searching form last
//        System.out.println("last Index of Opera : " + meth.lastIndexOf("Opera"));

        meth.remove("Fire-Fox");
        System.out.println(meth);
        meth.remove(4);
        System.out.println("After remove : "+meth);

        System.out.println(
            "I am working properly"
        );

    }
}
