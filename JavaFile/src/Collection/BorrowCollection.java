package Collection;

import ObjectOriented.PriorityData;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BorrowCollection {
    public void borrowCollectionMethods(PriorityData[] priorityData,int numberOfBooks){
        Set<String> borrowID = new HashSet<>();
        int i;

        for(i=0;i<numberOfBooks;i++){

            borrowID.add(priorityData[i].bookData.borrowCount);

        }

        System.out.println(borrowID.size());
        System.out.println();
        System.out.println();
        System.out.println();
        int number=0;
        int writerCount=0;
        Iterator<String> iterator = borrowID.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();

            int count =0;

            number =1;
            writerCount++;



            System.out.println("##########Books of \""+element+"\" #########("+writerCount+")###");
            for(i=0;i<numberOfBooks;i++){
                if(priorityData[i].bookData.borrowCount.equals(element)){
                    System.out.println(number+" . "+priorityData[i].bookData.bookName);

                    number++;
                    count++;

                }

            }


            double summation=0.0;


            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.borrowCount.equals(element)){
                    summation = summation + priorityData[i].weight;

                    //   System.out.println(number+" . "+priorityData[i].bookData.bookName);
                }

            }
            double mean = summation/number;


            double standard_deviation=0.0;

            for(i=0;i<numberOfBooks;i++){

                if(priorityData[i].bookData.borrowCount.equals(element)){

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
