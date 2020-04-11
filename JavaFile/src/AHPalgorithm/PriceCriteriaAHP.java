package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class PriceCriteriaAHP {
    AHPcriteriaWeight ahPcriteriaWeight;

    public AHPcriteriaWeight priceCriteriaAHPMethods(double criteria,PriorityData[] priorityData, int numberOfBooks) {
        double[][] priceCriteriaAHPMatrix = new double[3][3];


        int i, j;
priceCriteriaAHPMatrix[0][1] = Math.pow(2,-1);
priceCriteriaAHPMatrix[0][2] = Math.pow(7,-1);
priceCriteriaAHPMatrix[1][2] = Math.pow(5,-1);


        for (i = 0; i < 3; i++) {
            for (j = i + 1; j < 3; j++) {
                priceCriteriaAHPMatrix[i][j] = Math.abs(priceCriteriaAHPMatrix[i][j]);
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = i + 1; j < 3; j++) {

                priceCriteriaAHPMatrix[j][i] = Math.pow(priceCriteriaAHPMatrix[i][j], -1);

            }
        }
        for (i = 0; i < 3; i++) {

            priceCriteriaAHPMatrix[i][i] = (1);
        }


        double[] summationMatrix = new double[3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                summationMatrix[i] = summationMatrix[i] + priceCriteriaAHPMatrix[i][j];
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                priceCriteriaAHPMatrix[i][j] = priceCriteriaAHPMatrix[i][j] / summationMatrix[i];
            }
        }
        double[] priceWeightMatrix = new double[3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                priceWeightMatrix[i] = priceWeightMatrix[i] + priceCriteriaAHPMatrix[j][i];

            }
            priceWeightMatrix[i] = priceWeightMatrix[i] / 3;
        }

        for (i = 0; i < 3; i++) {

        priceWeightMatrix[i]  =  priceWeightMatrix[i]*criteria;
        }

         ahPcriteriaWeight = new AHPcriteriaWeight(priceWeightMatrix[0],
                priceWeightMatrix[1],priceWeightMatrix[2]);

        System.out.println(ahPcriteriaWeight.highPrice+"---------->  ahPcriteriaWeight.highPrice");
        System.out.println(ahPcriteriaWeight.mediumPrice+"---------->  ahPcriteriaWeight.mediumPrice");
        System.out.println(ahPcriteriaWeight.lowPrice+"---------->  ahPcriteriaWeight.lowPrice");
       return ahPcriteriaWeight;
    }
}
