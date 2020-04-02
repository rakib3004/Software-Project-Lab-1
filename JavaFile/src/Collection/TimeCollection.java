package Collection;

import ObjectOriented.PriorityData;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TimeCollection {
    public void timeCollectionMethods(PriorityData[] priorityData, int numberOfBooks){


        Set<String> monthID = new HashSet<>();
        int i;

        for(i=0;i<numberOfBooks;i++){

            monthID.add(priorityData[i].bookData.bookId.substring(3,6));

        }





        int number=0;
        int writerCount=0;
        Iterator<String> iterator = monthID.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();

            int count =0;

            number =1;
            writerCount++;



            System.out.println("##########Books issu in :  \""+element.substring(0,2)+" - "+element.substring(1,3)+"\" #########("+writerCount+")###");
            for(i=0;i<numberOfBooks;i++){
                if(priorityData[i].bookData.bookId.substring(3,6).equals(element)){
                    System.out.println(number+" . "+priorityData[i].bookData.bookName);
                    number++;
                    count++;

                }

            }


            double summation=0.0;


            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.bookId.substring(3,6).equals(element)){
                    summation = summation + priorityData[i].weight;

                    //   System.out.println(number+" . "+priorityData[i].bookData.bookName);
                }

            }
            double mean = summation/number;


            double standard_deviation=0.0;

            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.bookId.substring(3,6).equals(element)){

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
