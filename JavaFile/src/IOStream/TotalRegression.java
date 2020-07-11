package IOStream;

public class TotalRegression {

    int typeValue [] =new int[1050];
    int timeCount [] = new int[1050];
    int bookCount [] = new int [1050];
    int queueValue [] = new int [1050];
    int bookPrice [] =new int[1050];
    int writePriority [] = new int[1050] ;

    String string,string1,string2;
    int length;
    int integer1,integer2;
    int newYear,oldYear;
    public double[] analysis(BookData[] bookData,String[] writerName,
                         String[] borrowCount1,String[] bookPrice1,String[] bookId,int numberOfBooks){
     //   Processing processing = new Processing();

        for(int i=0;i<numberOfBooks;i++){
           if(writerName[i].equals(" Humayon Ahmed")){
               writePriority[i]=25;
           }
           else if(writerName[i].equals("Muhammad Jafar Iqbal")){
                writePriority[i]=23;
            }
            else {
               writePriority[i]=15;
            }

        } for(int i=0;i<numberOfBooks;i++){
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

        double bookPriority [] = new double[1050];
        double timePriority [] = new double [1050];
        int borrowCount [] = new int [1050];
        double serialPriority [] = new double[1050];
        double pricePriority [] = new double [1050];
        double weight [] = new double[1050];

        //   processing.fileReader();


        for(int i =0;i<numberOfBooks;i++){
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
        OutStream outStream = new OutStream();
        BookData bookData1 = new BookData();

        GenericAlgo genericAlgo[] = new GenericAlgo[1050];
        for(int i = 0; i<numberOfBooks; i++){
            genericAlgo[i] = new GenericAlgo(bookData[i].getWeight(),i);
        }
        double temporary;
        int temp;
        for(int i=0;i<numberOfBooks;i++){
            for(int j=0;j<numberOfBooks;j++){
                if(genericAlgo[i].getWeight()>genericAlgo[j].getWeight()){
                    temporary= genericAlgo[i].getWeight();
                    genericAlgo[i].setWeight(genericAlgo[j].getWeight());
                    genericAlgo[j].setWeight(temporary);
                    temp = genericAlgo[i].getIndex();
                    genericAlgo[i].setIndex(genericAlgo[j].getIndex());
                    genericAlgo[j].setIndex(temp);
                    bookData[j].setRank(temp,0);
                }
            }
        }

        System.out.println("Optimized View 01 :" );


        for(int i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());

        }
        //  outStream.induction(bookData,numberOfBooks);

      //SortingAll sortingAll = new SortingAll();
        //sortingAll.algorithm(bookData,numberOfBooks);
        return weight;
    }

}
