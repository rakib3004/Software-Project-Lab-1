package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class PriceCriteriaAHP {
    AHPcriteriaWeight ahPcriteriaWeight;
    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    int [] priceCounter = new int[3];

    public AHPcriteriaWeight priceCriteriaAHPMethods(double criteria,PriorityData[] priorityData, int numberOfBooks) {
        double[][] priceCriteriaAHPMatrix = new double[3][3];


        int i, j;
        priceCounter  = ahpSubCriteriaProcess.priceCriteriaCalculationMethods(priorityData,numberOfBooks);



        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(priceCriteriaAHPMatrix[i][j]);

            }
            System.out.println();
        }

        System.out.println("Main Problem :::::: ");
        for (i = 0; i < 3; i++) {
            for (j = i + 1; j < 3; j++) {

                priceCriteriaAHPMatrix[i][j] = priceCounter[i]/priceCounter[j];


                System.out.println(priceCriteriaAHPMatrix[i][j]);

            }
        }


         for (i = 0; i < 3; i++) {
            for (j = i + 1; j < 3; j++) {

                priceCriteriaAHPMatrix[j][i] = Math.pow(priceCriteriaAHPMatrix[i][j], -1);
                System.out.println(priceCriteriaAHPMatrix[j][i]);

            }
        }

        for (i = 0; i < 3; i++) {

            priceCriteriaAHPMatrix[i][i] = 1.00;
        }



        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(priceCriteriaAHPMatrix[i][j]);

            }
            System.out.println();
        }


        double[] summationMatrix = new double[3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                summationMatrix[i] = summationMatrix[i] + priceCriteriaAHPMatrix[i][j];
                System.out.println("Summation Matrix "+"["+i+"]"+"["+j+"]"+":");
                System.out.println(summationMatrix[i]);



            }



        }


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                priceCriteriaAHPMatrix[i][j] = priceCriteriaAHPMatrix[i][j] / summationMatrix[i];
                System.out.println("Price Criteria AHP : ");
                System.out.println(priceCriteriaAHPMatrix[i][j]);
            }
        }
        double[] priceWeightMatrix = new double[3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                priceWeightMatrix[i] = priceWeightMatrix[i] + priceCriteriaAHPMatrix[j][i];
                System.out.println("Price Weight Matrix : ");
                System.out.println(priceWeightMatrix[i]);

            }
            priceWeightMatrix[i] = priceWeightMatrix[i] / 3;
        }

        for (i = 0; i < 3; i++) {

        priceWeightMatrix[i]  =  priceWeightMatrix[i]*criteria;
            System.out.println("Price Weight Matrix 2 : ");
            System.out.println(priceWeightMatrix[i]);

        }

         ahPcriteriaWeight = new AHPcriteriaWeight(priceWeightMatrix[0],
                priceWeightMatrix[1],priceWeightMatrix[2]);

        System.out.println(ahPcriteriaWeight.highPrice+"---------->  ahPcriteriaWeight.highPrice");
        System.out.println(ahPcriteriaWeight.mediumPrice+"---------->  ahPcriteriaWeight.mediumPrice");
        System.out.println(ahPcriteriaWeight.lowPrice+"---------->  ahPcriteriaWeight.lowPrice");
       return ahPcriteriaWeight;
    }
}
