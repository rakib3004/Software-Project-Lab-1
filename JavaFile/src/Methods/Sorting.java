package Methods;

import ObjectOriented.BookData;
import ObjectOriented.GenericAlgo;
import ObjectOriented.PriorityData;

public class Sorting {

    int iterator;

    public void sortingMethods(PriorityData[] priorityData, int numberOfBooks){

        GenericAlgo genericAlgo[] = new GenericAlgo[632];

        for(iterator = 0; iterator <numberOfBooks; iterator++){
            genericAlgo[iterator] = new GenericAlgo(priorityData[iterator].getMLRweight(), iterator);
        }
        double temporary;
        int temp;
        for( iterator=0;iterator<numberOfBooks;iterator++){
            for(int jterator=0;jterator<numberOfBooks;jterator++){
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
        int start= 20;
     //   Scanner scanner = new Scanner(System.in);
      //  start =scanner.nextInt();
        //System.out.println("List of top "+start+" Risk Books :" );


       try {
           for (iterator = 0; iterator < numberOfBooks; iterator++) {
               System.out.println("Book Name :" + priorityData[genericAlgo[iterator].getIndex()].bookData.getBookName() +
                       "; Writer Name : " + priorityData[genericAlgo[iterator].getIndex()].bookData.getWriterName()
                       + "; Weight : " + genericAlgo[iterator].getWeight()+" ID : "+priorityData[genericAlgo[iterator].getIndex()].bookData.getBookId());
           }

       }
       catch (NullPointerException nullPointerException){
           System.out.println("Null Pointer Exception");
       }

    }
}