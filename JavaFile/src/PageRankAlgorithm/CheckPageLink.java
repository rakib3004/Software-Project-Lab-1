package PageRankAlgorithm;

import ObjectOriented.PriorityData;

public class CheckPageLink {
    String  compareDataOne;
    String  compareDataTwo;
    public boolean checkPageLinkMethods(int index, int jIndex,PriorityData[] priorityData, int numberOfBooks){
        boolean linkPageBool = true;

        boolean borrowLinkBool,typeLinkBool,writerLinkBool,alphabetLinkBool;
        borrowLinkBool = checkBorrowLinkBool(index,jIndex,priorityData,numberOfBooks);
        typeLinkBool = checkTypeLinkBool(index,jIndex,priorityData,numberOfBooks);
        writerLinkBool = checkWriterLinkBool(index,jIndex,priorityData,numberOfBooks);
        alphabetLinkBool = checkAlphabetLinkBool(index,jIndex,priorityData,numberOfBooks);

        linkPageBool = (borrowLinkBool&&typeLinkBool&&writerLinkBool&&alphabetLinkBool);
        return linkPageBool;

    }

    public boolean checkBorrowLinkBool(int index,int jIndex,PriorityData[] priorityData, int numberOfBooks){
       compareDataOne = priorityData[index].bookData.borrowCount;
       compareDataTwo = priorityData[jIndex].bookData.borrowCount;

       if(compareDataOne.equals(compareDataTwo)){
           return  true;
       }
        else{
           return  false;

       }

    }
     public boolean checkTypeLinkBool(int index,int jIndex,PriorityData[] priorityData, int numberOfBooks){
         if(compareDataOne.equals(compareDataTwo)){
             return  true;
         }
         else{
             return  false;

         }
     }
     public boolean checkWriterLinkBool(int index,int jIndex,PriorityData[] priorityData, int numberOfBooks){
         if(compareDataOne.equals(compareDataTwo)){
             return  true;
         }
         else{
             return  false;

         }
     }
     public boolean checkAlphabetLinkBool(int index,int jIndex,PriorityData[] priorityData, int numberOfBooks){
         if(compareDataOne.equals(compareDataTwo)){
             return  true;
         }
         else{
             return  false;

         }
     }

}
