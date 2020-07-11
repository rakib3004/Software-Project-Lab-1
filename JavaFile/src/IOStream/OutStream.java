
package IOStream;


        import ObjectOriented.BookData;

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
    private JButton jButton,jButton2,jButton3,jButton4,jButton5;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private DefaultTableModel defaultTableModel;

    private String []  columms = {"Book Name","Writer Name","Book Id","Borrow Count","Price"};
    private String [] rows = new String[5];

    public OutStream(){
        induction();
    }


    public void induction(/*BookData [] bookData,int numberOfBooks*/){

       // System.out.println(rankNumber);System.out.println(rankNumber);System.out.println(rankNumber);System.out.println(rankNumber);
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

        jButton5 = new JButton("Exit ");
        jButton5.setFont(font);
        jButton5.setBounds(400,280,100,30);
        container.add(jButton5);

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
        jButton5.addActionListener(this);



        jTable.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me){
                int number_of_row = jTable.getSelectedRow();
              JOptionPane.showMessageDialog(null,"Row No. "+number_of_row);
                String srting = defaultTableModel.getValueAt(number_of_row,0).toString();
                String srting1 = defaultTableModel.getValueAt(number_of_row,1).toString();
                String srting2 = defaultTableModel.getValueAt(number_of_row,2).toString();
                String srting3 = defaultTableModel.getValueAt(number_of_row,3).toString();
                String srting4 = defaultTableModel.getValueAt(number_of_row,4).toString();

                jTextField.setText(srting);
                jTextField2.setText(srting1);
                jTextField3.setText(srting2);
                jTextField4.setText(srting3);
                jTextField5.setText(srting4);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BookData[] bookData = new BookData[1020];
        Processing processing = new Processing();
        int rankNumber = processing.x;
        if(e.getSource()==jButton){
            rows[0] = jTextField.getText();
            rows[1] = jTextField2.getText();
            rows[2] = jTextField3.getText();
            rows[3] = jTextField4.getText();
            rows[4] = jTextField5.getText();

            defaultTableModel.addRow(rows);

        }
        else if(e.getSource()==jButton4){
            jTextField.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");

        }

        else if(e.getSource()==jButton2){
            int number_of_row = jTable.getSelectedRow();
            String srting  = jTextField.getText();
            String srting1  = jTextField2.getText();
            String srting2  = jTextField3.getText();
            String srting3   = jTextField4.getText();
            String srting4   = jTextField5.getText();
            defaultTableModel.setValueAt(srting,number_of_row,0);
            defaultTableModel.setValueAt(srting1,number_of_row,1);
            defaultTableModel.setValueAt(srting2,number_of_row,2);
            defaultTableModel.setValueAt(srting3,number_of_row,3);
            defaultTableModel.setValueAt(srting4,number_of_row,4);
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
        else if(e.getSource()==jButton5){
          // System.exit(0);
            for(int iterator=0;iterator<rankNumber;iterator++){
                rows[0] = bookData[iterator].bookName.toString();
                rows[1] =  bookData[iterator].writerName.toString();
                rows[3] =  bookData[iterator].borrowCount.toString();
                rows[4] = bookData[iterator].bookPrice;
                defaultTableModel.addRow(rows);
            }
        }

    }
    public static void main(String[] args)throws IOException {
        Processing processing = new Processing();
        processing.fileReader();
       // OutStream frame = new OutStream();
      //frame.setVisible(true);
    }

}