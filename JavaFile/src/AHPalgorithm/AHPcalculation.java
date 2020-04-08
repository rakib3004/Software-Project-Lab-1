package AHPalgorithm;

public class AHPcalculation {

    public void AHPcalculationMethods(){
        double [][] AHPMatrix = new double [4] [4];


        int i,j;

        for(i=0;i<4;i++){
            for(j=i+1;j<4;j++){

                AHPMatrix[i][j]=(i+j);
                AHPMatrix[j][i]=1.0/(i+j);
                AHPMatrix[j][i]=   Math.round(AHPMatrix[j][i] * 100.0) / 100.0;

             /*
                AHPMatrix[j][i]=AHPMatrix[i][j];
                AHPMatrix[j][i]=   Math.round(AHPMatrix[j][i] * 100.0) / 100.0;*/
            }
        }
        for(i=0;i<4;i++){


                AHPMatrix[i][i]=(1);


        }

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){

                System.out.print(AHPMatrix[i][j]+"  ");
            }
            System.out.println();

        }


        double [] summationMatrix = new double[4];

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){

                summationMatrix[i]= summationMatrix[i] +AHPMatrix[i][j];
            }
        }

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){

                AHPMatrix[i][j] = AHPMatrix[i][j]/summationMatrix[i];
            }
        }
        double [] weightMatrix = new double[4];

        for(i=0;i<4;i++){
            for(j=0;j<4;j++){

weightMatrix[i] = weightMatrix[i] + AHPMatrix[j][i];

            }
            weightMatrix[i] = weightMatrix[i]/4;
        }
        for(i=0;i<4;i++){

            System.out.print(weightMatrix[i] +"  ");
        }

    }
}
