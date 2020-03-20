package MainPackage;

import ObjectOriented.PriorityData;

public class ResultClass {

    public void sortingProcess(PriorityData[] priorityData, int numberOfBooks){


        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(i+"->->->->->"+priorityData[i].getBookPriority()+">>>>>>"+priorityData[i].bookData.bookName);
            System.out.println();
        }
        double temporary;
        int temp;
        PriorityData tempData ;
        for(int i=0;i<numberOfBooks;i++){
            for(int j=0;j<numberOfBooks;j++){
                if(priorityData[i].getBookPriority()>priorityData[j].getBookPriority()){

                tempData =priorityData[i];
                priorityData[i] = priorityData[j];
                priorityData[j] = tempData;
                }
            }
        }

optimizedResult(priorityData,numberOfBooks);
    }

    public void optimizedResult(PriorityData[] priorityData,int numberOfBooks){
        int start= 20;

       try {
            for (int i = 0; i < numberOfBooks; i++) {
                System.out.println(i+"_____M R :"+priorityData[i].getBookPriority()+">>>>>>"+priorityData[i].bookData.bookName);
            }

        }
        catch (NullPointerException nullPointerException){
            System.out.println("Null Pointer Exception");
        }


    }
}
