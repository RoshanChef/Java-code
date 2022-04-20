/*
//1.
interface camera{
    void image();
    void videorec();
}
interface speaker{
    void music();
}

////create a one class by using multiple interface.
//  //1.
//  class  mobile implements camera,speaker{
//
//    @Override
//    public void image() {
//        System.out.println("Take Photo");
//    }
//
//    @Override
//    public void videorec() {
//        System.out.println("Record Video");
//    }
//
//    @Override
//    public void music() {
//        System.out.println("Play Music");
//    }
//}
 */

/*
//2..create a one class by using multiple interface.

interface parent {
    void math1();

    void math2();
}
interface chlid extends parent {
    void math3();
    void math4();
}

interface  grandch extends chlid{
    void marh5();
    void marh6();
}
class sample1 implements chlid {

    @Override
    public void math1() {
        System.out.println("I am Math 1");
    }

    @Override
    public void math2() {
        System.out.println("I am Math 2");
    }

    @Override
    public void math3() {
        System.out.println("I am Math 3");
    }

    @Override
    public void math4() {
        System.out.println("I am Math 4");
    }
}

class sample2 implements grandch{

    @Override
    public void math1() {
        System.out.println("I am Math 1 sample 2");
    }

    @Override
    public void math2() {
        System.out.println("I am Math 2 sample 2");
    }

    @Override
    public void math3() {
        System.out.println("I am Math 3 sample 2");
    }

    @Override
    public void math4() {
        System.out.println("I am Math 4 sample 2");
    }

    @Override
    public void marh5() {
        System.out.println("I am Math 5 sample 2");
    }

    @Override
    public void marh6() {
        System.out.println("I am Math 6 sample 2");
    }
}
*/
//Remark ::
//class n implements num{
//    //    public void wh() { //error bcoz implementation
////        System.out.println("It's Whole Number");
////    }
//    @Override
//    public void re() {
//        System.out.println("It's Real Number");
//    }
//}

// 3.
interface chat {
    int c = 100;

    void gread();

    void behavior();
}

class whatsup implements chat {

    @Override
    public void gread() {
        System.out.println("Hello, Good Morning");
    }

    @Override
    public void behavior() {
        System.out.println("I am feel alone");
    }
}

public class b11_interface
{

    public static void main(String[] args) {
   System.out.println("I am working");
    }
}
