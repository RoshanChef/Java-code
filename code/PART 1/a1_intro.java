/* 

// //Naming convertion..

// //        For classes we use " PascalConvention "
// //            Ex. AddTwoNumber

// //        For fuction we use " camelCaseConvention "
// //              Ex. addTwoNumber

// // JAVA is Case Sensitive Language . int a and int A both are different in java 
// //Java token :> smallest individual and logical unit is called "tokens"
//   // ex =>  
//  "roshan bakes a tasty cookies ."
//  so every single word of sentense is a token. 
//  it is useful for understand a  sentense 

*/
/*
Types of tokens 

 1. Reserved keyword
 2. Operators 
 3. Identifier
 4. Literal
 5. Separetor

3. defined by programmer
     they are user for naming of variables , class , method , object , interfaces and packages
 * Rules of identifier
        > it can be a-z , 0-9 , $ and _ 
        > space not allowed
        > not start with digits
        > not allowed a specail charactor
        > It has any of length.

5. Separetor 
   () , [] , {} , ; , " . " : used to separete the package name from subpackage => ex... com.company
    , " , "
   */

/*

//keyword import --> used for import a class
//  ex. Scanner

//Way to print a statements
//        System.out.print("Enter the Something"); //doesn't take a line
//        System.out.println("Enter the Something"); //take a line

//        System.out.printf("Enter the Something %d",i); // C language
//        System.out.format("Enter the Something"); //doesn't take a line

//Variables 
1. Local : inside the method 
2. Instance : inside class but outside the method
3. Static
  
we can apply a access specifiers for instance variables only


*/

import java.util.Scanner;
//import keyword used for import a class like Arrays
//import packagename.classname
// You can also do that by direct give a address

public class a1_intro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enther the Number");
        int i = sc.nextInt();
        System.out.println("the Entered Number is : " + i);

        java.util.Scanner ro = new java.util.Scanner(System.in);
        System.out.print("Enter the Number : ");
        int m = ro.nextInt();
        System.out.println("your Number is : " + m);
        ro.close();
        sc.close();
    }
}