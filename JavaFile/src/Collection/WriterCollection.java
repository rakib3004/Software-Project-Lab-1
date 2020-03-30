package Collection;

import ObjectOriented.PriorityData;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WriterCollection {
    public  void writerCollectionMethods(PriorityData[] priorityData, int numberOfBooks){

        Set<String> writerId = new HashSet<>();
        int i;

        for(i=0;i<numberOfBooks;i++){

            writerId.add(priorityData[i].bookData.writerName);

        }

        System.out.println(writerId.size());
        System.out.println();
        System.out.println();
        System.out.println();
int number=0;
int writerCount=0;
        Iterator<String> iterator = writerId.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            number =1;
            writerCount++;
            System.out.println("##########Books of \""+element+"\" #########("+writerCount+")###");
            for(i=0;i<numberOfBooks;i++){
                if(priorityData[i].bookData.writerName.equals(element)){
                    System.out.println(number+" . "+priorityData[i].bookData.bookName);
                            number++;
                }

            }


        }

    }

}
