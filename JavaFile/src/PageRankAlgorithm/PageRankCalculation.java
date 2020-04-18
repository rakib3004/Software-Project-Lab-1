package PageRankAlgorithm;

import ObjectOriented.PriorityData;

public class PageRankCalculation {
double linkValue;
boolean checkLink;
PageRankLink pageRankLink = new PageRankLink();
CheckPageLink checkPageLink = new CheckPageLink();
    int iterator,jterator;
PageRankMatrixCalculation pageRankMatrixCalculation = new PageRankMatrixCalculation();
    public void pageRankCalculationMethods(PriorityData[] priorityData, int numberOfBooks) {
        double initialProbability = Math.pow(numberOfBooks, -1);
        double[] pageWeight = new double[numberOfBooks];
        double[][] pageRankMatrix = new double[numberOfBooks][numberOfBooks];


        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            pageWeight[iterator] = initialProbability * 4;
        }

        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            linkValue = pageRankLink.pageRankLinkMethods(iterator, priorityData, numberOfBooks);

            for (jterator = 0; (jterator < numberOfBooks && jterator != iterator); jterator++) {

                checkLink = checkPageLink.checkPageLinkMethods(iterator, jterator, priorityData, numberOfBooks);
                if (checkLink == true) {
                    pageRankMatrix[jterator][iterator] = linkValue;

                } else if (checkLink == false) {
                    pageRankMatrix[jterator][iterator] = 0.0;

                }

            }
        }


        for (jterator = 0; jterator < numberOfBooks; jterator++) {

            pageRankMatrix[jterator][jterator] = 0.0;

        }

        for (jterator = 0; jterator < numberOfBooks; jterator++) {

            System.out.println(pageWeight[jterator]);

        }

        int processingCounter = 0;
        for (processingCounter = 0; processingCounter <2; processingCounter++) {


        pageWeight = pageRankMatrixCalculation.pageRankMatrixCalculationMethods(pageWeight, pageRankMatrix, numberOfBooks);

         }

        for(jterator=0;jterator<numberOfBooks;jterator++){

            System.out.println(pageWeight[jterator]);

        }

    }
}
