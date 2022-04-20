package Questions;

import java.util.Scanner;

public class testing {

    int sum(int a, int b){
        return  a+b;
    }



    public static void main(String[] args) {
        testing t=new testing();
        Scanner s=new Scanner( System.in);


        int n = s.nextInt();
       int m=s.nextInt();

       int c=t.sum(n,m);
        System.out.println("the sum is : "+c);



    }
}
