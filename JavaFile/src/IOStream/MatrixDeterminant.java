package IOStream;

public class MatrixDeterminant {
double determinant;
int i;
   public double calculateDeterminant(double [][] a){

       for(i=0;i<3;i++) {
           determinant = determinant + (a[0][i] * (a[1][(i + 1) % 3] * a[2][(i + 2) % 3] - a[1][(i + 2) % 3] * a[2][(i + 1) % 3]));
       }


       return determinant;
    }
}
