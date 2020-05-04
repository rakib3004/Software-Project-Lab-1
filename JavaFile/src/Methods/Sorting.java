package Methods;

import ObjectOriented.BookData;
import ObjectOriented.GenericAlgo;
import ObjectOriented.PriorityData;

public class Sorting {

    int iterator;
    GenericAlgo genericAlgo[] = new GenericAlgo[1050];

    public GenericAlgo[] sortingMLRmethods(PriorityData[] priorityData, int numberOfBooks){



        for(iterator = 0; iterator <numberOfBooks; iterator++){
            genericAlgo[iterator] = new GenericAlgo(priorityData[iterator].getMLRweight(), iterator);
        }
        double temporary;
        int temp;
        for( iterator=0;iterator<numberOfBooks;iterator++){
            for(int jterator=iterator+1;jterator<numberOfBooks;jterator++){
                if(genericAlgo[iterator].getWeight()>genericAlgo[jterator].getWeight()){
                    temporary= genericAlgo[iterator].getWeight();
                    genericAlgo[iterator].setWeight(genericAlgo[jterator].getWeight());
                    genericAlgo[jterator].setWeight(temporary);
                    temp = genericAlgo[iterator].getIndex();
                    genericAlgo[iterator].setIndex(genericAlgo[jterator].getIndex());
                    genericAlgo[jterator].setIndex(temp);
                }
            }
        }

  return genericAlgo;


    }

    public GenericAlgo[] sortingAHPmethods(PriorityData[] priorityData, int numberOfBooks){

        GenericAlgo genericAlgo[] = new GenericAlgo[632];

        for(iterator = 0; iterator <numberOfBooks; iterator++){
            genericAlgo[iterator] = new GenericAlgo(priorityData[iterator].getAHPweight(), iterator);
        }
        double temporary;
        int temp;
        for( iterator=0;iterator<numberOfBooks;iterator++){
            for(int jterator=iterator+1;jterator<numberOfBooks;jterator++){
                if(genericAlgo[iterator].getWeight()>genericAlgo[jterator].getWeight()){
                    temporary= genericAlgo[iterator].getWeight();
                    genericAlgo[iterator].setWeight(genericAlgo[jterator].getWeight());
                    genericAlgo[jterator].setWeight(temporary);
                    temp = genericAlgo[iterator].getIndex();
                    genericAlgo[iterator].setIndex(genericAlgo[jterator].getIndex());
                    genericAlgo[jterator].setIndex(temp);
                }
            }
        }


        return genericAlgo;

    }

    public GenericAlgo[] sortingPRAmethods(PriorityData[] priorityData, int numberOfBooks){

        GenericAlgo genericAlgo[] = new GenericAlgo[632];

        for(iterator = 0; iterator <numberOfBooks; iterator++){
            genericAlgo[iterator] = new GenericAlgo(priorityData[iterator].getPRAweight(), iterator);
        }
        double temporary;
        int temp;
        for( iterator=0;iterator<numberOfBooks;iterator++){
            for(int jterator=iterator+1;jterator<numberOfBooks;jterator++){
                if(genericAlgo[iterator].getWeight()>genericAlgo[jterator].getWeight()){
                    temporary= genericAlgo[iterator].getWeight();
                    genericAlgo[iterator].setWeight(genericAlgo[jterator].getWeight());
                    genericAlgo[jterator].setWeight(temporary);
                    temp = genericAlgo[iterator].getIndex();
                    genericAlgo[iterator].setIndex(genericAlgo[jterator].getIndex());
                    genericAlgo[jterator].setIndex(temp);
                }
            }
        }

        return genericAlgo;

    }
}