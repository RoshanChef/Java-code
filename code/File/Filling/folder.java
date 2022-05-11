import java.io.File;

public class folder
 {
    public static void main(String[] args){
    
        File f= new File("c:\\Users\\acer aspire 3\\Desktop\\OOP Code\\code\\File\\Filling\\Folder");
    
        if(f.exists()==false)
        f.mkdir();
        else
        System.out.println("not possible");
    
    
    System.out.println("\n\n\n code is finished");
     }
}
