package TableViewPackage;
import JavFX.FxDatabase;
import JavaSwing.Book;
import MainPackage.BookNumber;
import MainPackage.Processing;
import Methods.Sorting;
import MultiVariableRegression.MultipleLinearRegression;
import ObjectOriented.GenericAlgo;
import ObjectOriented.PriorityData;
import RankingAlgorithmFx.StatisticsFX;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class MLR_TableViewFX extends Application {

    private TableView table;
    private ObservableList data;
    private Text actionStatus;
    PriorityData[] priorityData;
    GenericAlgo [] genericAlgo;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();
    Sorting soring = new Sorting();

    public static void main(String [] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        primaryStage.setTitle("Table View Example 1");



        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setOnAction(actionEvent -> {
            StatisticsFX statisticsFX = new StatisticsFX();

            try {
                statisticsFX.start(primaryStage);
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
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);




        // Books label
        Label label = new Label("Multiple Linear Regression Results");
        label.setTextFill(Color.DARKBLUE);
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


        TableColumn bookId = new TableColumn("Book ID");
        bookId.setCellValueFactory(new PropertyValueFactory("bookId"));

        TableColumn borrowCount = new TableColumn("Borrow Count");
        borrowCount.setCellValueFactory(new PropertyValueFactory("borrowCount"));


        TableColumn price = new TableColumn("Price");
        price.setCellValueFactory(new PropertyValueFactory("price"));

        TableColumn bookWeight = new TableColumn("Book Weight");
        bookWeight.setCellValueFactory(new PropertyValueFactory("bookWeight"));

        table.getColumns().setAll(bookName,writerName,bookId,borrowCount,price, bookWeight);
        table.setPrefWidth(1440);
        table.setPrefHeight(770);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        table.getSelectionModel().selectedIndexProperty().addListener(
                new RowSelectChangeListener());

        // Status message text
        actionStatus = new Text();
        actionStatus.setFill(Color.FIREBRICK);

        // Vbox
        VBox vbox = new VBox(20);
        vbox.setPadding(new Insets(25, 25, 25, 25));;
        vbox.getChildren().addAll(hb, table, actionStatus,back,exit);

        // Scene
        Scene scene = new Scene(vbox, 1400, 775); // w x h
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
        genericAlgo =soring.sortingMLRmethods(priorityData,numberOfBooks);
int iterator;
        for(iterator=0;iterator<numberOfBooks;iterator++){

        list.add(new Book(priorityData[genericAlgo[iterator].getIndex()].bookData.bookName,
                priorityData[genericAlgo[iterator].getIndex()].bookData.writerName,priorityData[genericAlgo[iterator].getIndex()].bookData.bookId,
                priorityData[genericAlgo[iterator].getIndex()].bookData.borrowCount,priorityData[genericAlgo[iterator].getIndex()].bookData.bookPrice,
                Double.toString(priorityData[genericAlgo[iterator].getIndex()].getMLRweight())));
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
}