package Processed;

import ObjectOriented.PriorityData;

public class CalculateDoublyRegression {
    int number=216;
    int i;
    public void calculateDoublyRegressionMethod(double beta1, double beta2, double beta3, PriorityData [] priorityData){


        for(i=0;i<number;i++) {
        priorityData[i] = new PriorityData(0);
        }

        for(i=0;i<number;i++){

            priorityData[i].bookPriorityOne = beta1 + beta2*priorityData[i].borrowPriority + beta3 * priorityData[i].timePriority;
            System.out.println("---------"+priorityData[i].bookPriorityOne+"---------");
        }


    }
}
