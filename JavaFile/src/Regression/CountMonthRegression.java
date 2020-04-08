package Regression;

import ObjectOriented.BookData;
import ObjectOriented.GenericAlgo;

public class CountMonthRegression {
    int iterator;
    double countMean = 0;
    double timeMean = 0;
    double bookCount[] = new double[1050];
    double bookCount0[] = new double[1050];
    double bookCount1[] = new double[1050];

    int timeCount[] = new int[1050];

    double timeValue[] = new double[1050];
    double timeValue1[] = new double[1050];
    public void statistics(BookData[] bookData, String[] writerName,
                           String[] borrowCount1, String[] bookPrice1, String[] bookId, int numberOfBooks) {




         int length;
        String string;
        String string1, string2;

        int newYear, oldYear, integer1, integer2;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            newYear = 2 + (20) * 12;
            string1 = bookId[iterator].substring(4, 6);
            integer1 = Integer.parseInt(string1);
            string2 = bookId[iterator].substring(6, 8);

            integer2 = Integer.parseInt(string2);
            oldYear = integer1 + (integer2 * 12);
            timeValue[iterator] = newYear - oldYear;

        }

        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            length = borrowCount1[iterator].length();
            string = borrowCount1[iterator].substring(1, length);
            bookCount[iterator] = Integer.parseInt(string);
        }

        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            timeMean = timeMean + timeValue[iterator];
            countMean = countMean + bookCount[iterator];
        }


        countMean = countMean / numberOfBooks;

        double assumpMean1 = 0;
        double assumpMean2 = 0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            timeValue[iterator] = timeValue[iterator] - timeMean;
            bookCount[iterator] = bookCount[iterator] - countMean;
            assumpMean1 = assumpMean1 + (timeValue[iterator] * bookCount[iterator]);
            assumpMean2 = assumpMean2 + (bookCount[iterator] * bookCount[iterator]);

        }

        double metaValue = assumpMean1 / assumpMean2;
        double betaValue = timeMean - (metaValue * countMean);
        for (iterator = 0; iterator < numberOfBooks; iterator++) {

            timeValue1[iterator] = betaValue + metaValue * bookCount[iterator];
            //     System.out.println(typeValue0[i]+"\t"+timeValue1[i]);
        }
        for (iterator = 0; iterator < numberOfBooks; iterator++) {

            bookData[iterator].setWeight(timeValue1[iterator]);
        }


        // SortingMonthCount sortingMonthCount = new SortingMonthCount();
        //  sortingMonthCount.algorithm(bookData,numberOfBooks);
        GenericAlgo genericAlgo[] = new GenericAlgo[1050];
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            genericAlgo[iterator] = new GenericAlgo(bookData[iterator].getWeight(), iterator);
        }
        double temporary;
        int temp;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            for (int j = 0; j < numberOfBooks; j++) {
                if (genericAlgo[iterator].getWeight() > genericAlgo[j].getWeight()) {
                    temporary = genericAlgo[iterator].getWeight();
                    genericAlgo[iterator].setWeight(genericAlgo[j].getWeight());
                    genericAlgo[j].setWeight(temporary);
                    temp = genericAlgo[iterator].getIndex();
                    genericAlgo[iterator].setIndex(genericAlgo[j].getIndex());
                    genericAlgo[j].setIndex(temp);
                    bookData[j].setRank(temp, 7);

                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Optimized View 08 :");

        for (iterator = 190; iterator < numberOfBooks; iterator++) {
            System.out.println("Book Name :" + bookData[genericAlgo[iterator].getIndex()].getBookName() +
                    "; Writer Name : " + bookData[genericAlgo[iterator].getIndex()].getWriterName()
                    + "; Weight : " + genericAlgo[iterator].getWeight());
        }

    }
}