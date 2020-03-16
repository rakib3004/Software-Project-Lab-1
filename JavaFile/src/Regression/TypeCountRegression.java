package Regression;

import IOStream.BookData;
import IOStream.GenericAlgo;

//Complete
public class TypeCountRegression {
    int i;
    double countMean=0;
    double typeMean=0;
    double bookCount [] = new double [1050];
    double typeValue [] =new double[1050];
    double typeValue1 [] =new double[1050];
    double typeValue0 [] =new double[1050];

    int length;
    String string;
    double assumpMean1  = 0;
    double assumpMean2  = 0;
    public  void statistics(BookData[] bookData, String[] writerName,
                            String[] borrowCount1, String[] bookPrice1, String[] bookId, int numberOfBooks){


        for( i=0;i<numberOfBooks;i++){
             length = bookId[i].length();
            string =bookId[i].substring(1,3);
            typeValue[i] = Integer.parseInt(string);
            typeValue0[i]=typeValue[i];
        }
    for( i=0;i<numberOfBooks;i++){
        length = borrowCount1[i].length();
        string =borrowCount1[i].substring(1,length);
        bookCount[i] = Integer.parseInt(string);
    }

        for( i=0;i<numberOfBooks;i++){
typeMean = typeMean +typeValue[i];
countMean = countMean+bookCount[i];
        }

        typeMean = typeMean/numberOfBooks;
        countMean = countMean/numberOfBooks;


    for(i=0;i<numberOfBooks;i++){
typeValue[i] =  typeValue[i]  - typeMean;
bookCount[i]=bookCount[i]-countMean;
assumpMean1 = assumpMean1 +( typeValue[i]*bookCount[i]);
assumpMean2 = assumpMean2 + (bookCount[i]*bookCount[i]);

    }

    double metaValue = assumpMean1/assumpMean2;
    double betaValue = countMean - (metaValue*typeMean);
        for(i=0;i<numberOfBooks;i++) {

            typeValue1[i] = betaValue + metaValue * bookCount[i];
       //     System.out.println(typeValue0[i]+"\t"+typeValue1[i]);
        }
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(typeValue1[i]);
        }
       // SortingTypeCount sortingTypeCount = new SortingTypeCount();
     //   sortingTypeCount.algorithm(bookData,numberOfBooks);


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
                    bookData[j].setRank(temp,4);

                }
            }
        }
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println("Optimized View 5 :" );

        for( i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }


    }

    }