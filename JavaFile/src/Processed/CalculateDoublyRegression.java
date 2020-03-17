package Processed;

import ObjectOriented.PriorityData;

public class CalculateDoublyRegression {
    int number;
    int i;
    public void calculateDoublyRegressionMethod(double beta1, double beta2, double beta3, PriorityData [] priorityData){


        for(i=0;i<number;i++){         

            priorityData[i].bookPriority = beta1 + beta2*priorityData[i].borrowPriority + beta3 * priorityData[i].timePriority;

        }



    }
}
