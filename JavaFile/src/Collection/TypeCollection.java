package Collection;

import ObjectOriented.PriorityData;
import Processed.MedianCalculation;

import java.util.*;

public class TypeCollection {
    MedianCalculation medianCalculation = new MedianCalculation();

    public void typeCollectionMethods(PriorityData[] priorityData, int numberOfBooks){
        Set<String> typeId = new HashSet<>();
        int i;

        for(i=0;i<numberOfBooks;i++){

            typeId.add(priorityData[i].bookData.bookId.substring(0,2));

        }
        int size = typeId.size();
//int [][] array = new int[size][];
int j=0;

        int number;
        Iterator<String> iterator = typeId.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();

            int count =0;

            List<Double> list = new ArrayList<>();


            number =0;
          //  System.out.println("##########Books of \""+element+"\" ############");
            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.bookId.substring(0,2).equals(element)){
                    System.out.println(count+" . "+priorityData[i].bookData.bookName);
                    list.add(priorityData[i].weight);

                    number++;
                    count++;
                }

            }
            double summation=0;

            int sizeB = list.size();
            if(sizeB>7){

                medianCalculation.medianCalculationMethods(list);


            }

            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.bookId.substring(0,2).equals(element)){
                    summation = summation + priorityData[i].weight;

                    //   System.out.println(number+" . "+priorityData[i].bookData.bookName);
                }

            }
            double mean = summation/number;


            double standard_deviation=0.0;

            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.bookId.substring(0,2).equals(element)){

                    standard_deviation = standard_deviation + ((mean-priorityData[i].weight)*
                            (mean-priorityData[i].weight));

                }

            }

            standard_deviation = standard_deviation/(number);
            standard_deviation = Math.sqrt(standard_deviation);
            System.out.println("Mean : "+mean+"    "+"Standard Deviation : "+standard_deviation);

        }


    }
}
