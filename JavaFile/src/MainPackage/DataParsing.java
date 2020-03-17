package MainPackage;

import Calculation.LinearRegression;
import Calculation.MultipleLinearRegression;
import Calculation.SimpleStatistics;
import ObjectOriented.BookData;
import ObjectOriented.PriorityData;
import Methods.Sorting;

public class DataParsing {
    double bookPriority [] = new double[1050];
    double timePriority [] = new double [1050];
    double borrowPriority [] = new double[1050];
    double pricePriority [] = new double [1050];
    double x_value[][] = new double[3][1050];
    double y_value[] = new double[1050];
    int typeValue [] =new int[1050];
    int timeCount [] = new int[1050];
    int bookCount [] = new int [1050];
    int bookPrice [] =new int[1050];
    double weight [] = new double[1050];

    String string,string1,string2;
    int length;
    int integer1,integer2;
    int newYear,oldYear;
    int index;
Sorting sorting = new Sorting();
    LinearRegression linearRegression = new LinearRegression();
MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();
PriorityData priorityData[] = new PriorityData[1050];
SimpleStatistics simpleStatistics= new SimpleStatistics();

    public void bookValueParsing(BookData[] bookData, String[] writerName,
                                 String[] borrowCount1, String[] bookPrice1, String[] bookId, int numberOfBooks){

        for(int i=0;i<numberOfBooks;i++){

        } for(int i=0;i<numberOfBooks;i++){
            length = bookId[i].length();
            string =bookId[i].substring(1,3);
            typeValue[i] = Integer.parseInt(string);
        }
        for(int i=0;i<numberOfBooks;i++){
            newYear = 2 + (20) * 12;
            string1 = bookId[i].substring(4,6);
            integer1 = Integer.parseInt(string1);
            string2=bookId[i].substring(6,8);

            integer2 = Integer.parseInt(string2);
            oldYear = integer1+(integer2*12);
            timeCount[i] = newYear - oldYear;

        } for(int i=0;i<numberOfBooks;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }
        for(int i=0;i<numberOfBooks;i++){
            length = bookPrice1[i].length();
            string =bookPrice1[i].substring(1,length);
            string=string.replaceAll("[\\t\\n\\r]+","");
            bookPrice[i] = Integer.parseInt(string);
        }
        for(int i =0;i<numberOfBooks;i++){
            bookPriority[i] =  (35-typeValue[i]);
            timePriority[i] = 16 -  (timeCount[i]/12);
            borrowPriority[i] = bookCount[i];
            pricePriority[i] = bookPrice[i];
            index = i;
            priorityData[i] =new PriorityData(bookPriority[i],timePriority[i],borrowPriority[i],pricePriority[i],index,bookData[i]);
        }

         y_value =   bookPriority;
        x_value[0]=timePriority;
        x_value[1]=borrowPriority;
        x_value[2]=pricePriority;
        for(int i=0;i<3;i++){
weight =linearRegression.calculateRegression(x_value[i],y_value,numberOfBooks);
            System.out.println("Optimization No : "+(i+1));
sorting.algorithm(bookData,weight,numberOfBooks);
        }

        multipleLinearRegression.loadData(bookPriority,timePriority,borrowPriority,pricePriority,numberOfBooks,priorityData);
simpleStatistics.regressionProcess(bookPriority,timePriority,borrowPriority,pricePriority,numberOfBooks,priorityData);
    }
}
