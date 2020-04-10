package AHPalgorithm;

import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;

public class AHPprocessImplementation {
    AHPcriteriaWeight ahPcriteriaWeight;
    CountCriteriaAHP countCriteriaAHP;
    public void  ahpProcessImplementationMethods(PriorityData [] priorityData,int numberOfBooks){



        int iterator1;

        for(iterator1=0;iterator1<numberOfBooks;iterator1++){
            if(priorityData[iterator1].borrowPriority<=10){

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.lowlyDemand;
            }

            else if(priorityData[iterator1].borrowPriority<=20){

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.lowMediumDemand;
            } else if(priorityData[iterator1].borrowPriority<=30){

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.highMediumDemand;
            } else if(priorityData[iterator1].borrowPriority<=40){

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.highlyDemand;
            }


        }

    }
}
