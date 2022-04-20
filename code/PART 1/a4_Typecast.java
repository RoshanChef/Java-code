/*
Two type of type casting in java
Type casting is useful for similar data type like Numberic , character , boolean.

 1.Automatic ( Implicitly conversion , Widening)
  This thing done By compiler automatically.
  In this process lower data type are converting into higher data type
  => " The two data types are compatible. "
    Ex..
      Byte >> short >> int >> long >> float >> double

       ^     ^ double
        \   /
         \ /
          * byte


 2.Manually ( explicit conversion , Narrowing)
   It's performed by a programmer
   In this conversion higher data types are convert into lower data type
        Ex..
   double >> float >> long >> int >> short >> Byte
  
   \ double /
    \      /
     \    /
      byte

 */

public class a4_Typecast {

    public static void main(String[] args) {
      
//   //1.  Automatic
//        short a = 1234;
//        int b = a;
//        System.out.println(b);

//        int c=1235; // give a error
//        short d=c;
//        System.out.println(b);

// // 2. Manually
//        int n = 1235;
//        short m = (short) n;
//        System.out.println(m);


    char i='A';

    int a=i;
        System.out.println("The value of A is : "+a);  

        
    }
}