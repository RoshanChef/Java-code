import java.util.Scanner;

/* 

Definition: 
    An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.
 types of exceptions

 When an error occurs within a method, the method creates an object and hands it off to the runtime system. The object, called an exception object,
 
 1. unchecked exceptions
     which is not identify by compiler 
     it will extends from runtime exception class

   example ..
     arithmetic exception
     index out of bound exceptions


 2. checked exceptions 
    checked exceptions which is checked at compile time
    it will be extends from exception class 

    example ..
     IO exception
   
//stack trace 

  what ever exception shown in the terminal it known as stack trace 
  it has two method 1.getMessage 2.stackTracePrint
  1.give a what is the error
  2.give a line number 

*/
public class b_exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        // stack trace
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at b_exception.main(b_exception.java:44)

        // System.out.println("the result is : " + (a / b));

        A(a, b);

    }

    private static void A(int a, int b) {
         B(a, b);
    }
    
    private static void B(int a, int b) {
         C(a, b);
    }
    
    private static void C(int a, int b) {
        System.out.println(a/b);
    }
    
/* 
stack trace
exceptions : 
 line 63
 line 59
 line 55
 line 50

*/

}
