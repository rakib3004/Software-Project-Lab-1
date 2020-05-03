package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class MonthCriteriaAHP {
    AHPcriteriaWeight ahPcriteriaWeight;
    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    double [] monthCounter = new double[5];

    public AHPcriteriaWeight monthCriteriaAHPMethods(double criteria,PriorityData[] priorityData, int numberOfBooks) {
        double[][] monthCriterAHPMatrix = new double[5][5];

monthCounter = ahpSubCriteriaProcess.monthCriteriaCalculationMethods(priorityData,numberOfBooks);
        int iterator, j;

        int priority=1;

        for (iterator = 0; iterator < 5; iterator++) {
            for (j = iterator + 1; j < 5; j++) {
                monthCriterAHPMatrix[iterator][j] = (monthCounter[iterator]/monthCounter[j]);
            }
        }

        for (iterator = 0; iterator < 5; iterator++) {
            for (j = iterator + 1; j < 5; j++) {


                monthCriterAHPMatrix[j][iterator] = Math.pow(monthCriterAHPMatrix[iterator][j], -1);

            }
        }
        for (iterator = 0; iterator < 5; iterator++) {


            monthCriterAHPMatrix[iterator][iterator] = (1);


        }


        double[] summationMatrix = new double[5];

        for (iterator = 0; iterator < 5; iterator++) {
            for (j = 0; j < 5; j++) {

                summationMatrix[iterator] = summationMatrix[iterator] + monthCriterAHPMatrix[iterator][j];
            }
        }

        for (iterator = 0; iterator < 5; iterator++) {
            for (j = 0; j < 5; j++) {

                monthCriterAHPMatrix[iterator][j] = monthCriterAHPMatrix[iterator][j] / summationMatrix[iterator];
            }
        }
        double[] monthWeightMatrix = new double[5];

        for (iterator = 0; iterator < 5; iterator++) {
            for (j = 0; j < 5; j++) {

                monthWeightMatrix[iterator] = monthWeightMatrix[iterator] + monthCriterAHPMatrix[j][iterator];

            }
            monthWeightMatrix[iterator] = monthWeightMatrix[iterator] / 5;
        }

        for (iterator = 0; iterator < 5; iterator++) {

            monthWeightMatrix[iterator] =  monthWeightMatrix[iterator]*criteria;;
        }


         ahPcriteriaWeight = new AHPcriteriaWeight(monthWeightMatrix[0],monthWeightMatrix[1],
                monthWeightMatrix[2],monthWeightMatrix[3],monthWeightMatrix[4]);


        System.out.println(ahPcriteriaWeight.latestBook+"---------->  ahPcriteriaWeight.latestBook");
        System.out.println(ahPcriteriaWeight.newlyBook+"---------->  ahPcriteriaWeight.newlyBook");
        System.out.println(ahPcriteriaWeight.recentlyOldBook+"---------->  ahPcriteriaWeight.recentlyOldBook");
        System.out.println(ahPcriteriaWeight.oldBook+"---------->  ahPcriteriaWeight.oldBook");
        System.out.println(ahPcriteriaWeight.oldestBook+"---------->  ahPcriteriaWeight.oldestBook");
        System.out.println();
        return ahPcriteriaWeight;
    }
}