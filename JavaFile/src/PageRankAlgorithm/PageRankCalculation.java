package PageRankAlgorithm;

import ObjectOriented.PriorityData;

public class PageRankCalculation {

    public void pageRankCalculationMethods(PriorityData[] priorityData, int numberOfBooks){
        double initialProbability = Math.pow(numberOfBooks,-1);
        double [] pageWeight = new double[numberOfBooks];
        double [][] pageRankMatrix = new double[numberOfBooks][numberOfBooks];


        int iterator,jterator;
        for(iterator=0;iterator<numberOfBooks;iterator++){
            pageWeight[iterator]=initialProbability;
        }

        for(iterator=0;iterator<numberOfBooks;iterator++){
            for(jterator=0;jterator<numberOfBooks;jterator++){

pageRankMatrix[iterator][jterator] = 1;

            }
        }




    }
}
