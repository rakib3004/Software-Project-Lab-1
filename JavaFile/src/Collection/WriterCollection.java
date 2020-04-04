package Collection;

import ObjectOriented.PriorityData;
import Processed.MedianCalculation;

import java.util.*;

public class WriterCollection {
    MedianCalculation medianCalculation = new MedianCalculation();

    public  void writerCollectionMethods(PriorityData[] priorityData, int numberOfBooks){

        Set<String> writerId = new HashSet<>();
        int i;

        for(i=0;i<numberOfBooks;i++){

            writerId.add(priorityData[i].bookData.writerName);

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
            for(i=0;i<numberOfBooks;i++){
                if(priorityData[i].bookData.writerName.equals(element)){
                    System.out.println(number+" . "+priorityData[i].bookData.bookName);
                    list.add(priorityData[i].weight);

                    number++;
                    count++;

                }

            }

            int sizeB = list.size();
            if(sizeB>7){

                medianCalculation.medianCalculationMethods(list);


            }




            double summation=0.0;


            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.writerName.equals(element)){
                    summation = summation + priorityData[i].weight;

                    //   System.out.println(number+" . "+priorityData[i].bookData.bookName);
                }

            }
            double mean = summation/number;


            double standard_deviation=0.0;

            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.writerName.equals(element)){

                    standard_deviation = standard_deviation + ((mean-priorityData[i].weight)*
                            (mean-priorityData[i].weight));

                }

            }

            standard_deviation = standard_deviation/(number-1);
            standard_deviation = Math.sqrt(standard_deviation);
            System.out.println("Mean : "+mean+"    "+"Standard Deviation : "+standard_deviation);



        }

    }

}
