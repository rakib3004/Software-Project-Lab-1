package IOStream;

public class OutputSort {
    BookData [] bookData = new BookData[1050];
    public void sortingProcess(PriorityData[] priorityData,int numberOfBooks){

        double temporary;
        int temp;
        for(int i=0;i<numberOfBooks;i++){
            for(int j=0;j<numberOfBooks;j++){
                if(priorityData[i].getBookPriority()>priorityData[j].getBookPriority()){
                    temporary= priorityData[i].getBookPriority();
                    priorityData[i].setBookPriority(priorityData[j].getBookPriority());
                    priorityData[j].setBookPriority(temporary);

                    temp = priorityData[i].getIndex();
                    priorityData[i].setIndex(priorityData[j].getIndex());
                    priorityData[j].setIndex(temp);
                }
            }
        }

optimizedResult(priorityData,numberOfBooks);
    }

    public void optimizedResult(PriorityData[] priorityData,int numberOfBooks){
        int start= 20;
        //   Scanner scanner = new Scanner(System.in);
        //  start =scanner.nextInt();
        System.out.println("List of top "+start+" Risk Books :" );


        try {
            for (int i = 0; i < numberOfBooks; i++) {
                System.out.println("Book Name :" + bookData[priorityData[i].getIndex()].getBookName() +
                        "; Writer Name : " + bookData[priorityData[i].getIndex()].getWriterName()
                        + "; Weight : " + priorityData[i].getBookPriority());
            }

        }
        catch (NullPointerException nullPointerException){
            System.out.println("Null Pointer Exception");
        }


    }
}
