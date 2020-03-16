package IOStream;

public class CalculateWeight {
    double optimizeValue;
    OutputSort outputSort = new OutputSort();
    public  void  regressionResult(double betaOne,double
            betaTwo,double betaThree,PriorityData[] priorityData,int numberOfBooks){

        int i;


            for(i=0;i<numberOfBooks;i++){
            optimizeValue = ((betaOne * priorityData[i].borrowPriority)+
                    (betaTwo * priorityData[i].timePriority)+(betaThree * priorityData[i].pricePriority));
            priorityData[i].setBookPriority(optimizeValue);
                System.out.println();
                System.out.println();
                System.out.println("Optimized Value :   ");
                System.out.println(optimizeValue);
                System.out.println();
                System.out.println();
        }
       outputSort.sortingProcess(priorityData,numberOfBooks);

    }
}
