package DataComparing;

import FilePackage.DateTimeWriter;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class PredictionSector {
    PriorityData[] priorityData,priorityDataCV;
    TestingSector testingSector  = new TestingSector();

    AHPcriteriaWeight ahPcriteriaWeight;
    public PriorityData [] predictionSectorMethods(double [] priceGroupWeight,double [] timeGroupWeight,
                                        double [] countGroupWeight,double [] typeGroupWeight){

     /*   ahPcriteriaWeight = new AHPcriteriaWeight(priceGroupWeight[0],
                priceGroupWeight[1],priceGroupWeight[2]);


        ahPcriteriaWeight = new AHPcriteriaWeight(timeGroupWeight[0],timeGroupWeight[1],
                timeGroupWeight[2],timeGroupWeight[3],timeGroupWeight[4]);

        ahPcriteriaWeight = new AHPcriteriaWeight(countGroupWeight[0],countGroupWeight[1],
                countGroupWeight[2],countGroupWeight[3]);

        ahPcriteriaWeight = new AHPcriteriaWeight(typeGroupWeight[0],
                typeGroupWeight[1],typeGroupWeight[2],typeGroupWeight[3],typeGroupWeight[4],typeGroupWeight[5]);
        */
        // Combined section for constructor;

        String  className = this.getClass().getSimpleName();
        DateTimeWriter dateTimeWriter =  new DateTimeWriter();
        dateTimeWriter.dateTimeWriterMethods(className);

        ahPcriteriaWeight = new AHPcriteriaWeight(priceGroupWeight[0],
                priceGroupWeight[1],priceGroupWeight[2],countGroupWeight[0],countGroupWeight[1],
                countGroupWeight[2],countGroupWeight[3],timeGroupWeight[0],timeGroupWeight[1],
                timeGroupWeight[2],timeGroupWeight[3],timeGroupWeight[4],typeGroupWeight[0],
                typeGroupWeight[1],typeGroupWeight[2],typeGroupWeight[3],typeGroupWeight[4],typeGroupWeight[5]);


int iterator;
        System.out.println("priceGroupWeight :");

        for(iterator=0;iterator<3;iterator++){

            System.out.println(priceGroupWeight[iterator]);
        }

                System.out.println("timeGroupWeight :");

        for(iterator=0;iterator<5;iterator++){

            System.out.println(timeGroupWeight[iterator]);
        }

                System.out.println("countGroupWeight :");

        for(iterator=0;iterator<4;iterator++){

            System.out.println(countGroupWeight[iterator]);
        }

                System.out.println("typeGroupWeight :");

        for(iterator=0;iterator<6;iterator++){

            System.out.println(typeGroupWeight[iterator]);
        }


priorityDataCV = testingSector.testingSectorMethods(ahPcriteriaWeight);
        return priorityDataCV;

    }
}
