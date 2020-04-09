package AHPalgorithm;

import ObjectOriented.PriorityData;
import Regression.newVersion.*;


public class AHPcalculation {
    TypeCountRegression typeCountRegression = new TypeCountRegression();
    TypeMonthRegression typeMonthRegression = new TypeMonthRegression();
    TypePriceRegression typePriceRegression = new TypePriceRegression();
    CountMonthRegression countMonthRegression = new CountMonthRegression();
    CountPriceRegression countPriceRegression = new CountPriceRegression();
    MonthPriceRegression  monthPriceRegression = new MonthPriceRegression();

    public void AHPcalculationMethods(PriorityData[] priorityData, int numberOfBooks){
        double [][] AHPMatrix = new double [4] [4];


        int i,j;
        AHPMatrix[0][1] = typeCountRegression.typeCountRegressionMethods(priorityData,numberOfBooks);
        AHPMatrix[0][2] = typeMonthRegression.typeMonthRegressionMethods(priorityData,numberOfBooks);
        AHPMatrix[0][3] = typePriceRegression.typePriceRegressionMethods(priorityData,numberOfBooks);
        AHPMatrix[1][2] = countMonthRegression.countMonthRegressionMethods(priorityData,numberOfBooks);
        AHPMatrix[1][3] = countPriceRegression.countPriceRegressionMethods(priorityData,numberOfBooks);
        AHPMatrix[2][3] = monthPriceRegression.monthPriceRegressionMethods(priorityData,numberOfBooks);


        for(i=0;i<4;i++){
            for(j=i+1;j<4;j++){
                AHPMatrix[i][j]=Math.abs(AHPMatrix[i][j]);
                System.out.println(AHPMatrix[i][j]);
            }
        }

        for(i=0;i<4;i++){
            for(j=i+1;j<4;j++){

              /*  AHPMatrix[i][j]=(i+j);
                AHPMatrix[j][i]=1.0/(i+j);
                AHPMatrix[j][i]=   Math.round(AHPMatrix[j][i] * 100.0) / 100.0;*/


                AHPMatrix[j][i]=Math.pow(AHPMatrix[i][j],-1);
                AHPMatrix[j][i]=   Math.round(AHPMatrix[j][i] * 100.0) / 100.0;
            }
        }
        for(i=0;i<4;i++){


                AHPMatrix[i][i]=(1);


        }

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){

                System.out.print(AHPMatrix[i][j]+"  ");
            }
            System.out.println();

        }
        double [] summationMatrix = new double[4];

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){

                summationMatrix[i]= summationMatrix[i] +AHPMatrix[i][j];
            }
        }

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){

                AHPMatrix[i][j] = AHPMatrix[i][j]/summationMatrix[i];
            }
        }
        double [] weightMatrix = new double[4];

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){

weightMatrix[i] = weightMatrix[i] + AHPMatrix[j][i];

            }
            weightMatrix[i] = weightMatrix[i]/4;
        }
        for(i=0;i<4;i++){

            System.out.print(weightMatrix[i] +"  ");
        }

    }
}
