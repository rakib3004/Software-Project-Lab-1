
//main class


package IOStream;

import java.io.*;

import java.io.IOException;

public class OutStream {


    public static void main(String [] args) throws IOException{
Processing processing = new Processing();
processing.fileReader();
    }
}


//processing class


import java.io.File;
import java.io.FileReader;
import java.io.*;

import java.io.IOException;
public class Processing {

    public void fileReader()  throws IOException{


        File file = new File("C:\\Users\\Rakib\\Desktop\\IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char[] a = new char[12050];
        fr.read(a);
        // reads the content to the array

        String  bookName[] = new String[1050];
        String writerName[] = new String[1050];
        String bookId[] = new String[1050];

        String bookType[] = new String[1050];
        String priority[] = new String[1050];

        String borrowCount[] = new String[1050];

        String monthCount[] = new String[1050];
        String bookPrice[] = new String[1050];


        int x = 0;
        bookName[x] = "\0";
        writerName[x] = "\0";
        bookId[x] = "\0";
        bookType[x] = "\0";
        priority[x] = "\0";
        borrowCount[x] = "\0";
        monthCount[x] = "\0";
        bookPrice[x] = "\0";

        int t = 0;
        for (int i = 0; a[i] != '\0'; i++) {
            if (a[i] == '\t') {
                i++;
                t++;
                t = t % 8;
            }
            if (a[i] == '\n') {
                i++;
                t++;

                t = t % 8;

                System.out.println(bookName[x]);
                System.out.println(writerName[x]);
                System.out.println(bookId[x]);
                System.out.println(bookType[x]);
                System.out.println(priority[x]);
                System.out.println(borrowCount[x]);
                System.out.println(monthCount[x]);
                System.out.println();

                System.out.println(bookPrice[x]);
                System.out.println();
                x++;
                bookName[x] = "\0";
                writerName[x] = "\0";
                bookId[x] = "\0";
                bookType[x] = "\0";
                priority[x] = "\0";
                borrowCount[x] = "\0";
                monthCount[x] = "\0";
                bookPrice[x] = "\0";

            }
            if (t == 0) {

                bookName[x] = bookName[x] + a[i];
            } else if (t == 1) {
                writerName[x] = writerName[x] + a[i];

            } else if (t == 2) {
                bookId[x] = bookId[x] + a[i];

            } else if (t == 3) {
                bookType[x] = bookType[x] + a[i];

            } else if (t == 4) {
                priority[x] = priority[x] + a[i];

            } else if (t == 5) {
                borrowCount[x] = borrowCount[x] + a[i];

            } else if (t == 6) {
                monthCount[x] = monthCount[x] + a[i];
            }else if(t==7){
                bookPrice[x]=bookPrice[x]+a[i];
            }



        }

        fr.close();


        System.out.println();

        //   for(int s : monthCount2)
        //   System.out.println(s);
       printAll(bookName,writerName,bookId,priority,bookType,monthCount,borrowCount,bookPrice);
    }

    public void printAll(String[] bookName,String[] writerName,String[] bookId,String[] priority,String[] bookType,String[] monthCount,String[] borrowCount,String[] bookPrice){
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
            System.out.println(priority[j]);

        }
        for (int j = 0; j < 50; j++) {
            System.out.println(bookType[j]);

        }
        for (int j = 0; j < 50; j++) {
            System.out.println(monthCount[j]);

        }
        for (int j = 0; j < 50; j++) {
            System.out.println(borrowCount[j]);

        }  for (int j = 0; j < 50; j++) {
            System.out.println(bookPrice[j]);

        }
    }
}

// Analytic class

public class Analytic {
    Processing processing = new Processing();

int weight [] = new int[1050];
int typeValue [] =new int[1050];
int timeCount [] = new int[1050];
int bookCount [] = new int [1050];
int queueValue [] = new int [1050];
int bookPrice [] =new int[1050];



int bookPriority [] = new int[1050];
int writePriority [] = new int[1050];
int timePriority [] = new int [1050];
int borrowCount [] = new int [1050];
int serialPriority [] = new int[1050];
int pricePriority [] = new int [1050];


}
