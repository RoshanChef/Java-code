package JAVA_CONCEPT;
//writing file by using fileOutput stream
/*
    FileOutputStream class :
    IT'S Subclass of OutputStream
    it's output steam bcz we write a data into hardware file

It has a four constructor
   >> FileOutputStream(file obj)
   >> FileOutputStream(file obj,boolean append)
   >> FileOutputSteam(String as_path)
   >> FileOutputSteam(String as_path,boolean append)

Append : start writing from file flow .

Note : if you don't write a close it okay here
 */


import java.io.FileOutputStream;
import java.io.IOException;

public interface D2_File_writing {
    public static void main(String[] args) throws IOException {

        FileOutputStream fo = new FileOutputStream("./Example.txt");
        String text = "HIGH PERFOMANCE , SONU NIGAM , ARIJIT SINGH .. \nSunidhi Chauhan is RockingStar for Nice work : ";


        char ar[] = text.toCharArray();

        for (int i = 0; i < ar.length; i++) {
            fo.write(ar[i]);
        }

//        String so = "\nMere mann tera , Yeh raat yeh chandni Phir kahan\n";
//        ar = so.toCharArray();
//      //   fo.close();
//        for (int i = 0; i < ar.length; i++)
//            fo.write(ar[i]); //error just bcz after closing a file you need to open that file in RAM

//        System.out.println("code is ending now");






    }

}
