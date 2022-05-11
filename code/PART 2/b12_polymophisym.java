
/*
perfom one task with different ways .. polymorphism 
1.compiletime poly (overloading)
2. runtime poly (overriding)
 */

 class parent {
   void print(){
     System.out.println("Hello Parent ! ");
   }
 }
 class child extends parent {
   void print(){
     System.out.println("Hello My dear Child !! ");
   }
 }

public class b12_polymophisym {

  static int sum(int a, int b) {
    return a + b;
  }

  static double sum(Double a, Double b) {
    return a + b;
  }

  public static void main(String[] args) {

    

    System.out.print(sum(5, 3));

    System.out.println("\n\n\n code is finished");
  }
}