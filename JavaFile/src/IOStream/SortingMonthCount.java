package IOStream;

public class SortingMonthCount {
    public void algorithm(BookData [] bookData,int numberOfBooks){

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
                }
            }
        }
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println("Optimized View 3 :" );

        for(int i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }
}
