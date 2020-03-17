package ObjectOriented;

public class PriorityData {
   public double bookPriority ;
    public  double timePriority;
    public   double borrowPriority ;
    public  double pricePriority;
    public   BookData bookData;
    int index;
    public PriorityData(double bookPriority , double timePriority, double borrowPriority ,  double pricePriority,int index,BookData bookData){
        this.bookPriority =bookPriority;
        this.timePriority = timePriority;
        this.borrowPriority = borrowPriority;
        this.pricePriority = pricePriority;
        this.index = index;
        this.bookData = bookData;
    }
public void setBookPriority(double bookPriority)
{
        this.bookPriority = bookPriority;
}
public double getBookPriority(){
        return  this.bookPriority;
}

public void setIndex(int index){
        this.index = index;
}
public int getIndex(){
    return     this.index;
}

}
