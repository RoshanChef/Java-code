/*
 Method:
 in general method is way to perfome some task.
 used for reusability of code
         It's a function written inside the class
         It's follows DRY
         Syntax:
 
         Access_modifier return_type methon_name ( parameteres ){
             //body 
             return values;
         }




    1.    Static Datatype name( parameteres ){ //Static keyword is usrd for access method in any object
         //Here parameter is Formal argument (copy of Actual arg.)
         //Method Body
         // return type
         }

   2.  //Second way to access method
         classname obj=new classname();   //object creation
         obj.method();    // Method call by using object

    3.  When you pass Array then changes are reflect in origanal Array

*/

public class a10_method {

    // using a static Keyword..

    static int sum(int x, int y) {
    return x + y;
    }

    int mult(int a, int b) {
    return a * b;
    }
    
      static void fo() {
      System.out.println("Good Morning");
      }
      
      static void fo(int a) {
      System.out.println("Good Morning " + a);
      }
      static void fo(int a,int b) {
      System.out.println("Good Morning " + a+"\tGood Morning "+b);
      }
    

    // static void change(String arr[]) {
    // System.out.println(arr.length);
    // arr[0] = "Roshan kalmathe";
    // }

    // But you can not be change a return type
    // static int fo(int a,int b) { //It's give you an error
    // System.out.println("Good Morning " + a+"\tGood Morning "+b);

    static int change(int[] a) {
        a[3] = 101;
        return a[3];
    }

    static void pe(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // variable argument
    // Syntax :
   /*  static int sum(int a, int... arr) {
        // arr is Avalaible as array
        int add = 0;
        for (int ele : arr) {
            add += ele;
        }
        return a + add;
    } */

    // Remark :
    static String[] Network() {
        String s1[] = { "Rahuk@123", "oppo2052", "Vivo v20", "apna use ker" };
        return s1;
    }

    public static void main(String[] args) {

        // By Creating object

        // Method roshan = new Method();
        //
        // int a, b, c;
        // a = 12;
        // b = 45;
        //
        // System.out.println("The Number is : " + roshan.mult(2, 3));

        // String a[] = {"Akash", "Bhumin", "Niraj", "karina"};
        // change(a);
        //
        // System.out.println(a[0]); //see changes are reflected

        // Method Overloading :
        // Name same parameter are different
        // two or more method can have same name but have Different parameter it's
        // called Method Overloading

        /*
         * fo();
         * fo(1000);
         * fo(5000,2000);
         */

        // System.out.println(sum(1,4));
        // int n[]={98089,3212,123,466,460}; // Method get a reference
        // change(n);
        // System.out.println(n[3]);

        String s1[] = new String[4];
        s1 = Network();
        for (String ele : s1) {
            System.out.println(ele);
        }

    }
}
