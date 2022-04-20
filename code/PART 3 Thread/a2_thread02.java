
//2.Implement a runnable interface
// in that interface only one method is present that is thread

class second implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (i <= 150) {
            System.out.println(i + " Enime's ahead...");
            i++;
        }
    }
}

class second02 implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i <= 150) {
            System.out.println(i + " Shoot the Gun");
            i++;
        }
    }
}

public class a2_thread02 {
    public static void main(String[] args) {

        second s1 = new second();
        second02 s2 = new second02();

        // // Doesn't have a thread
        // s1.run();
        // s2.run();

        /*
         * Thread class has a actual declaration of run(),start() and any other methods
         * Having a thread
         * Just pass a target object
         */
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        t1.start();
        t2.start();

   System.out.println("I am working");
    }
}
