package IOStream;

public class Matrix {

    int i;
double [][] matrix = new double[3][3];

double determinantT,determinantX,determinantY,determinantZ;

double betaOne,betaTwo,betaThree;

MatrixDeterminant matrixDeterminant = new MatrixDeterminant();
CalculateWeight calculateWeight = new CalculateWeight();

    public void evaluateMatrix(double [] a_array , double [] b_array , double [] c_array, double [] d_array,PriorityData [] priorityData,int numberOfBooks){


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

betaOne = determinantX/determinantT;
betaTwo = determinantY/determinantT;
betaThree = determinantZ/determinantT;
calculateWeight.regressionResult(betaOne,betaTwo,betaThree,priorityData,numberOfBooks);

    }

}
