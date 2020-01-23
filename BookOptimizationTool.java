package BasicJava;

import java.io.*;
import java.util.Scanner;

public class InStream {

    public static void main(String[] args) throws IOException {

        int input_number ;
        String space;
        System.out.println("How many number of books you want to input : ");

        Scanner scan = new Scanner(System.in);
        input_number = scan.nextInt();
        space  = scan.nextLine();

        int iteration;
        String bookName,writerName,bookID, bookPrice;
        String bookInfo;
        File file = new File("C:\\Users\\Rakib\\Desktop\\input.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("bookName\twriterName\tbookID\tbookPrice\n");
       fileWriter.flush();
       // fileWriter.close();
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for(iteration=0;iteration<input_number;iteration++){

          // fileWriter.append((CharSequence) file);
            System.out.println("Book Name : ");
            bookName  = scan.nextLine();

            System.out.println("Writer Name : ");
            writerName = scan.nextLine();

            System.out.println("Book ID : ");
            bookID = scan.nextLine();

            System.out.println("Book Price : ");
            bookPrice = scan.nextLine();

            bookInfo = bookName+"\t"+writerName+"\t"+bookID+"\t"+bookPrice+"\n";
bufferedWriter.write(bookInfo);
//bufferedWriter.close();
           // fileWriter.write(bookInfo);
           // fileWriter.flush();
           // fileWriter.close();
        }

bufferedWriter.close();
         fileWriter.close();




        FileReader fr = new FileReader(file);
        char [] a = new char[950];
        fr.read(a);   // reads the content to the array

        for(char c : a)
            System.out.print(c);   // prints the characters one by one
        fr.close();

    }
}
