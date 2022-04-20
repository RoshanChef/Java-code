/* 
Abtraction
 => Hiding a internal Details and showing a functionality

 Abstract:
 A Method without implementation
   Ex.. abstract void name( int x,int y )

If Any class include abstract Method then class itself must be declare abstract
    in this class it has minimum one abstract class
    It also has a anyother Method..

 >>If you can not do a implementation in class then you need to make that class as abstract ..

      class print{
            int i=456;
            public void name() {
            System.out.println("Hello"); }
            abstract void name( int x,int y );
     }
 "You can not make a object of abstract class. It's Give you a error"
 


*/

abstract class Num {
    int x = 4546;

    void no() {
        System.out.println(x);
    }

    abstract void na(int a, int b);
}

class Real extends Num {

    void wel() {
        System.out.println("Hello,let's Introduce to abstract");
    }

    @Override
    void na(int a, int b) {
        System.out.println(a + b);
    }
}

public class b9_abstract {
    public static void main(String[] args) {

        // Num n1=new Num(); // error

        Real n = new Real();
        // n.wel();
        // n.no();
        // n.x=2001;
        // System.out.println(n.x);

        System.out.println("I am working !!");
    }
}
