package IOStream;

public class RankShow {
    BookData bookData = new BookData();

    public void showCase(BookData [] bookData,int numberOfBooks) {
        System.out.println("Book Name \t t1 \t t2 \t t3 \t t4 \t t5 \t t6 ");
        for (int iterator = 0; iterator < numberOfBooks; iterator++) {
            System.out.println(bookData[iterator].bookName+"\t"+bookData[iterator].rank[0]+
                    "\t"+bookData[iterator].rank[1]+"\t"+bookData[iterator].rank[2]+
                    "\t"+bookData[iterator].rank[3]+"\t"+bookData[iterator].rank[4]+"" +
                    "\t"+bookData[iterator].rank[5]);
        }
    }
}