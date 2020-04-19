package MainPackage;

import AHPalgorithm.AHPcalculation;
import Calculation.DoublyLinearRegression;
import Calculation.LinearRegression;
import Calculation.MultipleLinearRegression;
import ObjectOriented.BookData;
import ObjectOriented.PriorityData;
import Methods.Sorting;

public class DataParsing {
    double[] bookPriority = new double[1050];
    double[] timePriority = new double[1050];
    double[] borrowPriority = new double[1050];
    double[] pricePriority = new double[1050];
    double[][] x_value = new double[3][1050];
    double[] y_value = new double[1050];
    int[] typeValue = new int[1050];
    double[] timeCount = new double[1050];
    int[] bookCount = new int[1050];
    double [] bookPrice = new double [1050];
    double[] weight = new double[1050];

    String string, string1, string2;
    int length;
    int integer1, integer2;
    int newYear, oldYear;
    int  index;
    int iterator;

    public static PriorityData priorityData[] = new PriorityData[1050];
    DoublyLinearRegression doublyLinearRegression = new DoublyLinearRegression();

    public PriorityData [] dataParsingMethods(BookData[] bookData, String[] writerName,
                                   String[] borrowCount1, String[] bookPrice1, String[] bookId, int numberOfBooks) {


        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            length = bookId[iterator].length();
            string = bookId[iterator].substring(0, 2);
            typeValue[iterator] = Integer.parseInt(string);
        }

        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            newYear = 4 + (20) * 12;
            string1 = bookId[iterator].substring(3, 5);
            integer1 = Integer.parseInt(string1);
            string2 = bookId[iterator].substring(5, 7);

            integer2 = Integer.parseInt(string2);
            oldYear = integer1 + (integer2 * 12);
            timeCount[iterator] = newYear - oldYear;

        }
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            length = borrowCount1[iterator].length();
            string = borrowCount1[iterator].substring(1, length);
            bookCount[iterator] = Integer.parseInt(string);
        }
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            length = bookPrice1[iterator].length();
            string = bookPrice1[iterator].substring(1, length);
            string = string.replaceAll("[\\t\\n\\r]+", "");
            bookPrice[iterator] = Integer.parseInt(string) / 10;
        }
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            bookPriority[iterator] = (35 - typeValue[iterator]);
            timePriority[iterator] = 16 - (timeCount[iterator] / 12);
            borrowPriority[iterator] = bookCount[iterator];
            pricePriority[iterator] = bookPrice[iterator];
            index = iterator;
            weight[iterator] = bookPriority[iterator];
            priorityData[iterator] = new PriorityData(bookPriority[iterator],
                    timePriority[iterator], borrowPriority[iterator], pricePriority[iterator],
                    index, bookData[iterator], weight[iterator]);
        }

        y_value = bookPriority;
        x_value[0] = timePriority;
        x_value[1] = borrowPriority;
        x_value[2] = pricePriority;

    //   for (i = 0; i < 3; i++) {
/*weight =linearRegression.linearRegressionMethods(x_value[i],y_value,numberOfBooks);
            System.out.println("Linear Regression _______ Optimization No : "+(i+1));
sorting.sortingMethods(bookData,weight,numberOfBooks);
        }*/

        //AHPcalculation ahPcalculation = new AHPcalculation();

        //ahPcalculation.AHPcalculationMethods(priorityData, numberOfBooks);
         //  multipleLinearRegression.multipleLinearRegressionMethods(priorityData, numberOfBooks);

            /* System.out.println("Doubly  Linear Regression _______  ");*/

            //doublyLinearRegression.doublyLinearRegressionMethods(priorityData);
        return  priorityData;
        }


}
