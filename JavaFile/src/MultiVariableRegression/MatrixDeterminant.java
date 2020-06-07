package MultiVariableRegression;

import FilePackage.DateTimeWriter;

public class MatrixDeterminant {
double determinant;
int iterator;
   public double calculateDeterminant(double [][] a){
       String  className = this.getClass().getSimpleName();
       DateTimeWriter dateTimeWriter =  new DateTimeWriter();
       dateTimeWriter.dateTimeWriterMethods(className);

       for(iterator =0; iterator <3; iterator++) {
           determinant = determinant + (a[0][iterator] * (a[1][(iterator + 1) % 3] * a[2][(iterator + 2) % 3] - a[1][(iterator + 2) % 3] * a[2][(iterator + 1) % 3]));
       }
       return determinant;
    }
}
