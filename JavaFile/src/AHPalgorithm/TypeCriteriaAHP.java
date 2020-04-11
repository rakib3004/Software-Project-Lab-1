package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class TypeCriteriaAHP {
    AHPcriteriaWeight ahPcriteriaWeight;
    public AHPcriteriaWeight typeCriteriaAHPMethods(double criteria,PriorityData[] priorityData, int numberOfBooks) {
        double[][] typeCriteriaAHPMatrix = new double[6][6];


        int i, j;
int priority=1;
        for (i = 0; i < 6; i++) {
            for (j = i + 1; j < 6; j++) {
                typeCriteriaAHPMatrix[i][j] = priority;

                priority++;
            }
        }

        for (i = 0; i < 6; i++) {
            for (j = i + 1; j < 6; j++) {



                typeCriteriaAHPMatrix[j][i] = Math.pow(typeCriteriaAHPMatrix[i][j], -1);
            }
        }
        for (i = 0; i < 6; i++) {


            typeCriteriaAHPMatrix[i][i] = (1);


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

   typeWeightMatrix[i]  =    typeWeightMatrix[i]*criteria;
        }



         ahPcriteriaWeight = new AHPcriteriaWeight(typeWeightMatrix[0],
                typeWeightMatrix[1],typeWeightMatrix[2],typeWeightMatrix[3],typeWeightMatrix[4],typeWeightMatrix[5]);



        System.out.println(ahPcriteriaWeight.uponnashType+"---------->  ahPcriteriaWeight.uponnashType");
        System.out.println(ahPcriteriaWeight.kobitaType+"---------->  ahPcriteriaWeight.kobitaType");
        System.out.println(ahPcriteriaWeight.kisorUponnashType+"---------->  ahPcriteriaWeight.kisorUponnashType");
        System.out.println(ahPcriteriaWeight.scienceFictionType+"---------->  ahPcriteriaWeight.scienceFictionType");
        System.out.println(ahPcriteriaWeight.religionType+"---------->  ahPcriteriaWeight.religionType");
        System.out.println(ahPcriteriaWeight.othersType+"---------->  ahPcriteriaWeight.othersType");
        return ahPcriteriaWeight;

    }
}
