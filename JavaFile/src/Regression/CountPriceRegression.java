package Regression;

import ObjectOriented.BookData;
import ObjectOriented.GenericAlgo;

public class CountPriceRegression {


    int iterator;
    double countMean=0;
    double priceMean=0;
    double bookCount [] = new double [1050];
    double bookPrice [] =new double[1050];
    double bookPrice1 [] =new double[1050];
    double bookPrice0 [] =new double[1050];

    int length;
    String string;
    public  void statistics(BookData[] bookData, String[] writerName,
                            String[] borrowCount1, String[] bookPrice9, String[] bookId, int numberOfBooks){

        for(iterator =0; iterator <numberOfBooks; iterator++){
            length = borrowCount1[iterator].length();
            string =borrowCount1[iterator].substring(1,length);
            bookCount[iterator] = Integer.parseInt(string);
        }
        for(iterator =0; iterator <numberOfBooks; iterator++){
            length = bookPrice9[iterator].length();
            string =bookPrice9[iterator].substring(1,length);
            string=string.replaceAll("[\\t\\n\\r]+","");
            bookPrice[iterator] = Integer.parseInt(string);
        }

        for(iterator =0; iterator <numberOfBooks; iterator++){
            priceMean = priceMean +bookPrice[iterator];
            countMean = countMean+bookCount[iterator];
        }

        priceMean = priceMean/numberOfBooks;
        countMean = countMean/numberOfBooks;

        double assumpMean1  = 0;
        double assumpMean2  = 0;
        for(iterator =0; iterator <numberOfBooks; iterator++){
            bookPrice[iterator] =  bookPrice[iterator]  - priceMean;
            bookCount[iterator]=bookCount[iterator]-countMean;
            assumpMean1 = assumpMean1 +( bookPrice[iterator]*bookCount[iterator]);
            assumpMean2 = assumpMean2 + (bookCount[iterator]*bookCount[iterator]);

        }

        double metaValue = assumpMean1/assumpMean2;
        double betaValue = countMean - (metaValue*priceMean);
        for(iterator =0; iterator <numberOfBooks; iterator++) {

            bookPrice1[iterator] = betaValue + metaValue * bookCount[iterator];
            //     System.out.println(bookPrice0[i]+"\t"+bookPrice1[i]);
        }
        for(iterator =0; iterator <numberOfBooks; iterator++){

            bookData[iterator].setWeight(bookPrice1[iterator]);
        }
       // SortingCountPrice sortingCountPrice = new SortingCountPrice();
       // sortingCountPrice.algorithm(bookData,numberOfBooks);

        GenericAlgo genericAlgo[] = new GenericAlgo[1050];

        for(iterator = 0; iterator <numberOfBooks; iterator++){
            genericAlgo[iterator] = new GenericAlgo(bookData[iterator].getWeight(), iterator);
        }
        double temporary;
        int temp;
        for(iterator =0; iterator <numberOfBooks; iterator++){
            for(int j=0;j<numberOfBooks;j++){
                if(genericAlgo[iterator].getWeight()>genericAlgo[j].getWeight()){
                    temporary= genericAlgo[iterator].getWeight();
                    genericAlgo[iterator].setWeight(genericAlgo[j].getWeight());
                    genericAlgo[j].setWeight(temporary);
                    temp = genericAlgo[iterator].getIndex();
                    genericAlgo[iterator].setIndex(genericAlgo[j].getIndex());
                    genericAlgo[j].setIndex(temp);
                    bookData[j].setRank(temp,1);

                }
            }
        }
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println("Optimized View 2 :" );

        for(iterator =190; iterator <numberOfBooks; iterator++){
            System.out.println("Book Name :"+bookData[genericAlgo[iterator].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[iterator].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[iterator].getWeight());
        }

    }

}
