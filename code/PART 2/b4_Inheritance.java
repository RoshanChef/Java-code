/*
When one object acquires all the properties and behaviours of parent object is known as inheritance.
Inheritance :

  it's used to Borrow properties & Method from an existing class
  When we declare a second class we use " extends " Keyword.
  second class ma first class no data use keri shakay.

  Example..
  Phone >> Smartphone
  Vehicle >> Car , bike ,bicycle
  Animal >> Cat ,dog ,cow
=> you can not create a one class by using inherite a multiple classes.




*/

/*
class phone {
    boolean music = true;
    boolean call = true;
    boolean masseage = true;
    boolean time = true;
}
class smartphone extends phone {

    void in() {
        System.out.println("you can access a internet");
    }

    void im() {
        System.out.println("you can click photo from it");
    }

    void vc() {
        System.out.println("you can do a video call ");
    }

}
*/


/*


class phonev1 {
    void call() {
        System.out.println("Calling......");
    }
}

class smartph extends phonev1 {
    void wifi() {
        System.out.println("Connecting....");
    }

    protected void fly() {
        System.out.println("Flying phone");
    }
}

class smart extends phonev1 {

    public void click() {
        System.out.println("Click the photo");
    }
}

class smart02 extends smartph {
    void Game() {
        System.out.println("Gaming phone WOW ! ..");
    }
}

*/

public class b4_Inheritance {
    public static void main(String[] args) {
   
        // smart02 o = new smart02();
        // o.call();
        // o.fly();
        // o.Game();
        
        System.out.println("I am finished");

    }
}
