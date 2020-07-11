package IOStream;

public class RankingAnalyze {
    BookData [] bookData1;
 int i,j;
    int number;
    RankExpose rankExpose = new RankExpose();
   public void rankingAnalyze1(BookData [] bookData, int numberOfBooks){

        bookData1 = bookData;
        number = numberOfBooks;
       double [] dataMean = new double[number];
       for(i=0;i<number;i++){
           for(j=0;j<9;j++){
               dataMean[i] =dataMean[i] + bookData[i].rank[j];

           }
           dataMean[i] = dataMean[i]/9;
       }
     rankExpose.statitics1(bookData,numberOfBooks,dataMean);

   }
   


}
