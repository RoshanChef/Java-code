/*
=> when child class object is created then automatically constructor of super class is called
 */

class A {
    int a = 1020;

    A() {
        System.out.println("Hello I am a constructor of A ");
    }

    A(int a) {
//        when you declare this type of constructor it's necessary to declare a default constructor
        System.out.println("The value of A cons. is : " + a);
    }

}

class B extends A {
    {
        a = 2003;
        //System.out.println("Hello kaisae ho aap log");
    }

    B() {
        System.out.println("I am in class B where are you from ...");
    }

    B(int a, int b) {
        super(a);
        System.out.println("The value of cons. B is : " + b);
    }

}

class C extends B {


    C() {
        System.out.println("I am of constructor C ");
    }

    C(int a, int b, int c) {
        super(a, b);
        System.out.println("The value of coms C is : " + c);
    }


}








public class b7_InhCon {
    public static void main(String[] args) {
             // B b1 = new B(5,10);
             C c1 = new C(12, 32, 21);

           System.out.println( "I am Finished");
    }
}
