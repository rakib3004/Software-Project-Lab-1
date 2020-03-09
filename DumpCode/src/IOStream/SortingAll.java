package IOStream;

public class SortingAll {
    public void algorithm(BookData [] bookData,int numberOfBooks){
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
                  bookData[j].setRank(bookData1.rank,0);
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

    }
}
