package Calculation;

import ObjectOriented.PriorityData;
import Processed.CalculateDoublyRegression;

public class DoublyLinearRegression {
    int number=216;
    int i;
double sumYX2,sumYX3,sumX3square,sumX2square,sumX2X3;
double meanY,meanX2,meanX3;
CalculateDoublyRegression calculateDoublyRegression = new CalculateDoublyRegression();
    public void calculateRegression(PriorityData[]  priorityData){

        for(i=0;i<number;i++){
meanX2 = meanX2 + priorityData[i].borrowPriority;
        }for(i=0;i<number;i++){
meanX3 = meanX3 + priorityData[i].timePriority;
        }for(i=0;i<number;i++){
meanY = meanY + priorityData[i].bookPriority ;
        }
        meanY = meanY / number;
        meanX2 = meanX2 / number;
        meanX3 = meanX3 / number;

        for(i=0;i<number;i++){
            sumX2square= sumX2square + Math.pow(priorityData[i].borrowPriority,2);
        }

        for(i=0;i<number;i++) {
            sumX3square= sumX3square + Math.pow(priorityData[i].timePriority,2);

        }
 for(i=0;i<number;i++) {
     sumYX2 = sumYX2 + (priorityData[i].bookPriority*priorityData[i].borrowPriority);

        }
 for(i=0;i<number;i++) {
     sumYX3 = sumYX3 + (priorityData[i].bookPriority*priorityData[i].timePriority);

        }
 for(i=0;i<number;i++) {
     sumX2X3 = sumX2X3 + (priorityData[i].borrowPriority*priorityData[i].timePriority);
        }


 double beta1,beta2,beta3;

 beta2 = ((sumYX2*sumX3square)-(sumYX3*sumX2X3))/((sumX2square*sumX3square)-(sumX2X3*sumX2X3));
 beta3 = ((sumYX3*sumX2square)-(sumYX2*sumX2X3))/((sumX2square*sumX3square)-(sumX2X3*sumX2X3));
 //beta2 = Math.pow(beta2,-1);
 //beta3 = Math.pow(beta3,-1);

 beta1 = meanY - (beta2*meanX2) - (beta3*meanX3);

 calculateDoublyRegression.calculateDoublyRegressionMethod(beta1,beta2,beta3,priorityData);


        }


}
