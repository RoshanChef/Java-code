/**
 * static and Instance
 * Both give us by default value
 * => Static :
 * Static keyword is " common fridge shares between multiple objecets "
 * JVM find first static member and allocate them a memory
 * After jvm search for main method
 * It's take a memory after running a class loader
 * static variable take memory only once at whole class
 * 
 * static blocks
 * ex .. static {
 * }
 * 
 * => We can apply java static keyword with variables, methods, blocks and
 * nested class.
 * 
 * Instance :
 * It's doesn't take a memory without declare a object
 * It's like a individual fridge
 * it's take independent memory at every object
 * 
 * Local Varable are scopable
 * it's mean when you create local variable it's need a initialize a value by
 * defult it has a blank that's why it give us a error
 * 
 */
public class a5_static {
    static int i = 2001;

    int b = 3006;

    public static void main(String[] args) {

        // System.out.println(i); //you can access a variable without declare a object
        // System.out.println(b); // it's give a error because of object

        System.out.println("pizza party today 😀");


        
    }
}