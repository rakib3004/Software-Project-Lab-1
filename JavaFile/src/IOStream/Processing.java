package IOStream;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;
public class Processing {
    int x = 0;
     static   int numOfBook;
    BookData bookData [] = new BookData[1050];
   /* TotalRegression totalRegression = new TotalRegression();
    TypeCountRegression typeCountRegression = new TypeCountRegression();
    MonthCountRegression monthCountRegression = new MonthCountRegression();
    PriceCountRegression priceCountRegression = new PriceCountRegression();
    TypePriceRegression typePriceRegression = new TypePriceRegression();
    CountPriceRegression countPriceRegression = new CountPriceRegression();
    CountTypeRegression countTypeRegression = new CountTypeRegression();
    CountMonthRegression countMonthRegression = new CountMonthRegression();
    PriceTypeRegression priceTypeRegression = new PriceTypeRegression();*/

   DataParsing dataParsing = new DataParsing();
  //  Searching searching = new Searching();
  //  RankShow rankShow = new RankShow();
    MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();


    public void fileReader()  throws IOException{

        File file = new File("IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char[] a = new char[120500];
        fr.read(a);
        // reads the content to the array

        String  bookName[] = new String[1050];
        String writerName[] = new String[1050];
        String bookId[] = new String[1050];

       // String bookType[] = new String[1050];
      //  String priority[] = new String[1050];

        String borrowCount[] = new String[1050];

      //  String monthCount[] = new String[1050];
        String bookPrice[] = new String[1050];
 //  arrayList.array();


        bookName[x] = "\0";
        writerName[x] = "\0";
        bookId[x] = "\0";

        borrowCount[x] = "\0";
        bookPrice[x] = "\0";

        int t = 0;
        for (int i = 0; a[i] != '\0'; i++) {
            if (a[i] == '\t') {
                i++;
                t++;
                t = t % 5;
            }
            if (a[i] == '\n') {
                i++;
                t++;

                t = t % 5;
 bookData[x] = new BookData(  bookName[x],  writerName[x],
         bookId[x],   borrowCount[x],
           bookPrice[x],0.00);


                x++;
                bookName[x] = "\0";
                writerName[x] = "\0";
                bookId[x] = "\0";

                borrowCount[x] = "\0";
                bookPrice[x] = "\0";

            }
            if (t == 0) {

                bookName[x] = bookName[x] + a[i];
            } else if (t == 1) {
                writerName[x] = writerName[x] + a[i];

            } else if (t == 2) {
                bookId[x] = bookId[x] + a[i];


            } else if (t == 3) {
                borrowCount[x] = borrowCount[x] + a[i];

            }
            else if(t==4){
                bookPrice[x]=bookPrice[x]+a[i];
            }
        }
        fr.close();

      //  System.out.println();

 numOfBook= x;

int p= getNumber();
double weight1[] = new double[1050];

   /*  weight1 =  totalRegression.analysis(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        typeCountRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        monthCountRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        priceCountRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        typePriceRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        countPriceRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        countTypeRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        countMonthRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        priceTypeRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        multipleLinearRegression.loadData(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook,weight1);*/
        dataParsing.bookValueParsing(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
       // rankShow.showCase(bookData,numOfBook);
        //searching.search(bookData,numOfBook);
        // printAll(bookName,writerName,bookId,borrowCount,bookPrice,numOfBook);
    }
    public int getNumber(){
        return  x ;
    }


    public void printAll(String[] bookName,String[] writerName,String[] bookId,
                        String[] borrowCount,String[] bookPrice,int numberOfBooks){
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookName[j]);
        }
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(writerName[j]);
        }
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookId[j]);
        }

        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(borrowCount[j]);

        }  for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookPrice[j]);

        }
    }
}