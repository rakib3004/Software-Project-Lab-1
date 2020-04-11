package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class CountCriteriaAHP {
    AHPcriteriaWeight ahPcriteriaWeight;

    public AHPcriteriaWeight countCriteriaAHPMethods(double criteria,PriorityData[] priorityData, int numberOfBooks) {
        double[][] countCriteriaAHPMatrix = new double[4][4];


        int i, j;
int priorityCount=2;
        for (i = 0; i < 4; i++) {
            for (j = i + 1; j < 4; j++) {
                countCriteriaAHPMatrix[i][j] = priorityCount;
                priorityCount = priorityCount * 2;
              //  System.out.println(countCriteriaAHPMatrix[i][j]);
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = i + 1; j < 4; j++) {

                countCriteriaAHPMatrix[j][i] = Math.pow(countCriteriaAHPMatrix[i][j], -1);
            }
        }
        for (i = 0; i < 4; i++) {


            countCriteriaAHPMatrix[i][i] = (1);


        }

//        for (i = 0; i < 4; i++) {
//            for (j = 0; j < 4; j++) {
//
//                System.out.print(countCriteriaAHPMatrix[i][j] + "  ");
//            }
//            System.out.println();
//
//        }
        double[] summationMatrix = new double[4];

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                summationMatrix[i] = summationMatrix[i] + countCriteriaAHPMatrix[i][j];
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                countCriteriaAHPMatrix[i][j] = countCriteriaAHPMatrix[i][j] / summationMatrix[i];
            }
        }
      double[] countWeightMatrix = new double[4];

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {

                countWeightMatrix[i] = countWeightMatrix[i] + countCriteriaAHPMatrix[j][i];

            }
            countWeightMatrix[i] = countWeightMatrix[i] / 4;
        }
        for (i = 0; i < 4; i++) {

          countWeightMatrix[i] = countWeightMatrix[i]*criteria;
        }


         ahPcriteriaWeight = new AHPcriteriaWeight(countWeightMatrix[0],countWeightMatrix[1],countWeightMatrix[2],countWeightMatrix[3]);

        System.out.println(ahPcriteriaWeight.highlyDemand+"---------->  ahPcriteriaWeight.highlyDemand");
        System.out.println(ahPcriteriaWeight.highMediumDemand+"---------->  ahPcriteriaWeight.highMediumDemand");
        System.out.println(ahPcriteriaWeight.lowMediumDemand+"---------->  ahPcriteriaWeight.lowMediumDemand");
        System.out.println(ahPcriteriaWeight.lowlyDemand+"---------->  ahPcriteriaWeight.lowlyDemand");
                return ahPcriteriaWeight;
    }
}