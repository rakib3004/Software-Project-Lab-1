package IOStream;

public class Analytic {
    public void analysis(BookData[] bookData,String[] writerName,
                         String[] bookType,String[] priority,String[] borrowCount1,String[] monthCount,
                         String[] bookPrice1,String[] bookId){
        //   Processing processing = new Processing();

        int typeValue [] =new int[1050];
        int timeCount [] = new int[1050];
        int bookCount [] = new int [1050];
        int queueValue [] = new int [1050];
        int bookPrice [] =new int[1050];
        int writePriority [] = new int[1050];

        String string;
        int length;

        for(int i=0;i<50;i++){
            if(writerName[i].equals(" Humayon Ahmed")){
                writePriority[i]=25;
            }
            else if(writerName[i].equals("Muhammad Jafar Iqbal")){
                writePriority[i]=23;
            }
            else {
                writePriority[i]=15;
            }

        } for(int i=0;i<50;i++){
            length = bookId[i].length();
            string =bookId[i].substring(1,3);
            typeValue[i] = Integer.parseInt(string);
        } for(int i=0;i<50;i++){
            length = monthCount[i].length();
            string =monthCount[i].substring(1,length);
            timeCount[i] = Integer.parseInt(string);
        } for(int i=0;i<50;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        } /*for(int i=0;i<50;i++){
            length = bookId[i].length();
            string =bookPrice1[i].substring((length-4),length);
            queueValue[i] = Integer.parseInt(string);
        }*/for(int i=0;i<50;i++){
            length = bookPrice1[i].length();
            string =bookPrice1[i].substring(1,length);
            string=string.replaceAll("[\\t\\n\\r]+","");
            System.out.println(string);
            if(!string.isEmpty()) {
                bookPrice[i] = Integer.parseInt(string);
            }
        }

        double bookPriority [] = new double[1050];
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
//serialPriority[i] = Math.pow(queueValue[i],(1/3));
            pricePriority[i] = Math.pow(bookPrice[i],(2/5));

            weight[i] = bookPriority[i] +timePriority[i] +
                    borrowCount[i]+//serialPriority[i]+
                    +writePriority[i]+pricePriority[i];
            System.out.println(weight[i]);
            bookData[i].setWeight(weight[i]);
        }
        Sorting sorting = new Sorting();
        sorting.algorithm(bookData);
    }



}
