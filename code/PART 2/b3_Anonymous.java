/*
A class which doesn't has a name and we can create a object of that class at time it known as anonymous class
>> ano class must be has a subclass and innerclass
 syntax :

   parentclass objj=new parentclass(){  it doesn't has name that's why we create a reference var of parentclass ..
    \\ A ref is parent that's why ,
        if you want to perform anything of anno class you need to override a method of a parent class
        };
 >. if you want access a ann class you need create a object of outer class
 only one obj. is possible for ano class  if you create a different obj then it is a another ano class
*/

class parent {
    void money() {
        System.out.println("i have a milion of dolor ");
    }

    void car() {
        System.out.println("I have a Tesla ");
    }
}

class child {

    void increase() {
        System.out.println("Increase a skill .");
    }

    parent sub = new parent() {
        @Override
        void money() {
            System.out.println("Increase a bussiness of my father.And earn more money worth of trillion dolor ");
        }

    };

}

public class b3_Anonymous {
    public static void main(String[] args) {
        child ch = new child();
        ch.sub.car(); // parent class car
        ch.sub.money(); // override method
 
        System.out.println("I am working");

    }
}
