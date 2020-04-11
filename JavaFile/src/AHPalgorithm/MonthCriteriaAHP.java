package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class MonthCriteriaAHP {
    AHPcriteriaWeight ahPcriteriaWeight;
    public AHPcriteriaWeight monthCriteriaAHPMethods(double criteria,PriorityData[] priorityData, int numberOfBooks) {
        double[][] monthCriterAHPMatrix = new double[5][5];


        int i, j;

        int priority=1;

        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                monthCriterAHPMatrix[i][j] = priority*(i+j);
priority = priority*(i+j);
            }
        }

        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {


                monthCriterAHPMatrix[j][i] = Math.pow(monthCriterAHPMatrix[i][j], -1);

            }
        }
        for (i = 0; i < 5; i++) {


            monthCriterAHPMatrix[i][i] = (1);


        }


        double[] summationMatrix = new double[5];

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {

                summationMatrix[i] = summationMatrix[i] + monthCriterAHPMatrix[i][j];
            }
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {

                monthCriterAHPMatrix[i][j] = monthCriterAHPMatrix[i][j] / summationMatrix[i];
            }
        }
        double[] monthWeightMatrix = new double[5];

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {

                monthWeightMatrix[i] = monthWeightMatrix[i] + monthCriterAHPMatrix[j][i];

            }
            monthWeightMatrix[i] = monthWeightMatrix[i] / 5;
        }

        for (i = 0; i < 5; i++) {

            monthWeightMatrix[i] =  monthWeightMatrix[i]*criteria;;
        }


         ahPcriteriaWeight = new AHPcriteriaWeight(monthWeightMatrix[0],monthWeightMatrix[1],
                monthWeightMatrix[2],monthWeightMatrix[3],monthWeightMatrix[4]);


        System.out.println(ahPcriteriaWeight.latestBook+"---------->  ahPcriteriaWeight.latestBook");
        System.out.println(ahPcriteriaWeight.newlyBook+"---------->  ahPcriteriaWeight.newlyBook");
        System.out.println(ahPcriteriaWeight.recentlyOldBook+"---------->  ahPcriteriaWeight.recentlyOldBook");
        System.out.println(ahPcriteriaWeight.oldBook+"---------->  ahPcriteriaWeight.oldBook");
        System.out.println(ahPcriteriaWeight.oldestBook+"---------->  ahPcriteriaWeight.oldestBook");
        return ahPcriteriaWeight;
    }
}