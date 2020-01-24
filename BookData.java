package IOStream;

public class BookData {
    String  bookName;
    String writerName;
    String bookId;
    String bookType;
    String priority;
    String borrowCount;
    String monthCount;
    String bookPrice;
    double weight;
    public BookData(){

    }
    public BookData(String  bookName,String  writerName,String  bookId,
                    String  bookType,String  priority,
                    String  borrowCount,String  monthCount,
                    String  bookPrice,double weight) {

        this.bookName = bookName;
        this.writerName =writerName;
        this.bookId = bookId;
        this.bookType = bookType;
        this.priority = priority;
        this.borrowCount = borrowCount;
        this.monthCount = monthCount;
        this.bookPrice = bookPrice;
        this.weight = weight;
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
     public String getBookType(){
        return bookType;
    }
     public String getPriority(){
        return priority;
    }
     public String getBorrowCount(){
        return borrowCount;
    }
     public String getMonthCount(){
        return monthCount;
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

}
