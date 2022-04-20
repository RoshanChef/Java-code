/*

Class :
 > Class is a template of a real object it's doesn't take a memory in heap

Object :
 > object is real world entity
 > you can create multiple constructor of same class
 > when you declare. It's take memory in heap and it's call a constructor
 > it just reference of object

Constructor :
 > constructor same as function but it is not return anything
 > constructors are declare in the class
 > Name of constructor is same as a Name of class
 > you can set a value of object

 */

class box {
    int l, h;

    box() {
        System.out.println("This is a overloaded constructre");
    }

    protected box(int a, int b) {
        l = a;
        h = b;
    }
}

public class b2_constructor {
    b2_constructor() {
        System.out.println("Hello i am constructor");
    }

    public static void main(String[] args) {

        box b1 = new box(5, 6);
        System.out.print(b1.l + " ");
        System.out.println(b1.h);

        box b2 = new box();
        System.out.println("i am tester");
    }
}
