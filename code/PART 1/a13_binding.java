/*
Binding has a two types 
    1. static binding
    2. dynamic binding
 */
public class a13_binding {

    static void print() {
        System.out.println("i am in super class");
    }

    void hello() {
        System.out.println("i am in super class");
    }

    public static void main(String[] args) {

        // // static binging
        // a13_binding a = new a13_binding();
        // a13_binding b = new sub();

        // a.print();
        // b.print();

        // dynamic binding
        a13_binding a = new a13_binding();
        a13_binding b = new suprime();

        a.hello();
        b.hello();

        System.out.println("\n\n\n code is finished");
    }
}

class sub extends a13_binding {

    // method hiding is happen here !! >> bcoz of static(early) binding happen on
    // run time
    static void print() {
        System.out.println("i am in sub class");
    }

}

class suprime extends a13_binding {

    // over riding is happen >> bcoz of dynamic binding happens on run time ..
    void hello() {
        System.out.println("i am in sub class");
    }
}
