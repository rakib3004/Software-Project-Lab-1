package DataComparing;

import MainPackage.BookNumber;
import MainPackage.Processing;
import Methods.PrioritySort;
import Methods.ReverseSorting;
import MultiVariableRegression.MultipleLinearRegression;
import ObjectOriented.GenericAlgo;
import ObjectOriented.PriorityData;
import RegressionFx.FourVariableRegression;
import TableViewPackage.AHP_TableViewFX;
import TableViewPackage.MLR_TableViewFX;
import TableViewPackage.PRA_TableViewFX;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static javafx.scene.paint.Color.DARKBLUE;

public class CodeValidationShowing extends Application {

    private TableView table;
    private ObservableList data;
    private Text actionStatus;
    PriorityData[] priorityData,priorityDataCV;
    GenericAlgo[] genericAlgo;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();
    ReverseSorting soring = new ReverseSorting();
    PrioritySort prioritySort = new PrioritySort();

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setTitle("Table View Example 1");

        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setOnAction(actionEvent -> {
            FourVariableRegression fourVariableRegression = new FourVariableRegression();
            try {
                fourVariableRegression.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        exit.setOnAction(actionEvent -> {
            System.exit(0);

        });
        setStyle(exit);
        setStyle(back);

        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        back.setTranslateX(0);
        back.setTranslateY(685);
        exit.setTranslateX(1100);
        exit.setTranslateY(685);


        // Books label
        Label label = new Label("Cross Validation Results");
        label.setTextFill(DARKBLUE);
        label.setFont(Font.font("Calibri", FontWeight.BOLD, 36));
        HBox hb = new HBox();
        hb.setAlignment(Pos.CENTER);
        hb.getChildren().add(label);

        // Table view, data, columns and properties

        table = new TableView();
        data = getInitialTableData();
        table.setItems(data);

        TableColumn bookName = new TableColumn("Book Name");
        bookName.setCellValueFactory(new PropertyValueFactory("bookName"));

        TableColumn writerName = new TableColumn("Writer Name");
        writerName.setCellValueFactory(new PropertyValueFactory("writerName"));

        TableColumn typeName = new TableColumn("Type Name");
        typeName.setCellValueFactory(new PropertyValueFactory("typeName"));

        TableColumn bookId = new TableColumn("Book ID");
        bookId.setCellValueFactory(new PropertyValueFactory("bookId"));


        TableColumn bookWeight = new TableColumn("Book Weight");
        bookWeight.setCellValueFactory(new PropertyValueFactory("bookWeight"));

        TableColumn bookWeightCV = new TableColumn("Book Weight CV");
        bookWeight.setCellValueFactory(new PropertyValueFactory("bookWeightCV"));



        table.getColumns().setAll(bookName,writerName,typeName,bookId, bookWeight,bookWeightCV);
        table.setPrefWidth(1440);
        table.setPrefHeight(620);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        table.getSelectionModel().selectedIndexProperty().addListener(
                new CodeValidationShowing.RowSelectChangeListener());

        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);


        HBox hBox = new HBox();
        hBox.getChildren().add(table);
        VBox vBox = new VBox();
        vBox.getChildren().addAll(hb,hBox);
        Group group = new Group();
        group.getChildren().addAll(vBox,exit,back);

        Scene scene = new Scene(group, 1400, 775);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();

        // Select the first row
        table.getSelectionModel().select(0);
        Book book = (Book) table.getSelectionModel().getSelectedItem();
        actionStatus.setText(book.toString());

    } // start()

    private class RowSelectChangeListener implements ChangeListener {

        @Override
        public void changed(ObservableValue observableValue, Object o, Object t1) {

        }
    }

    private ObservableList getInitialTableData() throws IOException {

        List list = new ArrayList();


        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        priorityData = multipleLinearRegression.multipleLinearRegressionMethods(priorityData,numberOfBooks);
    //    priorityData = prioritySort.PrioritySortingMLRmethods(priorityData,numberOfBooks);
        
        TrainingSector trainingSector = new TrainingSector();
       priorityDataCV= trainingSector.trainingSectorMethods();
    //    priorityDataCV = prioritySort.PrioritySortingMLRmethods(priorityDataCV,numberOfBooks);
        System.out.println("Testing system of cross validation :");

        int iterator;
        for(iterator=0;iterator<numberOfBooks;iterator++) {
            if (priorityData[iterator].bookData.bookId.substring(13, 14).contains("5") ||
                    priorityData[iterator].bookData.bookId.substring(13, 14).contains("0")) {
            list.add(new Book(priorityData[iterator].bookData.bookName,
                    priorityData[iterator].bookData.writerName,
                    priorityData[iterator].bookData.typeName,
                    priorityData[iterator].bookData.bookId,
                    priorityDataCV[iterator].getMLRweight(),
                    priorityData[iterator].getMLRweight()));

                System.out.println(priorityDataCV[iterator].getMLRweight()+"\t"+priorityData[iterator].getMLRweight());
        }
        }
        ObservableList data = FXCollections.observableList(list);

        return data;
    }

    public Button setStyle( Button button)
    {
        button.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color: \n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");
        return  button;
    }

    public static class Book {




        private SimpleStringProperty bookName;
        private SimpleStringProperty writerName;
        private SimpleStringProperty typeName;
        private SimpleStringProperty bookId;
        private SimpleStringProperty bookWeight;
        private SimpleStringProperty bookWeightCV;


        public Book(SimpleStringProperty bookName,
                    SimpleStringProperty writerName,
                    SimpleStringProperty typeName,
                    SimpleStringProperty bookId,
                    SimpleStringProperty bookWeight,
                    SimpleStringProperty bookWeightCV) {
            this.bookName = bookName;
            this.writerName = writerName;
            this.typeName = typeName;
            this.bookId = bookId;
            this.bookWeight = bookWeight;
            this.bookWeightCV = bookWeightCV;
        }

        public String getBookWeightCV() {
            return bookWeightCV.get();
        }

        public SimpleStringProperty bookWeightCVProperty() {
            return bookWeightCV;
        }

        public void setBookWeightCV(String bookWeightCV) {
            this.bookWeightCV.set(bookWeightCV);
        }



        public String getTypeName() {
            return typeName.get();
        }

        public SimpleStringProperty typeNameProperty() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName.set(typeName);
        }

      


        public String getBookId() {
            return bookId.get();
        }

        public SimpleStringProperty bookIdProperty() {
            return bookId;
        }

        public void setBookId(String bookId) {
            this.bookId.set(bookId);
        }

        public String getBookWeight() {
            return bookWeight.get();
        }

        public SimpleStringProperty bookWeightProperty() {
            return bookWeight;
        }

        public void setBookWeight(String bookWeight) {
            this.bookWeight.set(bookWeight);
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



        public Book(String s1, String s2) {

            bookName = new SimpleStringProperty(s1);
            writerName = new SimpleStringProperty(s2);
        }
    public Book(String s1, String s2, String s3, String s4, double s5, double s6) {

            bookName = new SimpleStringProperty(s1);
            writerName = new SimpleStringProperty(s2);
            typeName = new SimpleStringProperty(s4);
            bookId = new SimpleStringProperty(s3);
            bookWeight = new SimpleStringProperty(Double.toString(s5));
            bookWeightCV = new SimpleStringProperty(Double.toString(s6));

        }


        @Override
        public String toString() {

            return (bookName.get() + ", by " + writerName.get());
        }
    }
}
