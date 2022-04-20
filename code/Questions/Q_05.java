package Questions;

import java.util.Scanner;

public class Q_05 {
    //    static void  table(int n){
//            System.out.printf("The table of %d is : \n",n);
//        int i=1;
//        while (i<=10){
//            System.out.printf("%d  *  %d = %d\n",n,i,n*i);
//            i++;
//        }
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number for mutiply : ");
//        int mul=sc.nextInt();
//        table(mul
        System.out.println("Enter your id  : ");
        int id = sc.nextInt();
        sc.next();

        System.out.println("Enter Your Name : ");

        String n = sc.nextLine();

        System.out.println("\n\n...Your Data is... ");
        System.out.print("Your id is : " + id + "\nYour Name is : " + n + "\n");
        System.out.println("Namste India ");

    }
}
