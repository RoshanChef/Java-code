/*
It's Similar to dynamic Method dispatch
Remark :

  // reference var = object
  You can access all reference Member not object Member..
 */
interface cemara {
    void click();
    void record();
}

interface wi_fi {
    String[] name();
}

interface music {
    void play();
}

class smart01 implements wi_fi, music, cemara {


    @Override
    public void click() {
        System.out.println("Take a photo");
    }

    @Override
    public void record() {
        System.out.println("Record a video");
    }

    @Override
    public String[] name() {
        String a[] = {"Rahul@138", "Apna_use_ker", "Alone#32", "Danger47", "Ak56"};
        return a;
    }

    @Override
    public void play() {
        System.out.println("Play music \"Rock on\"");
    }

    public void Whatsup() {
        System.out.println("Chat with me My friend");
    }
}

public class b12_polymophisym {
    public static void main(String[] args) {
        
        smart01 s1 = new smart01();
        s1.Whatsup();
        String[] wifi = s1.name();
        for (String ele : wifi) {
            System.out.print(ele + " ");
        }

        System.out.println();
        cemara nikon = new smart01();
        nikon.record();
        nikon.click();
//      nikon.whatsup(); //error
     System.out.println("code is finished");
    }
}
