package IOStream;

import java.io.File;
import java.io.FileReader;
import java.io.*;

import java.io.IOException;
public class Processing {
    BookData bookData [] = new BookData[1050];

Analytic analytic = new Analytic();

    public void fileReader()  throws IOException{

        File file = new File("IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char[] a = new char[120500];
        fr.read(a);
        // reads the content to the array

        String  bookName[] = new String[1050];
        String writerName[] = new String[1050];
        String bookId[] = new String[1050];

       // String bookType[] = new String[1050];
      //  String priority[] = new String[1050];

        String borrowCount[] = new String[1050];

      //  String monthCount[] = new String[1050];
        String bookPrice[] = new String[1050];
   ArrayList arrayList = new ArrayList();
 //  arrayList.array();

        int x = 0;
        bookName[x] = "\0";
        writerName[x] = "\0";
        bookId[x] = "\0";
       // bookType[x] = "\0";
     //   priority[x] = "\0";
        borrowCount[x] = "\0";
     //   monthCount[x] = "\0";
        bookPrice[x] = "\0";

        int t = 0;
        for (int i = 0; a[i] != '\0'; i++) {
            if (a[i] == '\t') {
                i++;
                t++;
                t = t % 5;
            }
            if (a[i] == '\n') {
                i++;
                t++;

                t = t % 5;
 bookData[x] = new BookData(  bookName[x],  writerName[x],
         bookId[x],   borrowCount[x],
           bookPrice[x],0.00);

            /*    System.out.println(bookName[x]);
                System.out.println(writerName[x]);
                System.out.println(bookId[x]);
                System.out.println(bookType[x]);
                System.out.println(priority[x]);
                System.out.println(borrowCount[x]);
                System.out.println(monthCount[x]);
                System.out.println();

                System.out.println(bookPrice[x]);
                System.out.println();*/
                x++;
                bookName[x] = "\0";
                writerName[x] = "\0";
                bookId[x] = "\0";
               // bookType[x] = "\0";
             //   priority[x] = "\0";
                borrowCount[x] = "\0";
           //     monthCount[x] = "\0";
                bookPrice[x] = "\0";

            }
            if (t == 0) {

                bookName[x] = bookName[x] + a[i];
            } else if (t == 1) {
                writerName[x] = writerName[x] + a[i];

            } else if (t == 2) {
                bookId[x] = bookId[x] + a[i];


            } else if (t == 3) {
                borrowCount[x] = borrowCount[x] + a[i];

            }
            else if(t==4){
                bookPrice[x]=bookPrice[x]+a[i];
            }
        }
        fr.close();

      //  System.out.println();



        analytic.analysis(bookData,writerName,borrowCount,bookPrice,bookId);
     //  printAll(bookName,writerName,bookId,borrowCount,bookPrice);
    }

    public void printAll(String[] bookName,String[] writerName,String[] bookId,
                        String[] borrowCount,String[] bookPrice){
        for (int j = 0; j < 50; j++) {
            System.out.println(bookName[j]);
        }
        for (int j = 0; j < 50; j++) {
            System.out.println(writerName[j]);
        }
        for (int j = 0; j < 50; j++) {
            System.out.println(bookId[j]);
        }

        for (int j = 0; j < 50; j++) {
            System.out.println(borrowCount[j]);

        }  for (int j = 0; j < 50; j++) {
            System.out.println(bookPrice[j]);

        }
    }
}
