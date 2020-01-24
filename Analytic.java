package IOStream;

public class Analytic {
    public void analysis(BookData[] bookData){
        BookData bookData1 = new BookData();
        Processing processing = new Processing();

        int typeValue [] =new int[1050];
        int timeCount [] = new int[1050];
        int bookCount [] = new int [1050];
        int queueValue [] = new int [1050];
        int bookPrice [] =new int[1050];



        double bookPriority [] = new double[1050];
        double writePriority [] = new double[1050];
        double timePriority [] = new double [1050];
        int borrowCount [] = new int [1050];
        double serialPriority [] = new double[1050];
        double pricePriority [] = new double [1050];
        double weight [] = new double[1050];

        //   processing.fileReader();

        for(int i =0;i<50;i++){
bookPriority[i] =  (20 - Math.sqrt(typeValue[i]));
timePriority[i] = 16 -  (timeCount[i]/12);
borrowCount[i] = bookCount[i];
serialPriority[i] = Math.pow(queueValue[i],(1/3));
pricePriority[i] = Math.pow(bookPrice[i],(2/5));

weight[i] = bookPriority[i] +timePriority[i] +borrowCount[i]+serialPriority[i]+writePriority[i]+pricePriority[i];

        }
    }



}
