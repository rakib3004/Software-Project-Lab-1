package ObjectOriented;

import JavFX.FxDatabase;

public class PriorityData {
   public double bookPriority ;
   public double bookPriorityOne ;
    public  double timePriority;
    public   double borrowPriority ;
    public  double pricePriority;

    public PriorityData(double bookPriority,
                        double timePriority, double borrowPriority,
                        double pricePriority,int index , BookData
                                bookData,double weight ) {
        this.bookPriority = bookPriority;
        this.timePriority = timePriority;
        this.borrowPriority = borrowPriority;
        this.pricePriority = pricePriority;
        this.weight = weight;
        this.bookData = bookData;
        this.index = index;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double weight;
    public   BookData bookData;
   public int index;
    public PriorityData(double bookPriority , double timePriority,
                        double borrowPriority ,  double pricePriority,
                        int index,BookData bookData){
        this.bookPriority =bookPriority;
        this.timePriority = timePriority;
        this.borrowPriority = borrowPriority;
        this.pricePriority = pricePriority;
        this.index = index;
        this.bookData = bookData;
    }

    public PriorityData(double bookPriorityOne){
        this.bookPriorityOne =bookPriorityOne;
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
    return  this.index;
}

}
