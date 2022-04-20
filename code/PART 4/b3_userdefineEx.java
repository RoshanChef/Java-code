/**
 * b3_userdefineEx
 */
import java.util.Scanner;
class under extends Exception {
    public under(String message) {
        super(message);
    }

}

public class b3_userdefineEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("It's time for a voting , Enter your age : ");
        int age = sc.nextInt();

        if (age < 18) {
            try {
                throw new under("you are not eligable");
            } catch (under un) {

                System.out.println(un.getMessage());
                System.out.println(un.toString());

            }
        }
        System.out.println("Hello I am after a Exception");

    }
}