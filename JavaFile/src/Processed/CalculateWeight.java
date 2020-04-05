package Processed;

import MainPackage.ResultClass;
import ObjectOriented.PriorityData;

import javax.swing.*;

public class CalculateWeight {
    double optimizeValue;
    ResultClass resultClass = new ResultClass();
    public  void  regressionResult(double betaZero, double betaOne, double
            betaTwo, double betaThree, PriorityData[] priorityData, int numberOfBooks){

        int iterator;


            for(iterator=0;iterator<numberOfBooks;iterator++){
            optimizeValue = ((betaOne * priorityData[iterator].borrowPriority)+
                    (betaTwo * priorityData[iterator].timePriority)+(betaThree * priorityData[iterator].pricePriority));
              //  System.out.println("********* "+optimizeValue+" *********");


            priorityData[iterator].setWeight(optimizeValue);
            }

       resultClass.sortingProcess(priorityData,numberOfBooks);

    }
}
