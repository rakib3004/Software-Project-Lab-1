package IOStream;

import java.util.Scanner;

public class Sorting {

    int i;

    public void algorithm(BookData [] bookData,double [] weight,int numberOfBooks){

        GenericAlgo genericAlgo[] = new GenericAlgo[1050];
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(weight[i]);
        }
        for(int i = 0; i<numberOfBooks; i++){
            genericAlgo[i] = new GenericAlgo(bookData[i].getWeight(),i);
        }
        double temporary;
        int temp;
        for(int i=0;i<numberOfBooks;i++){
            for(int j=0;j<numberOfBooks;j++){
                if(genericAlgo[i].getWeight()>genericAlgo[j].getWeight()){
                    temporary= genericAlgo[i].getWeight();
                    genericAlgo[i].setWeight(genericAlgo[j].getWeight());
                    genericAlgo[j].setWeight(temporary);
                    temp = genericAlgo[i].getIndex();
                    genericAlgo[i].setIndex(genericAlgo[j].getIndex());
                    genericAlgo[j].setIndex(temp);
                }
            }
        }
        int start= 20;
     //   Scanner scanner = new Scanner(System.in);
      //  start =scanner.nextInt();
        System.out.println("List of top "+start+" Risk Books :" );


       try {
           for (int i = numberOfBooks-start; i < numberOfBooks; i++) {
               System.out.println("Book Name :" + bookData[genericAlgo[i].getIndex()].getBookName() +
                       "; Writer Name : " + bookData[genericAlgo[i].getIndex()].getWriterName()
                       + "; Weight : " + genericAlgo[i].getWeight());
           }

       }
       catch (NullPointerException nullPointerException){
           System.out.println("Null Pointer Exception");
       }

    }
}