package MultiVariableRegression;

import ResultPackage.MLR_Result;
import ObjectOriented.PriorityData;

public class CalculateWeight {
    double optimizeValue;
    MLR_Result MLRResult = new MLR_Result();
    public  PriorityData[] calculateWeightMethods(double betaZero, double betaOne, double
            betaTwo, double betaThree, PriorityData[] priorityData, int numberOfBooks){

        int iterator;


            for(iterator=0;iterator<numberOfBooks;iterator++){
            optimizeValue = ((betaOne * priorityData[iterator].borrowPriority)+
                    (betaTwo * priorityData[iterator].timePriority)+(betaThree * priorityData[iterator].pricePriority));
              //  System.out.println("********* "+optimizeValue+" *********");


            priorityData[iterator].setMLRweight(optimizeValue);
            }

return  priorityData;
     //  MLRResult.MLR_ResultMethods(priorityData,numberOfBooks);

    }
}
