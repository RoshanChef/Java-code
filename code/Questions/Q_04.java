package Questions;
//Game of rock pepper ...
import java.util.Random;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {

        Random ra = new Random();
        Scanner sc = new Scanner(System.in);


        System.out.println("Let's play game : ");
        System.out.println("It's your turn \n0 : Rock \n1 : Seccers\n2 : Pepper \nEnter your number : ");

        int us = sc.nextInt();
        int com = ra.nextInt(3);
        System.out.println("The computer turn is : " + com);

        if (com == us) {
            System.out.println("... The Match is draw ... ");
        } else {
            switch (us) {
                case 0:
                    switch (com) {
                        case 1:
                            System.out.println("You are a winner of this round :");
                            break;
                        case 2:
                            System.out.println("You are a loss this round :");
                            break;
                    }
                    break;
                case 1:
                    switch (com) {
                        case 0:
                            System.out.println("You are a loss this round :");
                            break;
                        case 2:
                            System.out.println("You are a winner of this round :");
                            break;
                    }
                    break;
                case 2:
                    switch (com) {
                        case 0:
                            System.out.println("You are a winner of this round :");
                            break;
                        case 1:
                            System.out.println("You are a loss this round :");
                            break;
                    }
                    break;
            }

        }


    }
}