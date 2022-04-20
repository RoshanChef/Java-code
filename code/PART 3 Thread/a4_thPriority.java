class mor extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 160; i++) {
            System.out.println("Good Morning " + i);
        }
    }
}

class night extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 160; i++) {
            System.out.println("Good Night ** " + i);
        }
    }
}

public class a4_thPriority {
    public static void main(String[] args) {
        mor m1 = new mor();
        night m2 = new night();

        m1.start();
        m2.start();

        System.out.println("I am working");

    }
}