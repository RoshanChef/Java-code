import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        // int[] a = {2,5,7,8,9,13,20,24};

        // int index = Arrays.binarySearch(a, 9);
        // System.out.println("index is : "+index);

        Integer arr[] = { 5, 2, 6, 79, 81, 47 };
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println();

        Arrays.fill(arr, 21);

        for (int i : arr) {
            System.out.print(i+" ");
        }

        System.out.println("\n\n code is finished");
    }

}
