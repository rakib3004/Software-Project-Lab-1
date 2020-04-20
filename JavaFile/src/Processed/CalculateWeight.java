package Processed;

import ResultPackage.MLR_Result;
import ObjectOriented.PriorityData;

public class CalculateWeight {
    double optimizeValue;
    MLR_Result MLRResult = new MLR_Result();
    public  void  regressionResult(double betaZero, double betaOne, double
            betaTwo, double betaThree, PriorityData[] priorityData, int numberOfBooks){

        int iterator;


            for(iterator=0;iterator<numberOfBooks;iterator++){
            optimizeValue = ((betaOne * priorityData[iterator].borrowPriority)+
                    (betaTwo * priorityData[iterator].timePriority)+(betaThree * priorityData[iterator].pricePriority));
              //  System.out.println("********* "+optimizeValue+" *********");


            priorityData[iterator].setMLRweight(optimizeValue);
            }

       MLRResult.sortingProcess(priorityData,numberOfBooks);

    }
}
