//class mythread extends Thread {
//    mythread(String na) {
//        super(na);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("My name is : Roshan Kalmathe what's your namr ? ");
//    }

class impe implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Good Morning " + (i + 1));
        }

    }
}

class impe2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Good Night" + (i + 1));
        }

    }
}

public class a3_threadcon {
    public static void main(String[] args) {
       
        // mythread m1 = new mythread("High heel pe nacha");
        // System.out.println(m1.getName());
        //
        // mythread m2 = new mythread("Paheli phursat main nikal");
        // System.out.println(m2.getName());

        // impe i1 = new impe();
        // Thread th1 = new Thread(i1);
        //
        // th1.start();
        //
        // impe2 i2 = new impe2();
        // Thread th2 = new Thread(i2);
        // th2.start();
        
    }
}
