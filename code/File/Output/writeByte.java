import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeByte {
    public static void main(String[] args) {

        File f = new File("C:\\Users\\acer aspire 3\\Desktop\\OOP Code\\code\\File\\Output\\byte.txt");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(f);

            String str = "I want to be 5 star coder at codeChef";

            fos.write(str.getBytes());
            fos.flush();

        } catch (FileNotFoundException e) {
            System.out.println("Exception is : ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Exception is : ");
            e.printStackTrace();
        }

        finally {

            try {
                if (fos != null)
                    fos.close();
            } catch (Exception e) {

            }

            System.out.println("i am in finally");
        }

        System.out.println("\n\n\n code is finished");
    }
}
