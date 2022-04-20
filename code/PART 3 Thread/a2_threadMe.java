
class th01 extends Thread {

    th01(String na) {
        super(na);
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Hello Good Morning");
        }
    }

}

class A1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                if (i == 20) {
                    System.out.println("i am on sleep ");
                    sleep(15000);
                    System.out.println("i am wake Up now ... ");
                }

            } catch (Exception e) {
                System.out.println("sleep is not working .. ");
            }
            System.out.println("Hello Elon Musk .. A1 " + i);
        }
    }
}

class A2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Sonu Nigam .. " + i);
        }
    }

}

class v1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            if (i == 20) {
                stop();
            }

            System.out.println("Ronaldo Football  .. " + i);
        }
    }

}

class v2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i == 8) {
                stop();
            }
            System.out.println("Lata Mangeshwer ...... " + i);
        }
    }

}

public class a2_threadMe {
    public static void main(String[] args) {
        // th01 t1 = new th01("Sonu Nigam");
        // th01 t2 = new th01("Roshan Kalmathe");
        // th01 t3 = new th01("Dhara Kalmathe");
        //
        // System.out.println(t1.getName());
        // System.out.println(t1.getId());
        // System.out.println(t2.getName());
        // System.out.println(t2.getId());
        //
        // System.out.println("Good Morning");
        //
        // System.out.println(t3.getName());
        // System.out.println(t3.getId());

        // A1 elon = new A1();
        // A2 sonu = new A2();

        v1 ronal = new v1();
        v2 lata = new v2();
        ronal.start();
        lata.start();

        System.out.println("I am working");
    }
}
