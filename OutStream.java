package BasicJava;
import java.io.*;

import java.io.IOException;

public class OutStream {

    public static void main(String [] args) throws IOException{

        File file = new File("C:\\Users\\Rakib\\Desktop\\IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char [] a = new char[12050];
        fr.read(a);   // reads the content to the array

        for(char c : a)
            System.out.print(c);   // prints the characters one by one
        fr.close();
    }
}
