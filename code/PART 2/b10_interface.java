/*
     Interface :
     It's same as abstract class but Here we have use a " interface " keyword
     In the interface every members are  BY Default " pubic ".
        >> That's why when we implement a interface then method of interfaces we use public access modifier.
  >> you can also create a one class by using multiple interface.
     In the interface every Method is a Abstract Method
     when you make a class by using interface it's necessary to implement all the Methods of interface.
      >> In that case we use " implements " keyword.
Remark :
     We can't make a interface object...
     interfaces can be extends 
     interface can't implement another interface ,only classes can do that..

     class    interface     class
       |         |            |
    extends    extends    implements
       |         |            |
     class    interface    interface
 */

interface cellphone {
    int c = 10;

    void call();

    void time();

}

class phone implements cellphone {


    void wel() {
        System.out.println("I am a Phone");
    }

    @Override
    public void call() {
        System.out.println("Call is Connecting...");
    }

    @Override
    public void time() {
        System.out.println("Time is : 8:30");
    }
}








public class b10_interface {
    public static void main(String[] args) {

        // cellphone c1=new cellphone(); //error

        cellphone c1=new phone(); 
System.out.println(c1.c);

        phone sm = new phone();
        sm.call();
        sm.time();
        sm.wel();
        System.out.println(sm.c);

 System.out.println("code is finished"); 

    }
}
