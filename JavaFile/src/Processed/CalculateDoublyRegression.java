package Processed;

import ObjectOriented.PriorityData;

public class CalculateDoublyRegression {
    int number=632;
    int iiterator;
    public void calculateDoublyRegressionMethod(double beta1, double beta2, double beta3, PriorityData [] priorityData){


        for(iiterator =0; iiterator <number; iiterator++) {
        priorityData[iiterator] = new PriorityData(0);
        }

        for(iiterator =0; iiterator <number; iiterator++){

            priorityData[iiterator].bookPriorityOne = beta1 + beta2*priorityData[iiterator].borrowPriority + beta3 * priorityData[iiterator].timePriority;
            System.out.println("D R :"+priorityData[iiterator].bookPriorityOne+"---------");
        }


    }
}
