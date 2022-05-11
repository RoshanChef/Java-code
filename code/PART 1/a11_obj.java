
class phone {
    void call() {
        System.out.println("simple call");
    }

    void youtube() {
        System.out.println("not available");
    }

    int a = 2001;

}

class smart extends phone {
    static  int a = 101;

    @Override
    void call() {
        a = 501;
        System.out.println("video call ");
    }

    void youtube() {
        System.out.println("play a music on it .. ");
    }
}

public class a11_obj {
    public static void main(String[] args) {

        phone obj = new smart();
        obj.call();
        System.out.println(obj.a);

        smart o = new smart();
        System.out.println("The value is : " + o.a);

        System.out.println("\n\n\ncode is finished");

    }
}
