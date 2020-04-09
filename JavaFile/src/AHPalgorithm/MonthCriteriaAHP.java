package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class MonthCriteriaAHP {
    public void monthCriteriaAHPMethods(PriorityData[] priorityData, int numberOfBooks) {
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

              /*  AHPMatrix[i][j]=(i+j);
                AHPMatrix[j][i]=1.0/(i+j);
                AHPMatrix[j][i]=   Math.round(AHPMatrix[j][i] * 100.0) / 100.0;*/


                monthCriterAHPMatrix[j][i] = Math.pow(monthCriterAHPMatrix[i][j], -1);
                monthCriterAHPMatrix[j][i] = Math.round(monthCriterAHPMatrix[j][i] * 100.0) / 100.0;
            }
        }
        for (i = 0; i < 5; i++) {


            monthCriterAHPMatrix[i][i] = (1);


        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {

                System.out.print(monthCriterAHPMatrix[i][j] + "  ");
            }
            System.out.println();

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

            System.out.print(monthWeightMatrix[i] + "  ");
        }
        AHPcriteriaWeight ahPcriteriaWeight = new AHPcriteriaWeight(monthWeightMatrix[0],monthWeightMatrix[1],
                monthWeightMatrix[2],monthWeightMatrix[3],monthWeightMatrix[4]);
    }
}