package IOStream;

public class MultipleLinearRegression {

    int typeValue [] =new int[1050];
    int timeCount [] = new int[1050];
    int bookCount [] = new int [1050];
    int queueValue [] = new int [1050];
    int bookPrice [] =new int[1050];

    String string,string1,string2;
    int length;
    int integer1,integer2;
    int newYear,oldYear;

 public void  loadData(BookData[] bookData,String[] writerName,
                       String[] borrowCount1,String[] bookPrice1,String[] bookId,
                       int numberOfBooks,double[] weight1){

    for(int i=0;i<numberOfBooks;i++){
         length = bookId[i].length();
         string =bookId[i].substring(1,3);
         typeValue[i] = Integer.parseInt(string);
     } for(int i=0;i<numberOfBooks;i++){

         newYear = 2 + (20) * 12;
         string1 = bookId[i].substring(4,6);
         integer1 = Integer.parseInt(string1);
         string2=bookId[i].substring(6,8);

         integer2 = Integer.parseInt(string2);
         oldYear = integer1+(integer2*12);
         timeCount[i] = newYear - oldYear;

     } for(int i=0;i<numberOfBooks;i++){
         length = borrowCount1[i].length();
         string =borrowCount1[i].substring(1,length);
         bookCount[i] = Integer.parseInt(string);
     }for(int i=0;i<numberOfBooks;i++){
         length = bookPrice1[i].length();
         string =bookPrice1[i].substring(1,length);
         string=string.replaceAll("[\\t\\n\\r]+","");
         bookPrice[i] = Integer.parseInt(string);
     }

     double [][] matrix_x = new double[1050][1050];
     double [] matrix_y = new double[1050];
     for(int i=0;i<numberOfBooks;i++){
         matrix_y[i] = weight1[i];
     }
      for(int i=0;i<numberOfBooks;i++){
              matrix_x[i][0] = typeValue[i];
              matrix_x[i][1] = timeCount[i];
              matrix_x[i][2] = bookCount[i];
              matrix_x[i][3] = bookPrice[i];


     }




     double bookPriority [] = new double[1050];
     double timePriority [] = new double [1050];
     int borrowCount [] = new int [1050];
     double serialPriority [] = new double[1050];
     double pricePriority [] = new double [1050];
     double weight [] = new double[1050];


 }
}