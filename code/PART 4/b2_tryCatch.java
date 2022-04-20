import java.util.Scanner;

/*
It's used for a Handling a Exception
you can also use nested try_catch
try{
when Exception is occurred  in try block then execution is stop at that line
and control goes to the catch block...
}
catch ( ExceptionName identifier){

}
 */
public class b2_tryCatch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int a = 123, b = 78;
        // System.out.println("Enter the number : ");
        // int c = o.nextInt();

        // try {
        // System.out.println("The Number "+a+" is divided by " + c + "\nThen result is
        // : " + (a / c));
        // } catch (ArithmeticException id) {
        // System.out.println("The Arithmetic Exception is occured on your input");
        //
        // }

        int arr[] = { 54, 45, 13, 23, 15, (int) 10.12 };

        try {
            System.out.println("Enter the Index of Number : ");
            int ind = sc.nextInt();
            System.out.println("The Number at that index " + arr[ind]);
            try {
                System.out.println("Enter the Index of Number : ");
                ind = sc.nextInt();
                System.out.println("The Number at that index " + arr[ind]);
            } catch (IndexOutOfBoundsException second) {
                System.out.println("It's out of bound index second... ");

            }
            try {
                System.out.println("Enter the index for dividend index");
                ind = sc.nextInt();
                System.out.println("Enter the divisor : ");
                int b = sc.nextInt();
                System.out.println("The Result is " + (arr[ind] / b));
            } catch (ArithmeticException ab) {
                System.out.println("It's " + ab);
            }
        } catch (IndexOutOfBoundsException one) {
            System.out.println("It's out of bound index first... ");

        }

    }
}
