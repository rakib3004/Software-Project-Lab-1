package IOStream;

public class Sorting {
    public void algorithm(BookData [] bookData){

        GenericAlgo genericAlgo[] = new GenericAlgo[1050];
        for(int i = 0; i<200; i++){
            genericAlgo[i] = new GenericAlgo(bookData[i].getWeight(),i);
        }
        double temporary;
        int temp;
        for(int i=0;i<200;i++){
          for(int j=0;j<200;j++){
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

        System.out.println("List of top 10 Risk Books :" );

        for(int i=190;i<=200;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }
}
