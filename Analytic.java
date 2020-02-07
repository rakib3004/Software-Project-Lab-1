package IOStream;

public class Analytic {
    public void analysis(BookData[] bookData,String[] writerName,
                         String[] borrowCount1,String[] bookPrice1,String[] bookId){
     //   Processing processing = new Processing();

        int typeValue [] =new int[1050];
        int timeCount [] = new int[1050];
        int bookCount [] = new int [1050];
        int queueValue [] = new int [1050];
        int bookPrice [] =new int[1050];
        int writePriority [] = new int[1050];

        String string,string1,string2;
        int length;
        int integer1,integer2;
        int newYear,oldYear;
        for(int i=0;i<200;i++){
           if(writerName[i].equals(" Humayon Ahmed")){
               writePriority[i]=25;
           }
           else if(writerName[i].equals("Muhammad Jafar Iqbal")){
                writePriority[i]=23;
            }
            else {
               writePriority[i]=15;
            }

        } for(int i=0;i<200;i++){
            length = bookId[i].length();
            string =bookId[i].substring(1,3);
            typeValue[i] = Integer.parseInt(string);
        } for(int i=0;i<200;i++){

 newYear = 2 + (20) * 12;
string1 = bookId[i].substring(4,6);
integer1 = Integer.parseInt(string1);
string2=bookId[i].substring(6,8);

integer2 = Integer.parseInt(string2);
oldYear = integer1+(integer2*12);
timeCount[i] = newYear - oldYear;

        } for(int i=0;i<200;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }for(int i=0;i<200;i++){
            length = bookPrice1[i].length();
            string =bookPrice1[i].substring(1,length);
            string=string.replaceAll("[\\t\\n\\r]+","");
            bookPrice[i] = Integer.parseInt(string);
        }

        double bookPriority [] = new double[1050];
        double timePriority [] = new double [1050];
        int borrowCount [] = new int [1050];
        double serialPriority [] = new double[1050];
        double pricePriority [] = new double [1050];
        double weight [] = new double[1050];

        //   processing.fileReader();


        for(int i =0;i<200;i++){
bookPriority[i] =  (20 - Math.sqrt(typeValue[i]));
timePriority[i] = 16 -  (timeCount[i]/12);
borrowCount[i] = bookCount[i];
//serialPriority[i] = Math.pow(queueValue[i],(1/3));
pricePriority[i] = Math.pow(bookPrice[i],(2/5));

weight[i] = bookPriority[i] +timePriority[i] +
        borrowCount[i]+//serialPriority[i]+
        +writePriority[i]+pricePriority[i];
          //  System.out.println(weight[i]);
bookData[i].setWeight(weight[i]);
        }
      Sorting sorting = new Sorting();
        sorting.algorithm(bookData);
    }



}
