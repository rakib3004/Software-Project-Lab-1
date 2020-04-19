package Collection;

import ObjectOriented.PriorityData;
import Processed.MedianCalculation;

import java.util.*;

public class TypeCollection {
    MedianCalculation medianCalculation = new MedianCalculation();

    public void typeCollectionMethods(PriorityData[] priorityData, int numberOfBooks){
        Set<String> typeId = new HashSet<>();
        int iterator1;

        for(iterator1=0;iterator1<numberOfBooks;iterator1++){

            typeId.add(priorityData[iterator1].bookData.bookId.substring(0,2));

        }
        int size = typeId.size();
//int [][] array = new int[size][];

        int number;
        Iterator<String> iterator = typeId.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();

            int count =0;

            List<Double> list = new ArrayList<>();


            number =0;
          //  System.out.println("##########Books of \""+element+"\" ############");
            for(iterator1=0;iterator1<numberOfBooks;iterator1++){

                if(priorityData[iterator1].bookData.bookId.substring(0,2).equals(element)){
                    System.out.println(count+" . "+priorityData[iterator1].bookData.bookName);
                    list.add(priorityData[iterator1].weight);

                    number++;
                    count++;
                }

            }
            double summation=0;

            int sizeB = list.size();
            if(sizeB>7){

                medianCalculation.medianCalculationMethods(list);


            }

            for(iterator1=0;iterator1<numberOfBooks;iterator1++){

                if(priorityData[iterator1].bookData.bookId.substring(0,2).equals(element)){
                    summation = summation + priorityData[iterator1].weight;

                    //   System.out.println(number+" . "+priorityData[iterator1].bookData.bookName);
                }

            }
            double mean = summation/number;


            double standard_deviation=0.0;

            for(iterator1=0;iterator1<numberOfBooks;iterator1++){

                if(priorityData[iterator1].bookData.bookId.substring(0,2).equals(element)){

                    standard_deviation = standard_deviation + ((mean-priorityData[iterator1].weight)*
                            (mean-priorityData[iterator1].weight));

                }

            }

            standard_deviation = standard_deviation/(number);
            standard_deviation = Math.sqrt(standard_deviation);
            System.out.println("Mean : "+mean+"    "+"Standard Deviation : "+standard_deviation);

        }


    }
}
