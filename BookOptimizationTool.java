//Outstream 

package IOStream;
        import javax.print.DocFlavor;
        import javax.swing.*;
        import javax.swing.table.DefaultTableModel;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;
        import java.io.IOException;

public class OutStream extends JFrame implements ActionListener {

    private Container container;
    private JLabel jLabel,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6;
    private JTextField jTextField,jTextField2,jTextField3,jTextField4,jTextField5;
    private JButton jButton,jButton2,jButton3,jButton4;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private DefaultTableModel defaultTableModel;
    private String []  columms = {"Book Name","Writer Name","Book Id","Borrow Count","Price"};
    private String [] rows = new String[5];
    OutStream(){
        induction();
    }
    public void induction(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(780,690);
        this.setLocationRelativeTo(null);
        this.setTitle("Library Management System");

        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.blue);

        Font font = new Font("Font",Font.BOLD,14);

        jLabel = new JLabel("Book Registration");
        jLabel.setFont(font);
        jLabel.setForeground(Color.magenta);
        jLabel.setBounds(140,10,250,50);
        container.add(jLabel);

        jLabel2 = new JLabel("Book Name :");
        jLabel2.setFont(font);
        jLabel2.setForeground(Color.green);
        jLabel2.setBounds(10,80,150,30);
        container.add(jLabel2);

        jTextField = new JTextField();
        jTextField.setFont(font);
        jTextField.setBounds(110,80,200,30);
        container.add(jTextField);

        jButton = new JButton("Add");
        jButton.setFont(font);
        jButton.setBounds(400,80,100,30);
        container.add(jButton);

        jLabel3 = new JLabel("Writer Name :");
        jLabel3.setFont(font);
        jLabel3.setForeground(Color.green);
        jLabel3.setBounds(10,130,150,30);
        container.add(jLabel3);

        jTextField2 = new JTextField();
        jTextField2.setFont(font);
        jTextField2.setBounds(110,130,200,30);
        container.add(jTextField2);

        jButton2 = new JButton("Update");
        jButton2.setFont(font);
        jButton2.setBounds(400,130,100,30);
        container.add(jButton2);

        jLabel4 = new JLabel("Book Id :");
        jLabel4.setFont(font);
        jLabel4.setForeground(Color.green);
        jLabel4.setBounds(10,180,150,30);
        container.add(jLabel4);

        jTextField3 = new JTextField();
        jTextField3.setFont(font);
        jTextField3.setBounds(110,180,200,30);
        container.add(jTextField3);

        jButton3 = new JButton("Delete");
        jButton3.setFont(font);
        jButton3.setBounds(400,180,100,30);
        container.add(jButton3);

        jLabel5 = new JLabel("Borrow Count:");
        jLabel5.setFont(font);
        jLabel5.setForeground(Color.green);
        jLabel5.setBounds(10,230,150,30);
        container.add(jLabel5);

        jTextField4 = new JTextField();
        jTextField4.setFont(font);
        jTextField4.setBounds(110,230,200,30);
        container.add(jTextField4);

        jButton4 = new JButton("Clear ");
        jButton4.setFont(font);
        jButton4.setBounds(400,230,100,30);
        container.add(jButton4);

        jLabel6 = new JLabel("Price");
        jLabel6.setFont(font);
        jLabel6.setForeground(Color.green);
        jLabel6.setBounds(10,280,150,30);
        container.add(jLabel6);

        jTextField5 = new JTextField();
        jTextField5.setFont(font);
        jTextField5.setBounds(110,280,200,30);
        container.add(jTextField5);

        jTable = new JTable();
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.setColumnIdentifiers(columms);
        jTable.setModel(defaultTableModel);
        jTable.setFont(font);
        jTable.setSelectionBackground(Color.green);
        jTable.setOpaque(true);
        jTable.setBackground(Color.red);
        jTable.setRowHeight(30);

        jScrollPane = new JScrollPane(jTable);
        jScrollPane.setBounds(10,360,740,265);
        container.add(jScrollPane);

        jButton.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jTable.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me){
                int number_of_row = jTable.getSelectedRow();
                String srting = defaultTableModel.getValueAt(number_of_row,0).toString();
                String srting1 = defaultTableModel.getValueAt(number_of_row,1).toString();
                String srting2 = defaultTableModel.getValueAt(number_of_row,2).toString();
                String srting3 = defaultTableModel.getValueAt(number_of_row,3).toString();
                jTextField.setText(srting);
                jTextField2.setText(srting1);
                jTextField3.setText(srting2);
                jTextField4.setText(srting3);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jButton){
            rows[0] = jTextField.getText();
            rows[1] = jTextField2.getText();
            rows[2] = jTextField3.getText();
            rows[3] = jTextField4.getText();
            defaultTableModel.addRow(rows);

        }
        else if(e.getSource()==jButton4){
            jTextField.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
        }
        else if(e.getSource()==jButton2){
            int number_of_row = jTable.getSelectedRow();
            String srting  = jTextField.getText();
            String srting1  = jTextField2.getText();
            String srting2  = jTextField3.getText();
            String srting3   = jTextField4.getText();
            defaultTableModel.setValueAt(srting,number_of_row,0);
            defaultTableModel.setValueAt(srting1,number_of_row,1);
            defaultTableModel.setValueAt(srting2,number_of_row,2);
            defaultTableModel.setValueAt(srting3,number_of_row,3);

        }
        else if(e.getSource()==jButton3){
            int number_of_row = jTable.getSelectedRow();
            if(number_of_row>=0){
                defaultTableModel.removeRow(number_of_row);
            }
            else{
                JOptionPane.showMessageDialog(null,"Please Delete Any row");
            }
        }
    }
    public static void main(String[] args)throws IOException {
        Processing processing = new Processing();
        processing.fileReader();
        OutStream frame = new OutStream();
        frame.setVisible(true);
    }

}

//Processing
package IOStream;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;
public class Processing {
    int x = 0;

    BookData bookData [] = new BookData[1050];
TotalRegression totalRegression = new TotalRegression();
TypeCountRegression typeCountRegression = new TypeCountRegression();
MonthCountRegression monthCountRegression = new MonthCountRegression();
    PriceCountRegression priceCountRegression = new PriceCountRegression();
    TypePriceRegression typePriceRegression = new TypePriceRegression();
    CountPriceRegression countPriceRegression = new CountPriceRegression();
    public void fileReader()  throws IOException{

        File file = new File("IIT_SPL.txt");
        FileReader fr = new FileReader(file);
        char[] a = new char[120500];
        fr.read(a);
        // reads the content to the array

        String  bookName[] = new String[1050];
        String writerName[] = new String[1050];
        String bookId[] = new String[1050];

       // String bookType[] = new String[1050];
      //  String priority[] = new String[1050];

        String borrowCount[] = new String[1050];

      //  String monthCount[] = new String[1050];
        String bookPrice[] = new String[1050];
 //  arrayList.array();


        bookName[x] = "\0";
        writerName[x] = "\0";
        bookId[x] = "\0";
       // bookType[x] = "\0";
     //   priority[x] = "\0";
        borrowCount[x] = "\0";
     //   monthCount[x] = "\0";
        bookPrice[x] = "\0";

        int t = 0;
        for (int i = 0; a[i] != '\0'; i++) {
            if (a[i] == '\t') {
                i++;
                t++;
                t = t % 5;
            }
            if (a[i] == '\n') {
                i++;
                t++;

                t = t % 5;
 bookData[x] = new BookData(  bookName[x],  writerName[x],
         bookId[x],   borrowCount[x],
           bookPrice[x],0.00);

           
                x++;
                bookName[x] = "\0";
                writerName[x] = "\0";
                bookId[x] = "\0";
               // bookType[x] = "\0";
             //   priority[x] = "\0";
                borrowCount[x] = "\0";
           //     monthCount[x] = "\0";
                bookPrice[x] = "\0";

            }
            if (t == 0) {

                bookName[x] = bookName[x] + a[i];
            } else if (t == 1) {
                writerName[x] = writerName[x] + a[i];

            } else if (t == 2) {
                bookId[x] = bookId[x] + a[i];


            } else if (t == 3) {
                borrowCount[x] = borrowCount[x] + a[i];

            }
            else if(t==4){
                bookPrice[x]=bookPrice[x]+a[i];
            }
        }
        fr.close();

      //  System.out.println();

int numOfBook= x;

       totalRegression.analysis(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        typeCountRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        monthCountRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        priceCountRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        typePriceRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);
        countPriceRegression.statistics(bookData,writerName,borrowCount,bookPrice,bookId,numOfBook);


        // printAll(bookName,writerName,bookId,borrowCount,bookPrice,numOfBook);
    }

    public void printAll(String[] bookName,String[] writerName,String[] bookId,
                        String[] borrowCount,String[] bookPrice,int numberOfBooks){
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookName[j]);
        }
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(writerName[j]);
        }
        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookId[j]);
        }

        for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(borrowCount[j]);

        }  for (int j = 0; j < numberOfBooks; j++) {
            System.out.println(bookPrice[j]);

        }
    }
}

//Book Data

package IOStream;

public class BookData {
    String  bookName;
    String writerName;
    String bookId;
   // String bookType;
  //  String priority;
    String borrowCount;
 //   String monthCount;
    String bookPrice;
    double weight;
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

}



//Generic Algo

package IOStream;

public class GenericAlgo {
    double weight;
    int index;
    public GenericAlgo(double weight , int index){
        this.weight = weight;
        this.index = index;
    }
    public double getWeight(){
        return  weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public int getIndex(){
        return  index;
    }
    public void setIndex(int index){
        this.index = index;
    }

}

//Total Regression

package IOStream;

public class TotalRegression {
    public void analysis(BookData[] bookData,String[] writerName,
                         String[] borrowCount1,String[] bookPrice1,String[] bookId,int numberOfBooks){
     //   Processing processing = new Processing();

        int typeValue [] =new int[1050];
        int timeCount [] = new int[1050];
        int bookCount [] = new int [1050];
        int queueValue [] = new int [1050];
        int bookPrice [] =new int[1050];
        int writePriority [] = new int[1050];

        String string,string1,string2;
        int length;
        int integer1,integer2;
        int newYear,oldYear;
        for(int i=0;i<numberOfBooks;i++){
           if(writerName[i].equals(" Humayon Ahmed")){
               writePriority[i]=25;
           }
           else if(writerName[i].equals("Muhammad Jafar Iqbal")){
                writePriority[i]=23;
            }
            else {
               writePriority[i]=15;
            }

        } for(int i=0;i<numberOfBooks;i++){
            length = bookId[i].length();
            string =bookId[i].substring(1,3);
            typeValue[i] = Integer.parseInt(string);
        } for(int i=0;i<numberOfBooks;i++){

 newYear = 2 + (20) * 12;
string1 = bookId[i].substring(4,6);
integer1 = Integer.parseInt(string1);
string2=bookId[i].substring(6,8);

integer2 = Integer.parseInt(string2);
oldYear = integer1+(integer2*12);
timeCount[i] = newYear - oldYear;

        } for(int i=0;i<numberOfBooks;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }for(int i=0;i<numberOfBooks;i++){
            length = bookPrice1[i].length();
            string =bookPrice1[i].substring(1,length);
            string=string.replaceAll("[\\t\\n\\r]+","");
            bookPrice[i] = Integer.parseInt(string);
        }

        double bookPriority [] = new double[1050];
        double timePriority [] = new double [1050];
        int borrowCount [] = new int [1050];
        double serialPriority [] = new double[1050];
        double pricePriority [] = new double [1050];
        double weight [] = new double[1050];

        //   processing.fileReader();


        for(int i =0;i<numberOfBooks;i++){
bookPriority[i] =  (20 - Math.sqrt(typeValue[i]));
timePriority[i] = 16 -  (timeCount[i]/12);
borrowCount[i] = bookCount[i];
//serialPriority[i] = Math.pow(queueValue[i],(1/3));
pricePriority[i] = Math.pow(bookPrice[i],(2/5));

weight[i] = bookPriority[i] +timePriority[i] +
        borrowCount[i]+//serialPriority[i]+
        +writePriority[i]+pricePriority[i];
          //  System.out.println(weight[i]);
bookData[i].setWeight(weight[i]);
        }

      SortingAll sortingAll = new SortingAll();
        sortingAll.algorithm(bookData,numberOfBooks);
    }

}


//Type Count Regression

package IOStream;

public class TypeCountRegression {
    public  void statistics(BookData[] bookData,String[] writerName,
                            String[] borrowCount1,String[] bookPrice1,String[] bookId,int numberOfBooks){

        int i;
        double countMean=0;
        double typeMean=0;
        double bookCount [] = new double [1050];
        double typeValue [] =new double[1050];
        double typeValue1 [] =new double[1050];
        double typeValue0 [] =new double[1050];

        int length;
        String string;

        for( i=0;i<numberOfBooks;i++){
             length = bookId[i].length();
            string =bookId[i].substring(1,3);
            typeValue[i] = Integer.parseInt(string);
            typeValue0[i]=typeValue[i];
        }
    for( i=0;i<numberOfBooks;i++){
        length = borrowCount1[i].length();
        string =borrowCount1[i].substring(1,length);
        bookCount[i] = Integer.parseInt(string);
    }

        for( i=0;i<numberOfBooks;i++){
typeMean = typeMean +typeValue[i];
countMean = countMean+bookCount[i];
        }

        typeMean = typeMean/numberOfBooks;
        countMean = countMean/numberOfBooks;

        double assumpMean1  = 0;
      double assumpMean2  = 0;
    for(i=0;i<numberOfBooks;i++){
typeValue[i] =  typeValue[i]  - typeMean;
bookCount[i]=bookCount[i]-countMean;
assumpMean1 = assumpMean1 +( typeValue[i]*bookCount[i]);
assumpMean2 = assumpMean2 + (bookCount[i]*bookCount[i]);

    }

    double metaValue = assumpMean1/assumpMean2;
    double betaValue = countMean - (metaValue*typeMean);
        for(i=0;i<numberOfBooks;i++) {

            typeValue1[i] = betaValue + metaValue * bookCount[i];
       //     System.out.println(typeValue0[i]+"\t"+typeValue1[i]);
        }
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(typeValue1[i]);
        }
        SortingTypeCount sortingTypeCount = new SortingTypeCount();
        sortingTypeCount.algorithm(bookData,numberOfBooks);

        }

    }


//Month Count Regression

package IOStream;

public class MonthCountRegression {
    public  void statistics(BookData[] bookData,String[] writerName,
                            String[] borrowCount1,String[] bookPrice1,String[] bookId,int numberOfBooks){

        int i;
        double countMean=0;
        double timeMean=0;
        double bookCount [] = new double [1050];
        double bookCount0 [] = new double [1050];
        double bookCount1 [] = new double [1050];

        int timeCount [] = new int[1050];

        double timeValue [] =new double[1050];


        int length;
        String string;
        String string1,string2;

        int newYear,oldYear,integer1,integer2;
        for( i=0;i<numberOfBooks;i++){
            newYear = 2 + (20) * 12;
            string1 = bookId[i].substring(4,6);
            integer1 = Integer.parseInt(string1);
            string2=bookId[i].substring(6,8);

            integer2 = Integer.parseInt(string2);
            oldYear = integer1+(integer2*12);
            timeValue[i] = newYear - oldYear;

        }

        for( i=0;i<numberOfBooks;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }

        for( i=0;i<numberOfBooks;i++){
            timeMean = timeMean +timeValue[i];
            countMean = countMean+bookCount[i];
        }

        timeMean = timeMean/numberOfBooks;
        countMean = countMean/numberOfBooks;

        double assumpMean1  = 0;
        double assumpMean2  = 0;
        for(i=0;i<numberOfBooks;i++){
            timeValue[i] =  timeValue[i]  - timeMean;
            bookCount[i]=bookCount[i]-countMean;
            assumpMean1 = assumpMean1 +( timeValue[i]*bookCount[i]);
            assumpMean2 = assumpMean2 + (timeValue[i]*timeValue[i]);

        }

        double metaValue = assumpMean1/assumpMean2;
        double betaValue = timeMean - (metaValue*countMean);
        for(i=0;i<numberOfBooks;i++) {

            bookCount1[i] = betaValue + metaValue * timeValue[i];
            //     System.out.println(typeValue0[i]+"\t"+timeValue1[i]);
        }
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(bookCount1[i]);
        }
        SortingMonthCount sortingMonthCount = new SortingMonthCount();
        sortingMonthCount.algorithm(bookData,numberOfBooks);

    }

}


//Price Count Regression

package IOStream;

public class PriceCountRegression  {
    public  void statistics(BookData[] bookData,String[] writerName,
                            String[] borrowCount1,String[] bookPrice9,String[] bookId,int numberOfBooks){

    int i;
    double countMean=0;
    double priceMean=0;
    double bookCount [] = new double [1050];
    double bookCount0 [] = new double [1050];
    double bookCount1 [] = new double [1050];
    double bookPrice [] =new double[1050];
    double bookPrice1 [] =new double[1050];
    double bookPrice0 [] =new double[1050];

    int length;
    String string;
        for( i=0;i<numberOfBooks;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }
    for( i=0;i<numberOfBooks;i++){
        length = bookPrice9[i].length();
        string =bookPrice9[i].substring(1,length);
        string=string.replaceAll("[\\t\\n\\r]+","");
        bookPrice[i] = Integer.parseInt(string);
    }

    for( i=0;i<numberOfBooks;i++){
        priceMean = priceMean +bookPrice[i];
        countMean = countMean+bookCount[i];
    }

    priceMean = priceMean/numberOfBooks;
    countMean = countMean/numberOfBooks;

    double assumpMean1  = 0;
    double assumpMean2  = 0;
    for(i=0;i<numberOfBooks;i++){
        bookPrice[i] =  bookPrice[i]  - priceMean;
        bookCount[i]=bookCount[i]-countMean;
        assumpMean1 = assumpMean1 +( bookPrice[i]*bookCount[i]);
        assumpMean2 = assumpMean2 + (bookPrice[i]*bookPrice[i]);

    }

    double metaValue = assumpMean1/assumpMean2;
    double betaValue = countMean - (metaValue*priceMean);
    for(i=0;i<numberOfBooks;i++) {

        bookCount1[i] = betaValue + metaValue * bookPrice[i];
        //     System.out.println(bookPrice0[i]+"\t"+bookPrice1[i]);
    }
    for( i =0;i<numberOfBooks;i++){

        bookData[i].setWeight(bookCount1[i]);
    }
    SortingPriceCount sortingPriceCount = new SortingPriceCount();
    sortingPriceCount.algorithm(bookData,numberOfBooks);

}
}

//Count Price Regression


package IOStream;

public class CountPriceRegression {


    public  void statistics(BookData[] bookData,String[] writerName,
                            String[] borrowCount1,String[] bookPrice9,String[] bookId,int numberOfBooks){

        int i;
        double countMean=0;
        double priceMean=0;
        double bookCount [] = new double [1050];
        double bookPrice [] =new double[1050];
        double bookPrice1 [] =new double[1050];
        double bookPrice0 [] =new double[1050];

        int length;
        String string;
        for( i=0;i<numberOfBooks;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }
        for( i=0;i<numberOfBooks;i++){
            length = bookPrice9[i].length();
            string =bookPrice9[i].substring(1,length);
            string=string.replaceAll("[\\t\\n\\r]+","");
            bookPrice[i] = Integer.parseInt(string);
        }

        for( i=0;i<numberOfBooks;i++){
            priceMean = priceMean +bookPrice[i];
            countMean = countMean+bookCount[i];
        }

        priceMean = priceMean/numberOfBooks;
        countMean = countMean/numberOfBooks;

        double assumpMean1  = 0;
        double assumpMean2  = 0;
        for(i=0;i<numberOfBooks;i++){
            bookPrice[i] =  bookPrice[i]  - priceMean;
            bookCount[i]=bookCount[i]-countMean;
            assumpMean1 = assumpMean1 +( bookPrice[i]*bookCount[i]);
            assumpMean2 = assumpMean2 + (bookCount[i]*bookCount[i]);

        }

        double metaValue = assumpMean1/assumpMean2;
        double betaValue = countMean - (metaValue*priceMean);
        for(i=0;i<numberOfBooks;i++) {

            bookPrice1[i] = betaValue + metaValue * bookCount[i];
            //     System.out.println(bookPrice0[i]+"\t"+bookPrice1[i]);
        }
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(bookPrice1[i]);
        }
        SortingCountPrice sortingCountPrice = new SortingCountPrice();
        sortingCountPrice.algorithm(bookData,numberOfBooks);

    }

}



//Type Price Regression
package IOStream;

public class TypePriceRegression {

    public  void statistics(BookData[] bookData,String[] writerName,
                            String[] borrowCount1,String[] bookPrice1,String[] bookId,int numberOfBooks){

        int i;
        double priceMean=0;
        double typeMean=0;
        double bookPrice [] = new double [1050];
        double typeValue [] =new double[1050];
        double typeValue1 [] =new double[1050];
        double typeValue0 [] =new double[1050];

        int length;
        String string;

        for( i=0;i<numberOfBooks;i++){
            length = bookId[i].length();
            string =bookId[i].substring(1,3);
            typeValue[i] = Integer.parseInt(string);
            typeValue0[i]=typeValue[i];
        }

    for( i=0;i<numberOfBooks;i++){
        length = bookPrice1[i].length();
        string =bookPrice1[i].substring(1,length);
        string=string.replaceAll("[\\t\\n\\r]+","");
        bookPrice[i] = Integer.parseInt(string);
    }
        for( i=0;i<numberOfBooks;i++){
            typeMean = typeMean +typeValue[i];
            priceMean = priceMean+bookPrice[i];
        }

        typeMean = typeMean/numberOfBooks;
        priceMean = priceMean/numberOfBooks;

        double assumpMean1  = 0;
        double assumpMean2  = 0;
        for(i=0;i<numberOfBooks;i++){
            typeValue[i] =  typeValue[i]  - typeMean;
            bookPrice[i]=bookPrice[i]-priceMean;
            assumpMean1 = assumpMean1 +( typeValue[i]*bookPrice[i]);
            assumpMean2 = assumpMean2 + (bookPrice[i]*bookPrice[i]);

        }

        double metaValue = assumpMean1/assumpMean2;
        double betaValue = priceMean - (metaValue*typeMean);
        for(i=0;i<numberOfBooks;i++) {

            typeValue1[i] = betaValue + metaValue * bookPrice[i];
            //     System.out.println(typeValue0[i]+"\t"+typeValue1[i]);
        }
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(typeValue1[i]);
        }
        SortingTypePrice sortingTypePrice = new SortingTypePrice();
        sortingTypePrice.algorithm(bookData,numberOfBooks);

    }

}



//Sorting All

package IOStream;

public class SortingAll {
    public void algorithm(BookData [] bookData,int numberOfBooks){

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
              }
          }
        }

        System.out.println("Optimized View 01 :" );


        for(int i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }
}


//Sorting Type Count



package IOStream;
//Complete
public class SortingTypeCount {
    public void algorithm(BookData [] bookData,int numberOfBooks){

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
                }
            }
        }
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println("Optimized View 5 :" );

        for(int i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }
}


//Sorting Month Count


package IOStream;

public class SortingMonthCount {
    public void algorithm(BookData [] bookData,int numberOfBooks){

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
                }
            }
        }
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println("Optimized View 3 :" );

        for(int i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }
}


// Sorting Price Count

package IOStream;

public class SortingPriceCount {
    public void algorithm(BookData [] bookData,int numberOfBooks){

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
                }
            }
        }
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println("Optimized View 4 :" );

        for(int i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }
}

//Sorting Count Price 

package IOStream;

public class CountPriceRegression {


    public  void statistics(BookData[] bookData,String[] writerName,
                            String[] borrowCount1,String[] bookPrice9,String[] bookId,int numberOfBooks){

        int i;
        double countMean=0;
        double priceMean=0;
        double bookCount [] = new double [1050];
        double bookPrice [] =new double[1050];
        double bookPrice1 [] =new double[1050];
        double bookPrice0 [] =new double[1050];

        int length;
        String string;
        for( i=0;i<numberOfBooks;i++){
            length = borrowCount1[i].length();
            string =borrowCount1[i].substring(1,length);
            bookCount[i] = Integer.parseInt(string);
        }
        for( i=0;i<numberOfBooks;i++){
            length = bookPrice9[i].length();
            string =bookPrice9[i].substring(1,length);
            string=string.replaceAll("[\\t\\n\\r]+","");
            bookPrice[i] = Integer.parseInt(string);
        }

        for( i=0;i<numberOfBooks;i++){
            priceMean = priceMean +bookPrice[i];
            countMean = countMean+bookCount[i];
        }

        priceMean = priceMean/numberOfBooks;
        countMean = countMean/numberOfBooks;

        double assumpMean1  = 0;
        double assumpMean2  = 0;
        for(i=0;i<numberOfBooks;i++){
            bookPrice[i] =  bookPrice[i]  - priceMean;
            bookCount[i]=bookCount[i]-countMean;
            assumpMean1 = assumpMean1 +( bookPrice[i]*bookCount[i]);
            assumpMean2 = assumpMean2 + (bookCount[i]*bookCount[i]);

        }

        double metaValue = assumpMean1/assumpMean2;
        double betaValue = countMean - (metaValue*priceMean);
        for(i=0;i<numberOfBooks;i++) {

            bookPrice1[i] = betaValue + metaValue * bookCount[i];
            //     System.out.println(bookPrice0[i]+"\t"+bookPrice1[i]);
        }
        for( i =0;i<numberOfBooks;i++){

            bookData[i].setWeight(bookPrice1[i]);
        }
        SortingCountPrice sortingCountPrice = new SortingCountPrice();
        sortingCountPrice.algorithm(bookData,numberOfBooks);

    }

}


// Sorting Type Price


package IOStream;

public class SortingTypePrice {
    public void algorithm(BookData [] bookData,int numberOfBooks){

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
                }
            }
        }
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println( );
        System.out.println("Optimized View 6 :" );

        for(int i=190;i<numberOfBooks;i++){
            System.out.println("Book Name :"+bookData[genericAlgo[i].getIndex()].getBookName()+
                    "; Writer Name : "+bookData[genericAlgo[i].getIndex()].getWriterName()
                    + "; Weight : "+genericAlgo[i].getWeight());
        }

    }
}

