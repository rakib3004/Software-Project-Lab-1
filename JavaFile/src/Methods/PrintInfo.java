package Methods;

import ObjectOriented.BookData;

public class PrintInfo {

    public void printAll(BookData[] bookData, int numberOfBooks){
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookData[j].bookName);
        }
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookData[j].writerName);
        }
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookData[j].bookId);
        }

        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookData[j].borrowCount);

        }  for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookData[j].bookPrice);

        }
    }}
