package Questions;

import java.util.Scanner;
//Average of number
public class Q_01 {
    static float user() {
        Scanner ro = new Scanner(System.in);
        System.out.print("Enter a Number of subject : ");

        int n = ro.nextInt();

        float marks[] = new float[n];
        float sum = 0;

        // Take a number from user ... and do sum ..
        System.out.println("Enter the Marks of subject");
        for (int i = 0; i < n; i++) {
            marks[i] = ro.nextFloat();
            sum += marks[i];
        }

        return sum / n;
    }

    public static void main(String[] args) {
        float ave = user();
        System.out.println("The average of your number is : "+ave);

    }
}
