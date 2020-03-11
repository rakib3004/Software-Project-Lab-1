package IOStream;

public class PriorityData {
    double bookPriority ;
    double timePriority;
    double borrowPriority ;
    double pricePriority;

    public PriorityData(double bookPriority , double timePriority, double borrowPriority ,  double pricePriority){
        this.bookPriority =bookPriority;
        this.timePriority = timePriority;
        this.borrowPriority = borrowPriority;
        this.pricePriority = pricePriority;
    }
public void setBookPriority(double bookPriority){
        this.bookPriority = bookPriority;
}


}
