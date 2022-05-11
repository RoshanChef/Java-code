import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class input {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fin = new FileInputStream(
                "c:\\Users\\acer aspire 3\\Desktop\\OOP Code\\code\\File\\Input\\new.txt");

        int i = fin.read();
        System.out.println((char)i);

        // //2.
        // i = fin.read();
        // System.out.println((char)i);

        // i = fin.read();
        // System.out.println((char)i);
        
        // i = fin.read();
        // System.out.println((char)i);


        // //1.
        // i = fin.read();
        // System.out.println(i);

        // while (i != -1) {
        // System.out.print((char) i);
        // i = fin.read();
        // }
        // System.out.print("Junk Files");
        // fin.close();

        System.out.println("\n\n\n code is finished");
    }
}