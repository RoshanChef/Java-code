/*
Both are just a reference variable ...
when object of child class is a call then the reference variable(this , super) of a function is created
this two keywords are useful only for sub-class
It's use in the subclass
you can use this keyword for methods, variable and constructor
    >>Method : override
    >>variable : for access a superclass variables
    >>

This :
It's reference variable of subclass type.
this ---> current obj

Super :
It's reference variable of superclass type.
super ---> super obj

 */

/*
//1.Method
class house {
    void furniture() {
        System.out.println("Furniture is very castly");
    }

    void kitchen() {
        System.out.println("House : 120 * 153");
    }

}

class smhome extends house {


    @Override
    void kitchen() {   // error you can't override a final class
        System.out.println("Smart home : 225 * 956");
    }

    void gellry() {
        System.out.println("It has a large gellory");
    }
    void display(){
        //use of super keyword
        super.kitchen();
    }
}
 */
/*
// 2.Variable
class subtrac {
    int no = 2000;
    int min = 560;

    void sub() {
        System.out.println("The subtraction of your number is : " + (no - min));
    }
}

class addition extends subtrac {
    int no = 1200;//override

    int add = 56;

    void sum() {
        System.out.println("The addition of your number is : " + (super.no + add));
    }
}
 */

/*
//3.constructor

class ant {
    int payment = 5600;

    ant() {
        //Try to comment this
        System.out.println("Hello,I am a ant");
    }

    ant(int a, int b) {
        System.out.println("My Total charge is : " + (a + b));
    }

    void charge() {
        System.out.println("The Charge of ant is : " + payment);
    }
}

class elephant extends ant {
    int payment = 15600;

    elephant() {
        System.out.println("Good Morning, I am elephant");
    }

    elephant(int m, int n) {
        super(m,n);
        System.out.println("Elephant : My charge is fix");
    }

    void hunger() {
        System.out.println("Hunger of a elephant is very large and that Payment is : " + payment);
    }
}
 */

/*
//This
class house {
    void wel() {
        System.out.println("Welcome to my House");
    }

    void peace() {
        System.out.println("Peaceful life .. ");
    }

//    //Constructor ..
//    house() {
//        System.out.println("Ghare chalo have");
//    }
}

class hotel extends house {
    @Override
    void wel() {
        System.out.println("welcome to My Hotel ");
    }

//    //Constructor ..
//    hotel() {
//        System.out.println("it has a Luxury Life");
//    }

    void menu() {
        System.out.println("Roti, Paneer , Pulav , Tanduri");
    }

    void welcome(){
        super.wel();
        this.wel();
    }

}
 */




public class b6_thisuper {
    public static void main(String[] args) {
        
//        smhome s1=new smhome();
//        s1.display();

//        addition a1 = new addition();
//        a1.sum();

//        elephant e1 = new elephant(788, 1000);


//        house k1 = new hotel();
//        //k1.wel();
//
//        hotel ho=new hotel();
//        ho.welcome();

        System.out.println("I am working");
    }
}
