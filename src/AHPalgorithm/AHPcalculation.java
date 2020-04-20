package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import Regression.newVersion.*;



public class AHPcalculation {
    AHPcriteriaWeight ahPcriteriaWeight;
    TypeCountRegression typeCountRegression = new TypeCountRegression();
    TypeMonthRegression typeMonthRegression = new TypeMonthRegression();
    TypePriceRegression typePriceRegression = new TypePriceRegression();
    CountMonthRegression countMonthRegression = new CountMonthRegression();
    CountPriceRegression countPriceRegression = new CountPriceRegression();
    MonthPriceRegression  monthPriceRegression = new MonthPriceRegression();

    AHPcriteriaWeight ahPcriteriaWeight4,ahPcriteriaWeight2,ahPcriteriaWeight3, ahPcriteriaWeight1;
    AHPprocessImplementation ahPprocessImplementation = new AHPprocessImplementation();
    TypeCriteriaAHP typeCriteriaAHP = new TypeCriteriaAHP();
    CountCriteriaAHP countCriteriaAHP = new CountCriteriaAHP();
    MonthCriteriaAHP monthCriteriaAHP = new MonthCriteriaAHP();
    PriceCriteriaAHP priceCriteriaAHP = new PriceCriteriaAHP();

    public AHPcriteriaWeight AHPcalculationMethods(PriorityData[] priorityData, int numberOfBooks){
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
            }
        }

        for(i=0;i<4;i++){
            for(j=i+1;j<4;j++){

                AHPMatrix[j][i]=Math.pow(AHPMatrix[i][j],-1);
            }
        }
        for(i=0;i<4;i++){

                AHPMatrix[i][i]=(1);

        }

//        for(i=0;i<4;i++){
//            for(j=0;j<4;j++){
//
//                System.out.print(AHPMatrix[i][j]+"  ");
//            }
//            System.out.println(); }



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


        ahPcriteriaWeight1 =    priceCriteriaAHP.priceCriteriaAHPMethods(weightMatrix[3],priorityData,numberOfBooks);
        ahPcriteriaWeight2=    countCriteriaAHP.countCriteriaAHPMethods(weightMatrix[1],priorityData,numberOfBooks);
         ahPcriteriaWeight3=   monthCriteriaAHP.monthCriteriaAHPMethods(weightMatrix[2],priorityData,numberOfBooks);
        ahPcriteriaWeight4 =    typeCriteriaAHP.typeCriteriaAHPMethods(weightMatrix[0],priorityData,numberOfBooks);



         ahPcriteriaWeight = new AHPcriteriaWeight(ahPcriteriaWeight1.highPrice, ahPcriteriaWeight1.mediumPrice,
                ahPcriteriaWeight1.lowPrice,ahPcriteriaWeight2.highlyDemand,
                ahPcriteriaWeight2.highMediumDemand,ahPcriteriaWeight2.lowMediumDemand,
                ahPcriteriaWeight2.lowlyDemand,ahPcriteriaWeight3.latestBook,
                ahPcriteriaWeight3.newlyBook,ahPcriteriaWeight3.recentlyOldBook
                ,ahPcriteriaWeight3.oldBook,ahPcriteriaWeight3.oldestBook,
                ahPcriteriaWeight4.uponnashType, ahPcriteriaWeight4.kobitaType,
                ahPcriteriaWeight4.scienceFictionType, ahPcriteriaWeight4.scienceFictionType,
                ahPcriteriaWeight4.kisorUponnashType, ahPcriteriaWeight4.othersType);


                return  ahPcriteriaWeight;

    }
}
