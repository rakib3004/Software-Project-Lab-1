package JavaSwing;

import javafx.beans.property.SimpleStringProperty;

public class Book {

    private SimpleStringProperty bookName;
    private SimpleStringProperty writerName;
    private SimpleStringProperty bookId;
    private SimpleStringProperty borrowCount;
    private SimpleStringProperty price;
    private SimpleStringProperty bookWeight;


    public String getBookWeight() {
        return bookWeight.get();
    }

    public SimpleStringProperty bookWeightProperty() {
        return bookWeight;
    }

    public void setBookWeight(String bookWeight) {
        this.bookWeight.set(bookWeight);
    }



    public Book(SimpleStringProperty bookName,
                SimpleStringProperty writerName,
                SimpleStringProperty bookId,
                SimpleStringProperty borrowCount,
                SimpleStringProperty price) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.bookId = bookId;
        this.borrowCount = borrowCount;
        this.price = price;
    }



    public SimpleStringProperty borrowCountProperty() {
        return borrowCount;
    }

    public void setBorrowCount(String borrowCount) {
        this.borrowCount.set(borrowCount);
    }

    public String getPrice() {
        return price.get();
    }

    public SimpleStringProperty priceProperty() {
        return price;
    }

    public void setPrice(String price) {
        this.price.set(price);
    }



    public Book(String bookName, String writerName, String bookId, String borrowCount, String bookPrice, double mlRweight) {
    }

    public Book (String s1, String s2) {

        bookName = new SimpleStringProperty(s1);
        writerName = new SimpleStringProperty(s2);
    }
public Book (String s1, String s2,String s3, String s4,String s5,String s6) {

        bookName = new SimpleStringProperty(s1);
        writerName = new SimpleStringProperty(s2);
        bookId = new SimpleStringProperty(s3);
        borrowCount = new SimpleStringProperty(s4);
        price = new SimpleStringProperty(s5);
        bookWeight = new SimpleStringProperty(s6);

    }

    public String getBookName() {

        return bookName.get();
    }
    public void setBookName(String s) {

        bookName.set(s);
    }

    public String getWriterName() {

        return writerName.get();
    }
    public void setWriterName(String s) {

        writerName.set(s);
    }

    @Override
    public String toString() {

        return (bookName.get() + ", by " + writerName.get());
    }
}
