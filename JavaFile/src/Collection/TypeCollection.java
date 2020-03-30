package Collection;

import ObjectOriented.PriorityData;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TypeCollection {

    public void typeCollectionMethods(PriorityData[] priorityData, int numberOfBooks){
        Set<String> typeId = new HashSet<>();
        int i;

        for(i=0;i<numberOfBooks;i++){

            typeId.add(priorityData[i].bookData.bookId.substring(0,2));

        }
        System.out.println(typeId);
        System.out.println();
        System.out.println();
        System.out.println();
        int number=0;
        Iterator<String> iterator = typeId.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            number =1;
            System.out.println("##########Books of \""+element+"\" ############");
            for(i=0;i<numberOfBooks;i++){
                if(priorityData[i].bookData.bookId.substring(0,2).equals(element)){
                    System.out.println(number+" . "+priorityData[i].bookData.bookName);
                    number++;
                }

            }


        }


    }
}
