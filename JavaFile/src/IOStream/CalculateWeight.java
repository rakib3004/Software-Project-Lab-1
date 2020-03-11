package IOStream;

public class CalculateWeight {
    double optimizeValue;
    public  void  regressionResult(double betaOne,double
            betaTwo,double betaThree,PriorityData[] priorityData,int numberOfBooks){

        int i;
        for(i=0;i<numberOfBooks;i++){
            optimizeValue = ((betaOne * priorityData[i].borrowPriority)+
                    (betaTwo * priorityData[i].timePriority)+(betaThree * priorityData[i].pricePriority));
            priorityData[i].setBookPriority(optimizeValue);
        }

    }
}
