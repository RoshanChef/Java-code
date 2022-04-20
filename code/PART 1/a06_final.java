/*
Final keyword :

    " Every " final variables are By default blank
    There 2 way of initialize a final variable
    you can't create a final type constructor


    you can use as a final
    ...
         >> instance var
         >> static var
         >> local var
         >> Method
         >> Class

      final var's value are can't be re-assign
      When declare as a method it can't override
      When declare as a class it can't extends


Initialization block :
  you can create a multiple Initialization block
  it's execute when a object is declared
  when object created all initializer pass to the default constructor and set it into a first line
  return keyword is not used with it.

 syntax :
   1.static Initialization block : static{  only static members are allowed  }
   2.simple Initialization block :  { instance members are allowed  }
 */

final class unknown {
    void name() {
        System.out.println("Indiain Army has great solder");
        int i = 9879;
    }
}

// class known extends unknown{ // Error >> you can't extends a final class
// void ninja(){
// System.out.println("I am now a hathodi");
// }
// }
// final static int v; // error
// for initialize you can use a initializer block

class flat {

    void furniture() {
        System.out.println("Furniture is very castly");
    }

    final void kitchen() {
        System.out.println("120 * 153");
    }

}

class apartment extends flat {

    // void kitchen() { // error you can't override a final method
    // System.out.println("225 * 956");
    // }

    void gellry() {
        System.out.println("It has a large gellory");
    }
}

public class a06_final {

    final static int m;

    static {
        m = 972;
        System.out.println("Static valiue is : " + m);
    }

    final int x;

    {
        x = 879;
        System.out.println(x);

    }

    static {
        System.out.println("Hello I am initializer");
    }

    public static void main(String[] args) {

        // System.out.println(m);
        // FInal a1=new FInal();

        // final int i = 456;
        // // i=10022; //error
        // System.out.println(i);


    

    }
}
