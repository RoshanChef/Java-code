package JAVA_CONCEPT;

import java.io.FileInputStream;
import java.io.IOException;

public class D3_File_Input {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream(".\\memes.txt");

        int i = 0;
        do {
            i = fi.read();
            if (i != -1)
                System.out.print((char) i);
        } while (i != -1);


    }
}
