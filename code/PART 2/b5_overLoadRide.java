/*
Methoid Overloading : 
  =>If a class has multiple methods having a "same name" but different in parameter 
        it's known as ...
 
        two way to overload a methods 
        1. By changing a numbers of parameters
        2. By changing a data type

Method OverRiding
  =>If a child-class has the same method as declared in the parent class
   It's known as ...
  
    rules 
    child-class's method must have 
        same name
        same parameters  as parent

//must play with construcors
*/
class vehicle{
    void run(){
        System.out.println("Vehicle is Running");
    }

}
class car extends vehicle{
    void run(){
        System.out.println("Car is Running very safely");
    }
}

public class b5_overLoadRide {
    // 1. changing a parameters
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //2. chinging a data type
    static int add(int a,int b){
        return a+b;
    }
    static double add(double a, double b, double c ){
        return a+b+c;
    }
    public static void main(String[] args) {

   vehicle v= new vehicle();
   v.run();


        System.out.println("I am working");
    }
}
