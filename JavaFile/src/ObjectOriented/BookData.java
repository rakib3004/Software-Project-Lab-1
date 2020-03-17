package ObjectOriented;

public class BookData {
    String  bookName;
    String writerName;
    String bookId;
    String borrowCount;
    String bookPrice;
    double weight;
    int rank[] = new int[9];

    public BookData(){

    }
    public BookData(String  bookName,String  writerName,String  bookId,
                    String  borrowCount , String  bookPrice,double weight) {
        this.bookName = bookName;
        this.writerName =writerName;
        this.bookId = bookId;
      //  this.bookType = bookType;
      //  this.priority = priority;
        this.borrowCount = borrowCount;
      //  this.monthCount = monthCount;
        this.bookPrice = bookPrice;
        this.weight = weight;
    }
    public BookData(String  bookName,String  writerName,String  bookId,
                    String  borrowCount , String  bookPrice,double weight,int[]rank) {
        this.bookName = bookName;
        this.writerName =writerName;
        this.bookId = bookId;
      //  this.bookType = bookType;
      //  this.priority = priority;
        this.borrowCount = borrowCount;
      //  this.monthCount = monthCount;
        this.bookPrice = bookPrice;
        this.weight = weight;
        this.rank= rank;
    }
    public String getBookName(){
        return bookName;
    }
     public String getWriterName(){
        return writerName;
    }
     public String getBookId(){
        return bookId;
    }
     public String getBorrowCount(){
        return borrowCount;
    }

     public String getBookPrice(){
        return bookPrice;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public int[] getRank() {
        return rank;
    }
    public void setRank(int rankValue,int i){
        this.rank[i] = rankValue;
    }
}
