package Calculation;

import ObjectOriented.PriorityData;
import Regression.*;

public class SimpleStatistics {
    TotalRegression totalRegression = new TotalRegression();
   TypeCountRegression typeCountRegression = new TypeCountRegression();
   MonthCountRegression monthCountRegression = new MonthCountRegression();
   PriceCountRegression priceCountRegression = new PriceCountRegression();
   TypePriceRegression typePriceRegression = new TypePriceRegression();
   CountPriceRegression countPriceRegression = new CountPriceRegression();
   CountTypeRegression countTypeRegression = new CountTypeRegression();
   CountMonthRegression countMonthRegression = new CountMonthRegression();
   PriceTypeRegression priceTypeRegression = new PriceTypeRegression();

    public void regressionProcess(double[] bookPriority, double[] timePriority,
                                  double[] borrowPriority, double[]pricePriority,
                                  int numberOfBooks, PriorityData[] priorityData){


    }


}
