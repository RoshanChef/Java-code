import java.util.Scanner;

public class b1_error {
    public static void main(String[] args) {

        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // // LOGICAL ERROR DEMO
        // // Write a program to print all prime numbers between 1 to 10
        // System.out.println(2);
        // for (int i=1; i<5; i++){
        // System.out.println(2*i+1);
        // }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        // if you give a 0 Number then is give as ArithmeticException
        k = sc.nextInt();
        System.out.println("Integer 1000 is divided by k is : " + 1000 / k);

        System.out.println("I am working");
    }
}
