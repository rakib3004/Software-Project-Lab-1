package IOStream;

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
 public void  loadData(double[] bookPriority,double[] timePriority,double[] borrowPriority,double[]pricePriority,int numberOfBooks){
for(i=0;i<numberOfBooks;i++){
 d1 = d1 + (bookPriority[i]*borrowPriority[i]);
}
for(i=0;i<numberOfBooks;i++){
 d2 = d2 + (bookPriority[i]*timePriority[i]);
}
for(i=0;i<numberOfBooks;i++){
 d3 = d3 + (bookPriority[i]*pricePriority[i]);
}


  for(i=0;i<numberOfBooks;i++){
   a1 = a1 + (borrowPriority[i]*borrowPriority[i]);
  }for(i=0;i<numberOfBooks;i++){
   b1 = b1 + (timePriority[i]*borrowPriority[i]);
  }for(i=0;i<numberOfBooks;i++){
   c1 = c1 + (pricePriority[i]*borrowPriority[i]);
  }

for(i=0;i<numberOfBooks;i++){
   a2 = a2 + (borrowPriority[i]*timePriority[i]);
  }for(i=0;i<numberOfBooks;i++){
   b2 = b2 + (timePriority[i]*timePriority[i]);
  }for(i=0;i<numberOfBooks;i++){
   c2 = c2 + (pricePriority[i]*timePriority[i]);
  }

for(i=0;i<numberOfBooks;i++){
   a3 = a3 + (borrowPriority[i]*pricePriority[i]);
  }for(i=0;i<numberOfBooks;i++){
   b3 = b3 + (timePriority[i]*pricePriority[i]);
  }for(i=0;i<numberOfBooks;i++){
   c3 = c3 + (pricePriority[i]*pricePriority[i]);
  }


 }
}