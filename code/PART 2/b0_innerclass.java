// inner class == Nested class
/*Inner class :

class has four types
 1.static (all access modifier)
   2.non-static (all access modifier)
     3.local inner class (all access modifier)
        4.Anonymous class */

/*b
 1.static class :

 >> static inner class has a both static as well as non static members.class
 >> if we want to access member of static inner class then
        we doesn't need to create a object of a outer class
 >> if we want to access a "static member" of inner class then we can do like this
     >. outer.inner.static-variable;

 >>we can access inner class as following method
   outer.inner objj=new outer.inner();
 >>we can't access a non-static member of "outer class" in static inner class
 >> if we want to access a non-static member of static inner class then we need to create a object of inner class
*/

/*
2.non-static :

     >>non-static inner class has a only non-static member we can create a static member but it's meaning less
     >> if we want to access member of non-static inner class then
        we need to create a object of a outer class

        >>we can access inner class as following method

        outer out = new outer();
        outer.inner ref=out.new inner();

    >>we can access a non-static and static member of outer class in non=static inner class

*/

// 3.local inner class :
//
// if we define a class inside the method or scope then a cldss call as ...

class outer {
    int id;
    String name = "roshan chhotubhai kalmathe";
    static int member;

    static class inner {

        static int no;
        String add;

        void set() {
            add = "B- ,Giriraj Residecy, Victoria Heights,\nNear Dhernidher bunglow";
            // System.out.println(name); //error
            System.out.println(member);
        }
    }

}

class school {
    static int std = 9;
    static String uniform = "Happy Day";

    class student {
        static int nosub = 5;
        String namesub = "DATA STUCTURE";

        @Override
        public String toString() {
            return "std is : " + std + "\nuniform is : " + uniform;
        }

    }
}

public class b0_innerclass {
    public static void main(String[] args) {

        outer.inner in = new outer.inner();
        in.set();
        // System.out.println(in.add);

        //
        // eroor just because of it's non-static
        // outer.inner.add="B-206, Maruti pal at near to the nabyug school at parth
        // bunglow";
        // System.out.println(outer.inner.add);

        // outer.inner.no = 303;
        // System.out.println("The Number is : "+outer.inner.no);

        // school.uniform = "Green";
        // System.out.println(school.uniform);

        // school sch = new school();
        // // create a object of inner class
        // school.student raman = sch.new student();

        // System.out.println(raman);
        // System.out.println(school.student.nosub);
        // System.out.println(raman.namesub);

        System.out.println("code is finished");

    }
}
