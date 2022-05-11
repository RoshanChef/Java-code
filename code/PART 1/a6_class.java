class idea {

     int mul(int a, int b) {
        return a * b;
    }
    static int min(int a, int b){
        return a - b;
    }

}

public class a6_class {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

    //className.static members
     int value=idea.min(10, 12);
     System.out.println(value);

    //  for the instance value you need to be make an object

    }
}

