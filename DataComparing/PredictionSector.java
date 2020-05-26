package DataComparing;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class PredictionSector {
    PriorityData[] priorityData,priorityDataCV;

    AHPcriteriaWeight ahPcriteriaWeight;
    public PriorityData [] predictionSectorMethods(double [] priceGroupWeight,double [] timeGroupWeight,
                                        double [] countGroupWeight,double [] typeGroupWeight){

        ahPcriteriaWeight = new AHPcriteriaWeight(priceGroupWeight[0],
                priceGroupWeight[1],priceGroupWeight[2]);



        ahPcriteriaWeight = new AHPcriteriaWeight(timeGroupWeight[0],timeGroupWeight[1],
                timeGroupWeight[2],timeGroupWeight[3],timeGroupWeight[4]);

        ahPcriteriaWeight = new AHPcriteriaWeight(countGroupWeight[0],countGroupWeight[1],
                countGroupWeight[2],countGroupWeight[3]);

        ahPcriteriaWeight = new AHPcriteriaWeight(typeGroupWeight[0],
                typeGroupWeight[1],typeGroupWeight[2],typeGroupWeight[3],typeGroupWeight[4],typeGroupWeight[5]);

TestingSector testingSector  = new TestingSector();
priorityDataCV = testingSector.testingSectorMethods(ahPcriteriaWeight);
        return priorityDataCV;

    }
}
