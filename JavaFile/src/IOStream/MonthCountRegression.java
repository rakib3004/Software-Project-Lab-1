package IOStream;

public class MonthCountRegression {
    public  void statistics(BookData[] bookData,String[] writerName,
                            String[] borrowCount1,String[] bookPrice1,String[] bookId,int numberOfBooks){

        int i;
        double countMean=0;
        double timeMean=0;
        double bookCount [] = new double [1050];
        double bookCount0 [] = new double [1050];
        double bookCount1 [] = new double [1050];

        int timeCount [] = new int[1050];

        double timeValue [] =new double[1050];


        int length;
        String string;
        String string1,string2;

        int newYear,oldYear,integer1,integer2;
        for( i=0;i<numberOfBooks;i++){
            newYear = 2 + (20) * 12;
            string1 = bookId[i].substring(4,6);
            integer1 = Integer.parseInt(string1);
            string2=bookId[i].substring(6,8);

            integer2 = Integer.parseInt(string2);
            oldYear = integer1+(integer2*12);
            timeValue[i] = newYear - oldYear;

        }

        for( i=0;i<numberOfBooks;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }

        for( i=0;i<numberOfBooks;i++){
            timeMean = timeMean +timeValue[i];
            countMean = countMean+bookCount[i];
        }

        timeMean = timeMean/numberOfBooks;
        countMean = countMean/numberOfBooks;

        double assumpMean1  = 0;
        double assumpMean2  = 0;
        for(i=0;i<numberOfBooks;i++){
            timeValue[i] =  timeValue[i]  - timeMean;
            bookCount[i]=bookCount[i]-countMean;
            assumpMean1 = assumpMean1 +( timeValue[i]*bookCount[i]);
            assumpMean2 = assumpMean2 + (timeValue[i]*timeValue[i]);

        }

        double metaValue = assumpMean1/assumpMean2;
        double betaValue = timeMean - (metaValue*countMean);
        for(i=0;i<numberOfBooks;i++) {

            bookCount1[i] = betaValue + metaValue * timeValue[i];
            //     System.out.println(typeValue0[i]+"\t"+timeValue1[i]);
        }
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(bookCount1[i]);
        }
       // SortingMonthCount sortingMonthCount = new SortingMonthCount();
      //  sortingMonthCount.algorithm(bookData,numberOfBooks);
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
                    bookData[j].setRank(temp,2);

                }
            }
        }
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println("Optimized View 03 :" );

        for( i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }

}
