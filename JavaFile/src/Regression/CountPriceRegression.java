package Regression;

import IOStream.BookData;
import IOStream.GenericAlgo;

public class CountPriceRegression {


    int i;
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

        for( i=0;i<numberOfBooks;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }
        for( i=0;i<numberOfBooks;i++){
            length = bookPrice9[i].length();
            string =bookPrice9[i].substring(1,length);
            string=string.replaceAll("[\\t\\n\\r]+","");
            bookPrice[i] = Integer.parseInt(string);
        }

        for( i=0;i<numberOfBooks;i++){
            priceMean = priceMean +bookPrice[i];
            countMean = countMean+bookCount[i];
        }

        priceMean = priceMean/numberOfBooks;
        countMean = countMean/numberOfBooks;

        double assumpMean1  = 0;
        double assumpMean2  = 0;
        for(i=0;i<numberOfBooks;i++){
            bookPrice[i] =  bookPrice[i]  - priceMean;
            bookCount[i]=bookCount[i]-countMean;
            assumpMean1 = assumpMean1 +( bookPrice[i]*bookCount[i]);
            assumpMean2 = assumpMean2 + (bookCount[i]*bookCount[i]);

        }

        double metaValue = assumpMean1/assumpMean2;
        double betaValue = countMean - (metaValue*priceMean);
        for(i=0;i<numberOfBooks;i++) {

            bookPrice1[i] = betaValue + metaValue * bookCount[i];
            //     System.out.println(bookPrice0[i]+"\t"+bookPrice1[i]);
        }
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(bookPrice1[i]);
        }
       // SortingCountPrice sortingCountPrice = new SortingCountPrice();
       // sortingCountPrice.algorithm(bookData,numberOfBooks);

        GenericAlgo genericAlgo[] = new GenericAlgo[1050];

        for( i = 0; i<numberOfBooks; i++){
            genericAlgo[i] = new GenericAlgo(bookData[i].getWeight(),i);
        }
        double temporary;
        int temp;
        for( i=0;i<numberOfBooks;i++){
            for(int j=0;j<numberOfBooks;j++){
                if(genericAlgo[i].getWeight()>genericAlgo[j].getWeight()){
                    temporary= genericAlgo[i].getWeight();
                    genericAlgo[i].setWeight(genericAlgo[j].getWeight());
                    genericAlgo[j].setWeight(temporary);
                    temp = genericAlgo[i].getIndex();
                    genericAlgo[i].setIndex(genericAlgo[j].getIndex());
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

        for( i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }

}
