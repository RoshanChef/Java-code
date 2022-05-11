import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeInt {
    public static void main(String[] args) throws FileNotFoundException , IOException{
    
        FileOutputStream fos = new FileOutputStream("C:\\Users\\acer aspire 3\\Desktop\\OOP Code\\code\\File\\Output\\text.txt");
    
        fos.write(97);
        fos.write(97);
        fos.write(97);
    

        fos.close();
    
    
    
    System.out.println("\n\n\n code is finished");
     }
}
