import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        Stack<String> sck = new Stack<>();
   
        sck.push("Dog");
        sck.push("Cat");
        sck.push("Mouse");
        sck.push("Horse");

        System.out.println(sck);
        System.out.println("Stack peek : "+sck.peek());
        
        sck.pop();
        System.out.println("Stack pop : "+sck.peek());


        System.out.println(sck.empty());
        System.out.println(sck.search("Dog"));


        System.out.println("\n\n code is finished");
    }
}
