package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class TypeCriteriaAHP {
    public void typeCriteriaAHPMethods(PriorityData[] priorityData, int numberOfBooks) {
        double[][] typeCriteriaAHPMatrix = new double[6][6];


        int i, j;
int priority=1;
        for (i = 0; i < 6; i++) {
            for (j = i + 1; j < 6; j++) {
                typeCriteriaAHPMatrix[i][j] = priority;

                priority++;
                System.out.println(typeCriteriaAHPMatrix[i][j]);
            }
        }

        for (i = 0; i < 6; i++) {
            for (j = i + 1; j < 6; j++) {

              /*  AHPMatrix[i][j]=(i+j);
                AHPMatrix[j][i]=1.0/(i+j);
                AHPMatrix[j][i]=   Math.round(AHPMatrix[j][i] * 100.0) / 100.0;*/


                typeCriteriaAHPMatrix[j][i] = Math.pow(typeCriteriaAHPMatrix[i][j], -1);
                typeCriteriaAHPMatrix[j][i] = Math.round(typeCriteriaAHPMatrix[j][i] * 100.0) / 100.0;
            }
        }
        for (i = 0; i < 6; i++) {


            typeCriteriaAHPMatrix[i][i] = (1);


        }

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {

                System.out.print(typeCriteriaAHPMatrix[i][j] + "  ");
            }
            System.out.println();

        }
        double[] summationMatrix = new double[6];

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {

                summationMatrix[i] = summationMatrix[i] + typeCriteriaAHPMatrix[i][j];
            }
        }

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {

                typeCriteriaAHPMatrix[i][j] = typeCriteriaAHPMatrix[i][j] / summationMatrix[i];
            }
        }
        double[] typeWeightMatrix = new double[6];

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {

                typeWeightMatrix[i] = typeWeightMatrix[i] + typeCriteriaAHPMatrix[j][i];

            }
            typeWeightMatrix[i] = typeWeightMatrix[i] / 6;
        }
        for (i = 0; i < 6; i++) {

            System.out.print(typeWeightMatrix[i] + "  ");
        }

        AHPcriteriaWeight ahPcriteriaWeight = new AHPcriteriaWeight(typeWeightMatrix[0],
                typeWeightMatrix[1],typeWeightMatrix[2],typeWeightMatrix[3],typeWeightMatrix[4]);
    }
}
