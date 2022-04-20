import java.util.Arrays;

public class a11_ArraysMethod {
    public static void main(String[] args) {

        int[] a = { 10, 38, 48, 69, 299, 498, 8, 25, 65, 999 };
        
         System.out.println("before");
        for (int element : a) {
            System.out.print(element+" ");
        }
 
        Arrays.sort(a);
  
        System.out.println("\nAfter sorting the Array");

        for (int i : a) {
            System.out.print(i+" ");
        }


    }
}
