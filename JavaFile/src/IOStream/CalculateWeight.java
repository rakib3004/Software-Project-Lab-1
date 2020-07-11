package IOStream;

public class CalculateWeight {
    double optimizeValue;
    OutputSort outputSort = new OutputSort();
    public  void  regressionResult(double betaZero,double betaOne,double
            betaTwo,double betaThree,PriorityData[] priorityData,int numberOfBooks){

        int i;


            for(i=0;i<numberOfBooks;i++){
            optimizeValue = ((betaOne * priorityData[i].borrowPriority)+
                    (betaTwo * priorityData[i].timePriority)+(betaThree * priorityData[i].pricePriority));
                System.out.println("********* "+optimizeValue+" *********");


            priorityData[i].setBookPriority(optimizeValue);
            }

       outputSort.sortingProcess(priorityData,numberOfBooks);

    }
}
