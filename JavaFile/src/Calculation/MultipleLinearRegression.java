package Calculation;

import Processed.Matrix;
import ObjectOriented.PriorityData;

public class MultipleLinearRegression {

/*

d1 = a1X + b1Y + c1Z
d2 = a2X + b2Y + c2Z
d3 = a3X + b3Y + c3Z
 */
double a1,a2,a3;
double b1,b2,b3;
double c1,c2,c3;
double d1,d2,d3;
int i;


    double [] a_array = new double[3];
double [] b_array = new double[3];
double [] c_array = new double[3];
double [] d_array = new double[3];
double y_mean;
Matrix matrix = new Matrix();


 public void multipleLinearRegressionMethods(PriorityData[] priorityData, int numberOfBooks ){

     for(i=0;i<numberOfBooks;i++){
         y_mean = y_mean + priorityData[i].bookPriority;
     }
     y_mean = y_mean/numberOfBooks;
for(i=0;i<numberOfBooks;i++){
 d1 = d1 + (priorityData[i].bookPriority*priorityData[i].borrowPriority);
}
for(i=0;i<numberOfBooks;i++){
 d2 = d2 + (priorityData[i].bookPriority*priorityData[i].timePriority);
}
for(i=0;i<numberOfBooks;i++){
 d3 = d3 + (priorityData[i].bookPriority*priorityData[i].pricePriority);
}


  for(i=0;i<numberOfBooks;i++){
   a1 = a1 + (priorityData[i].borrowPriority*priorityData[i].borrowPriority);
  }for(i=0;i<numberOfBooks;i++){
   b1 = b1 + (priorityData[i].timePriority*priorityData[i].borrowPriority);
  }for(i=0;i<numberOfBooks;i++){
   c1 = c1 + (priorityData[i].pricePriority*priorityData[i].borrowPriority);
  }




for(i=0;i<numberOfBooks;i++){
   a2 = a2 + (priorityData[i].borrowPriority*priorityData[i].timePriority);
  }for(i=0;i<numberOfBooks;i++){
   b2 = b2 + (priorityData[i].timePriority*priorityData[i].timePriority);
  }for(i=0;i<numberOfBooks;i++){
   c2 = c2 + (priorityData[i].pricePriority*priorityData[i].timePriority);
  }

for(i=0;i<numberOfBooks;i++){
   a3 = a3 + (priorityData[i].borrowPriority*priorityData[i].pricePriority);
  }for(i=0;i<numberOfBooks;i++){
   b3 = b3 + (priorityData[i].timePriority*priorityData[i].pricePriority);
  }for(i=0;i<numberOfBooks;i++){
   c3 = c3 + (priorityData[i].pricePriority*priorityData[i].pricePriority);
  }

  a_array[0] = a1;
  a_array[1] = a2;
  a_array[2] = a3;
  
  b_array[0] = b1;
  b_array[1] = b2;
  b_array[2] = b3;

  c_array[0] = c1;
  c_array[1] = c2;
  c_array[2] = c3;

  d_array[0] = d1;
  d_array[1] = d2;
  d_array[2] = d3;


matrix.evaluateMatrix(a_array,b_array,c_array,d_array,priorityData,numberOfBooks,y_mean);
//,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3;

 }
}