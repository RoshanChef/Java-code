/* 
  example :
  work 1: cooking
  work 2: chatting
  
Parallelism :
   when two work are done at same time
   that means cooking and chatting done at a same time..


Concurrency :
   One work done at a same time
   that means At a time you can do either cooking or chatting..
   Thread follow a " Concurrency "

Thread :
   It's useful when two work are independent from each other..
   both work are done by concurrently..
    Example..
        >> operating system and processor

There are two way to create a thread ..
        1.Implement a thread interface..
        2.Extending to thread class..
 
*/

class cook extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i + " Hello ,I am Frying a carri");
            i++;
        }

    }
}

class chatting extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i + " Hello ,I am chatting with Her");
            i++;
        }

    }
}


public class a1_thread {
    public static void main(String[] args) {
        cook ck = new cook();
        chatting cha = new chatting();
        ck.start();
        cha.start();
       
        System.out.println("I am woriking");
    }
}
