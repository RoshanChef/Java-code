import java.io.File;

public class exist {
    public static void main(String[] args){
    File fl = new File("c:\\Users\\acer aspire 3\\Desktop\\OOP Code\\code\\File\\new.txt");
  if(fl.exists() == false)
  fl.mkdirs();
  else
  System.out.println("it's not possible");
    
    System.out.println("\n\n\n code is finished");
     }
}
