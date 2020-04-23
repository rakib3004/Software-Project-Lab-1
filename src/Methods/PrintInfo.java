package Methods;

import ObjectOriented.BookData;
import ObjectOriented.PriorityData;

public class PrintInfo {
int iterator;
    public void printInfoMethods(BookData[] bookData, int numberOfBooks) {
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

        }
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookData[j].bookPrice);

        }
    }

    public void showMLRProcessResult(PriorityData[] priorityData, int numberOfBooks) {

        System.out.println("Book Name :\t Writer Name : \t Weight ");
        for (iterator = 0; iterator < numberOfBooks; iterator++) {

            System.out.println(priorityData[iterator].bookData.bookName + "\t"
                    + priorityData[iterator].bookData.writerName + "\t" + priorityData[iterator].getMLRweight());

        }

    }


    public void showAHPProcessResult(PriorityData[] priorityData, int numberOfBooks) {

        System.out.println("Book Name :\t Writer Name : \t Weight ");
        for(iterator=0;iterator<numberOfBooks;iterator++){

            System.out.println(priorityData[iterator].bookData.bookName+"\t"
                    +priorityData[iterator].bookData.writerName+"\t"+priorityData[iterator].getAHPweight());

        }

    }


    public void showPRAProcessResult(PriorityData[] priorityData, int numberOfBooks) {

        System.out.println("Book Name :\t Writer Name : \t Weight ");
        for(iterator=0;iterator<numberOfBooks;iterator++){

            System.out.println(priorityData[iterator].bookData.bookName+"\t"
                    +priorityData[iterator].bookData.writerName+"\t"+priorityData[iterator].getPRAweight());

        }

    }




}