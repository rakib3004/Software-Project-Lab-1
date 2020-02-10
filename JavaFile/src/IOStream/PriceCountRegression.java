package IOStream;

public class PriceCountRegression  {
    public  void statistics(BookData[] bookData,String[] writerName,
                            String[] borrowCount1,String[] bookPrice9,String[] bookId,int numberOfBooks){

    int i;
    double countMean=0;
    double priceMean=0;
    double bookCount [] = new double [1050];
    double bookCount0 [] = new double [1050];
    double bookCount1 [] = new double [1050];
    double bookPrice [] =new double[1050];
    double bookPrice1 [] =new double[1050];
    double bookPrice0 [] =new double[1050];

    int length;
    String string;
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
        assumpMean2 = assumpMean2 + (bookPrice[i]*bookPrice[i]);

    }

    double metaValue = assumpMean1/assumpMean2;
    double betaValue = countMean - (metaValue*priceMean);
    for(i=0;i<numberOfBooks;i++) {

        bookCount1[i] = betaValue + metaValue * bookPrice[i];
        //     System.out.println(bookPrice0[i]+"\t"+bookPrice1[i]);
    }
    for( i =0;i<numberOfBooks;i++){

        bookData[i].setWeight(bookCount1[i]);
    }
    SortingPriceCount sortingPriceCount = new SortingPriceCount();
    sortingPriceCount.algorithm(bookData,numberOfBooks);

}
}
