package IOStream;

public class RankExpose {
    public void statitics1(BookData [] bookData, int numberOfBooks,double [] dataMean){
int i,j;
double [] s_d_rank = new double[numberOfBooks];
double compare[][] = new  double[numberOfBooks][9];

for(i=0;i<numberOfBooks;i++){
    for(j=0;j<9;j++){
        s_d_rank[i] = s_d_rank[i] + (dataMean[i]-bookData[i].rank[j]);

    }

    s_d_rank[i] = (s_d_rank[i]/(9-1));
    s_d_rank[i] = Math.sqrt(s_d_rank[i]);

}

        for(i=0;i<numberOfBooks;i++) {
            for (j = 0; j < 9; j++) {
compare[i][j] =  (bookData[i].rank[j]/dataMean[i])*100;
if(compare[i][j]>100){
   compare[i][j] = 200 - compare[i][j];
}

            }

            System.out.println("Boook No : "+(i+1)+" ,Book Name : "+bookData[i].bookName+" ,");
            for (j = 0; j < 9; j++) {
                System.out.println("Rank "+(j+1)+" Accuracy : "+compare[i][j]+"%\t");
            }

            }


        for(i=0;i<9;i++){
            System.out.println("Rank "+(i+1)+"Analysis :\n");
            for(j=0;j<numberOfBooks;j++){
                System.out.println("Book No : "+(j+1)+", Book Name :"+bookData[i].bookName+" "+compare[j][i]+" %\n");
            }
        }

        }
    }

