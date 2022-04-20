// reference var = object
//  You can access all reference Member not object Member..

//Remark ::
// but When methods are override then child class has a first  preference

class phone0 {
    void on() {
        System.out.println("My name is : Phone Turn on...");
    }

    void call() {
        System.out.println("calling ... .. ");
    }

    void text() {
        System.out.println("I am able to do text message");
    }
}

class smart0 extends phone0 {
    @Override
    void on() {
        System.out.println("My name is : Smartphone Turn on...");
    }

    void wel() {
        System.out.println("Welcome java..");
    }
}

public class b8_Dynamin_dispatch {

    public static void main(String[] args) {

        phone0 sup = new smart0(); // allowed
        // smart0 sub=new phone0();//Not allowed
        // sup.wel();//error
        // sup.wel(); // error bcoz remark
        sup.on();
        sup.text();
        sup.call();

        System.out.println("Hello");
    }
}