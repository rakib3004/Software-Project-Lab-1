package Methods;

import ObjectOriented.BookData;
import ObjectOriented.GenericAlgo;

public class Sorting {

    int iterator;

    public void sortingMethods(BookData[] bookData, double [] weight, int numberOfBooks){

        GenericAlgo genericAlgo[] = new GenericAlgo[1050];
        for(iterator =0; iterator <numberOfBooks; iterator++){

            bookData[iterator].setWeight(weight[iterator]);
        }
        for(iterator = 0; iterator <numberOfBooks; iterator++){
            genericAlgo[iterator] = new GenericAlgo(bookData[iterator].getWeight(), iterator);
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
               System.out.println("Book Name :" + bookData[genericAlgo[iterator].getIndex()].getBookName() +
                       "; Writer Name : " + bookData[genericAlgo[iterator].getIndex()].getWriterName()
                       + "; Weight : " + genericAlgo[iterator].getWeight()+" ID : "+bookData[genericAlgo[iterator].getIndex()].getBookId());
           }

       }
       catch (NullPointerException nullPointerException){
           System.out.println("Null Pointer Exception");
       }

    }
}