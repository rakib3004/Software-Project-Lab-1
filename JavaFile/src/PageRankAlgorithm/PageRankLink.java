package PageRankAlgorithm;

import ObjectOriented.PriorityData;

public class PageRankLink {
    public double  pageRankLinkMethods(int index,PriorityData[] priorityData, int numberOfBooks){
int borrowLink,typeLink,writerLink,alphabetLink;
        double linkValue;

borrowLink = findBorrowLink(index,priorityData,numberOfBooks);
typeLink = findTypeLink(index,priorityData,numberOfBooks);
writerLink = findWriterLink(index,priorityData,numberOfBooks);
alphabetLink = findAlphabetLink(index,priorityData,numberOfBooks);
        linkValue  = Math.pow(Double.parseDouble(String.valueOf(borrowLink)),-1)+
                Math.pow(Double.parseDouble(String.valueOf(typeLink)),-1)+
                Math.pow(Double.parseDouble(String.valueOf(writerLink)),-1)+
                Math.pow(Double.parseDouble(String.valueOf(alphabetLink)),-1);

        return linkValue;

    }

    public int findBorrowLink(int index,PriorityData[] priorityData, int numberOfBooks){
        int countingBorrrow=0;
        return  countingBorrrow;
    }

public int findTypeLink(int index,PriorityData[] priorityData, int numberOfBooks){
    int countingType=0;
    return  countingType;

    }

public int findWriterLink(int index,PriorityData[] priorityData, int numberOfBooks){
    int countingWriter=0;
    return  countingWriter;

    }

public int findAlphabetLink(int index,PriorityData[] priorityData, int numberOfBooks){
    int countingAlphabet=0;
    return  countingAlphabet;

    }

}
