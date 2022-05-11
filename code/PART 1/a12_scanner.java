import java.util.Scanner;

/* 
Scanner class 
    
    it's a final class  
    Alway take data from buffer which store all data as an charactor

    System.in 
     System it's a class 
        this varible 
         takes a data from keyboard and store into buffer

         



    methods ...
        next() //leave the cursor after the input data
        nextLine()  //leave the cursor on next line wait for enter
          // if enter is in the buffer it will take it next go to the next line 

          in short 
          next() read + delimiter (space , enter , tab)
            nextLine() delimiter ( enter )

        nextInt()
        nextDouble()
        nextFloat()
        nextBoolean
when these method stop to take a data 
   after getting  a space , enter and tab 

*/

public class a12_scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the id ... ");
        // int id = sc.nextInt();
        // System.out.println("enter the age : ");
        // Double age = sc.nextDouble();
        // String name = sc.nextLine();
        // int salary = sc.nextInt();
        // //System.out.println("Name : " + name);
        // System.out.println("id : " + id + "\nNamae:-" + name + "\nAge :-" +
        // age+"\nsalary :"+salary);

        int value=0;
        System.out.println("enter the number : ");
        if (sc.hasNextInt())
            value = sc.nextInt();

            System.out.println("Enterd value is : "+value);

        sc.close();

    }
}
