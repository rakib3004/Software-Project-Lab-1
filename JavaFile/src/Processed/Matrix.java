package Processed;

import ObjectOriented.PriorityData;

public class Matrix {

    int i;
double [][] matrix = new double[3][3];

double determinantT,determinantX,determinantY,determinantZ;

double betaZero,betaOne,betaTwo,betaThree;

MatrixDeterminant matrixDeterminant = new MatrixDeterminant();
CalculateWeight calculateWeight = new CalculateWeight();

    public void evaluateMatrix(double [] a_array , double [] b_array , double [] c_array, double [] d_array, PriorityData[] priorityData, int numberOfBooks, double y_mean){


for (i=0;i<3;i++){
    matrix[i][0] = a_array[i];
}

for (i=0;i<3;i++){
    matrix[i][1] = b_array[i];
}

for (i=0;i<3;i++){
    matrix[i][2] = c_array[i];
}

determinantT=matrixDeterminant.calculateDeterminant(matrix);

        for (i=0;i<3;i++){
            matrix[i][0] = d_array[i];
        }

        determinantX=matrixDeterminant.calculateDeterminant(matrix);
        for (i=0;i<3;i++){
            matrix[i][0] = a_array[i];
        }


        for (i=0;i<3;i++){
            matrix[i][1] = d_array[i];
        }
        determinantY=matrixDeterminant.calculateDeterminant(matrix);
        for (i=0;i<3;i++){
            matrix[i][1] = b_array[i];
        }

        for (i=0;i<3;i++){
            matrix[i][2] = d_array[i];
        }
        determinantZ=matrixDeterminant.calculateDeterminant(matrix);
        for (i=0;i<3;i++){
            matrix[i][2] = c_array[i];
        }

betaOne = determinantT/determinantX;
betaTwo = determinantT/determinantY;
betaThree = determinantT/determinantZ;
betaZero  = y_mean - betaOne - betaTwo - betaThree;
calculateWeight.regressionResult(betaZero,betaOne,betaTwo,betaThree,priorityData,numberOfBooks);
        betaOne = Math.pow(betaOne,-1);
        betaTwo = Math.pow(betaTwo,-1);
        betaThree = Math.pow(betaThree,-1);
        calculateWeight.regressionResult(betaZero,betaOne,betaTwo,betaThree,priorityData,numberOfBooks);

      /*  System.out.println("###################################");

        System.out.print("######"); System.out.print("Alpha : "+betaOne);System.out.println("######");
        System.out.print("######");  System.out.print("Beta : "+betaTwo);System.out.println("######");
        System.out.print("######");  System.out.print("Gama : "+betaThree);System.out.println("######");
        System.out.println("###################################");*/

    }

}
