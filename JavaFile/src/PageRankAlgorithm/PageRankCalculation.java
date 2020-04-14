package PageRankAlgorithm;

import ObjectOriented.PriorityData;

public class PageRankCalculation {
double linkValue;
PageRankLink pageRankLink = new PageRankLink();
    public void pageRankCalculationMethods(PriorityData[] priorityData, int numberOfBooks){
        double initialProbability = Math.pow(numberOfBooks,-1);
        double [] pageWeight = new double[numberOfBooks];
        double [][] pageRankMatrix = new double[numberOfBooks][numberOfBooks];


        int iterator,jterator;
        for(iterator=0;iterator<numberOfBooks;iterator++){
            pageWeight[iterator]=initialProbability;
        }

        for(iterator=0;iterator<numberOfBooks;iterator++){
            linkValue = pageRankLink.pageRankLinkMethods(iterator,priorityData,numberOfBooks);

            for(jterator=0;(jterator<numberOfBooks&&jterator!=iterator);jterator++){

pageRankMatrix[jterator][iterator] = linkValue;

            }
        }


        for(jterator=0;jterator<numberOfBooks;jterator++){

            pageRankMatrix[jterator][jterator] = 0;

        }

    }
}
