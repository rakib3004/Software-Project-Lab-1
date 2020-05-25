package DataComparing;

import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import MainPackage.BookNumber;
import MainPackage.Processing;
import Methods.PrioritySort;
import MultiVariableRegression.MultipleLinearRegression;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.GenericAlgo;
import ObjectOriented.PriorityData;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TrainingSector {



    PriorityData[] priorityData;
    GenericAlgo[] genericAlgo;
    PrioritySort prioritySort = new PrioritySort();
    List list = new ArrayList();

    int iterator;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();

    AHPprocessImplementation ahPprocessImplementation = new AHPprocessImplementation();
    MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();

    public void trainingSectorMethods(){
        int [] typeCounter = new int[6];
        double [] parsingTypeCounter = new double[6];

        int [] monthCounter = new int[5];
        double [] parsingMonthCounter = new double[5];

        int [] countCounter = new int[4];
        double [] parsingCountCounter = new double[4];

        int [] priceCounter = new int[3];
        double [] parsingPriceCounter = new double[3];


        try {
            priorityData = processing.fileReaderMethods();
            numberOfBooks = bookNumber.bookNumberFindingMethods();
        } catch (IOException e) {
            e.printStackTrace();
        }

        priorityData = multipleLinearRegression.multipleLinearRegressionMethods(priorityData,numberOfBooks);

        for (iterator = 0;iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].bookData.bookId.substring(13, 14).contains("5") ||
                    priorityData[iterator].bookData.bookId.substring(13, 14).contains("0")) {
                                            continue;
            }
            else{
                if (Integer.parseInt(priorityData[iterator].bookData.bookPrice) <= 180) {
                    priceCounter[0]++;
                }
                else if (Integer.parseInt(priorityData[iterator].bookData.bookPrice) <= 250) {
                    priceCounter[1]++;
                }

                else {
                    priceCounter[2]++;
                }
            }
        }


        for (iterator = 0;iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].bookData.bookId.substring(13, 14).contains("5") ||
                    priorityData[iterator].bookData.bookId.substring(13, 14).contains("0")) {
                                            continue;
            }
            else{

                if (priorityData[iterator].timePriority <= 5.60) {
                    monthCounter[4]++;

                } else if (priorityData[iterator].timePriority <= 7.20) {
                    monthCounter[3]++;

                }  else if (priorityData[iterator].timePriority <= 9.50) {
                    monthCounter[2]++;

                }  else if (priorityData[iterator].timePriority <= 12.00) {
                    monthCounter[1]++;

                }  else if (priorityData[iterator].timePriority <= 14.00) {
                    monthCounter[0]++;

                }
            }
        }






        for (iterator = 0;iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].bookData.bookId.substring(13, 14).contains("5") ||
                    priorityData[iterator].bookData.bookId.substring(13, 14).contains("0")) {
                continue;
            }
            else{

            }
        }






        for (iterator = 0;iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].bookData.bookId.substring(13, 14).contains("5") ||
                    priorityData[iterator].bookData.bookId.substring(13, 14).contains("0")) {
                                            continue;
            }
            else{
                if (priorityData[iterator].bookData.bookId.substring(0,2).equals("01")) {
                    typeCounter[0]++;
                } else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("05")) {

                    typeCounter[0]++;
                } else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("02")) {

                    typeCounter[1]++;

                }else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("13")) {

                    typeCounter[2]++;
                }else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("08")) {
                    typeCounter[2]++;
                }else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("06")) {
                    typeCounter[2]++;
                } else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("10")) {
                    typeCounter[3]++;

                }  else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("11")) {
                    typeCounter[3]++;

                }else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("04")) {
                    typeCounter[4]++;

                }  else {
                    typeCounter[5]++;

                }



            }
        }



    }



}
