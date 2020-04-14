package PageRankAlgorithm;

public class PageRankMatrixCalculation {
    int iterator,jterator;

    public double [] pageRankMatrixCalculationMethods(double [] pageWeight, double [][] pageRankMatrix, int numberOfBooks){

        double [] weightSum = new double[numberOfBooks];

        for(iterator=0;iterator<numberOfBooks;iterator++){

            for(jterator=0;jterator<numberOfBooks;jterator++){
weightSum[iterator] = weightSum[iterator]+ (pageRankMatrix[iterator][jterator]*pageWeight[jterator]);

            }
        }
        pageWeight =weightSum;
        return pageWeight;
    }
}
