package Questions;

import java.util.Scanner;

public class Q_02 {

    static void pattern(int a) {
        System.out.println("Your pattern is : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner ro = new Scanner(System.in);
        System.out.println("Enter the number of a row");
        int n = ro.nextInt();
        pattern(n);
    }
}
