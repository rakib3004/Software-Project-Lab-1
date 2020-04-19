package MainPackage;


import Calculation.MultipleLinearRegression;
import Methods.PrintInfo;
import ObjectOriented.BookData;
import ObjectOriented.PriorityData;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;
public class Processing {
        int numOfBook;
     BookData [] bookData = new BookData[1050];

  DataParsing dataParsing = new DataParsing();
  PrintInfo printInfo = new PrintInfo();
  int iterator;
    int charIndex ;
    int wordIndex;
PriorityData [] priorityData;
    public PriorityData [] fileReaderMethods()  throws IOException{

        File file = new File("IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char[] arrayOfCharacter = new char[120500];
        fr.read(arrayOfCharacter);


        // reads the content to the array
        String  bookName[] = new String[1050];
        String writerName[] = new String[1050];
        String bookId[] = new String[1050];


        String borrowCount[] = new String[1050];

        String bookPrice[] = new String[1050];



        bookName[wordIndex] = "\0";
        writerName[wordIndex] = "\0";
        bookId[wordIndex] = "\0";
        borrowCount[wordIndex] = "\0";
        bookPrice[wordIndex] = "\0";

        for (iterator = 0; arrayOfCharacter[iterator] != '\0'; iterator++) {
            if (arrayOfCharacter[iterator] == '\t') {
                iterator++;
                charIndex++;
                charIndex = charIndex % 5;
            }
            if (arrayOfCharacter[iterator] == '\n') {
                iterator++;
                charIndex++;

                charIndex = charIndex % 5;


                int bookNameSize = bookName[wordIndex].length();
bookName[wordIndex] = bookName[wordIndex].substring(1,bookNameSize);

                int writerNameSize = writerName[wordIndex].length();
                writerName[wordIndex] = writerName[wordIndex].substring(1,writerNameSize);

                int bookIdSize = bookId[wordIndex].length();
                bookId[wordIndex] = bookId[wordIndex].substring(1,bookIdSize);

                int bookIdPrice = bookPrice[wordIndex].length();
                bookPrice[wordIndex] = bookPrice[wordIndex].substring(1,bookIdPrice);

             String string = bookPrice[wordIndex];
                     string = string.replaceAll("[\\t\\n\\r]+", "");
                bookPrice[wordIndex] = string;


                bookData[wordIndex] = new BookData(  bookName[wordIndex],  writerName[wordIndex],
         bookId[wordIndex],   borrowCount[wordIndex],
           bookPrice[wordIndex],0.00);


                wordIndex++;
                bookName[wordIndex] = "\0";
                writerName[wordIndex] = "\0";
                bookId[wordIndex] = "\0";

                borrowCount[wordIndex] = "\0";
                bookPrice[wordIndex] = "\0";

            }
            if (charIndex == 0) {

                bookName[wordIndex] = bookName[wordIndex] + arrayOfCharacter[iterator];
            } else if (charIndex == 1) {

                writerName[wordIndex] = writerName[wordIndex] + arrayOfCharacter[iterator];

            } else if (charIndex == 2) {
                bookId[wordIndex] = bookId[wordIndex] + arrayOfCharacter[iterator];


            } else if (charIndex == 3) {
                borrowCount[wordIndex] = borrowCount[wordIndex] + arrayOfCharacter[iterator];

            }
            else if(charIndex ==4){
                bookPrice[wordIndex]=bookPrice[wordIndex]+arrayOfCharacter[iterator];
            }
        }
        fr.close();

 numOfBook= wordIndex;



   priorityData =      dataParsing.dataParsingMethods(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);

 return  priorityData;
    }


}