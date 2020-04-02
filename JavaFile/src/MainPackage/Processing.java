package MainPackage;


import Calculation.MultipleLinearRegression;
import Methods.PrintInfo;
import ObjectOriented.BookData;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;
public class Processing {
    int x = 0;
     static   int numOfBook;
     BookData [] bookData = new BookData[1050];

  DataParsing dataParsing = new DataParsing();
  PrintInfo printInfo = new PrintInfo();
  //  Searching searching = new Searching();
  //  RankShow rankShow = new RankShow();
    MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();


    public void fileReader()  throws IOException{

        File file = new File("IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char[] a = new char[120500];
        fr.read(a);


        // reads the content to the array
        String  bookName[] = new String[1050];
        String writerName[] = new String[1050];
        String bookId[] = new String[1050];


        String borrowCount[] = new String[1050];

        String bookPrice[] = new String[1050];



        bookName[x] = "\0";
        writerName[x] = "\0";
        bookId[x] = "\0";
        borrowCount[x] = "\0";
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

                /*String string = bookName[x];
                string=string.replace(" ","");
                bookName[x] = string;*/
                int n = bookName[x].length();
bookName[x] = bookName[x].substring(1,n);

                int m = writerName[x].length();
                writerName[x] = writerName[x].substring(1,m);

                int p = bookId[x].length();
                bookId[x] = bookId[x].substring(1,p);

                bookData[x] = new BookData(  bookName[x],  writerName[x],
         bookId[x],   borrowCount[x],
           bookPrice[x],0.00);


                x++;
                bookName[x] = "\0";
                writerName[x] = "\0";
                bookId[x] = "\0";

                borrowCount[x] = "\0";
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

 numOfBook= x;

int p= getNumber();
double weight1[] = new double[1050];


       // rankShow.showCase(bookData,numOfBook);
        //searching.search(bookData,numOfBook);
       // printInfo.printAll(bookData,numOfBook);

        dataParsing.dataParsingMethods(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
    }
    public int getNumber(){
        return  x ;
    }


}