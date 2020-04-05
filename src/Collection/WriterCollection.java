package Collection;

import ObjectOriented.PriorityData;
import Processed.MedianCalculation;

import java.util.*;

public class WriterCollection {
    MedianCalculation medianCalculation = new MedianCalculation();

    public  void writerCollectionMethods(PriorityData[] priorityData, int numberOfBooks){

        Set<String> writerId = new HashSet<>();
        int iterator1;

        for(iterator1=0;iterator1<numberOfBooks;iterator1++){

            writerId.add(priorityData[iterator1].bookData.writerName);

        }
/*


 */
        System.out.println(writerId.size());
        System.out.println();
        System.out.println();
        System.out.println();
int number=0;
int writerCount=0;
        Iterator<String> iterator = writerId.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();

            int count =0;

            number =1;
            writerCount++;


            List<Double> list = new ArrayList<>();


            System.out.println("##########Books of \""+element+"\" #########("+writerCount+")###");
            for(iterator1=0;iterator1<numberOfBooks;iterator1++){
                if(priorityData[iterator1].bookData.writerName.equals(element)){
                    System.out.println(number+" . "+priorityData[iterator1].bookData.bookName);
                    list.add(priorityData[iterator1].weight);

                    number++;
                    count++;

                }

            }

            int sizeB = list.size();
            if(sizeB>7){

                medianCalculation.medianCalculationMethods(list);


            }




            double summation=0.0;


            for(iterator1=0;iterator1<numberOfBooks;iterator1++){

                if(priorityData[iterator1].bookData.writerName.equals(element)){
                    summation = summation + priorityData[iterator1].weight;

                    //   System.out.println(number+" . "+priorityData[iterator1].bookData.bookName);
                }

            }
            double mean = summation/number;


            double standard_deviation=0.0;

            for(iterator1=0;iterator1<numberOfBooks;iterator1++){

                if(priorityData[iterator1].bookData.writerName.equals(element)){

                    standard_deviation = standard_deviation + ((mean-priorityData[iterator1].weight)*
                            (mean-priorityData[iterator1].weight));

                }

            }

            standard_deviation = standard_deviation/(number-1);
            standard_deviation = Math.sqrt(standard_deviation);
            System.out.println("Mean : "+mean+"    "+"Standard Deviation : "+standard_deviation);



        }

    }

}
