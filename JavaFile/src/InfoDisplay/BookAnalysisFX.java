package InfoDisplay;

import JavFX.FxDatabase;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import Regression.newVersion.TypeCountRegression;
import RegressionFx.MultiVaribleRegressionFX;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import javafx.application.Application;
import javafx.scene.chart.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import RankingAlgorithmFx.StatisticsFX;
import javafx.application.Application;

import javafx.scene.Group;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.io.IOException;

import java.io.IOException;

import static MainPackage.DataParsing.priorityData;

public class BookAnalysisFX extends Application {


    @Override
    public void start(Stage primaryStage) throws IOException {





        Button Start = new Button("Start");
        Button back = new Button("Back");
        Button exit = new Button("Exit");


        Start.setTranslateX(500);
        Start.setTranslateY(400);
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);


        Start.setOnAction(actionEvent -> {

            try {
                Processing processing = null;
                priorityData = processing.fileReaderMethods();
                BookNumber bookNumber = null;
                Object numberOfBooks = bookNumber.bookNumberFindingMethods();
                TypeCountRegression typeCountRegression = null;
                typeCountRegression.typeCountRegressionMethods(priorityData, (Integer) numberOfBooks);

                System.exit(0);            }

            catch (Exception exception) {
                exception.printStackTrace();
            }

        });
        back.setOnAction(actionEvent -> {
            MultiVaribleRegressionFX multiVaribleRegressionFX = new MultiVaribleRegressionFX();
            try {
                multiVaribleRegressionFX.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        exit.setOnAction(actionEvent -> {
            System.exit(0);


        });

        setStyle(Start);
        setStyle(exit);
        setStyle(back);

        Start.setPrefSize(200, 80);
        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);




        TableColumn<FxDatabase,String > column0 = new TableColumn<>("index");
        column0.setMinWidth(150);
        column0.setCellValueFactory(new PropertyValueFactory<>("index"));

        TableColumn<FxDatabase,String > column1 = new TableColumn<>("bookName");
        column1.setMinWidth(150);
        column1.setCellValueFactory(new PropertyValueFactory<>("bookName"));


        TableColumn<FxDatabase,String > column2 = new TableColumn<>("writerName");
        column2.setMinWidth(150);
        column2.setCellValueFactory(new PropertyValueFactory<>("writerName"));

        TableColumn<FxDatabase,String > column3 = new TableColumn<>("bookId");
        column3.setMinWidth(150);
        column3.setCellValueFactory(new PropertyValueFactory<>("bookId"));


        TableColumn<FxDatabase,String > column4 = new TableColumn<>("borrowCount");
        column4.setMinWidth(150);
        column4.setCellValueFactory(new PropertyValueFactory<>("borrowCount"));

        TableColumn<FxDatabase,String > column5 = new TableColumn<>("priceCount");
        column5.setMinWidth(150);
        column5.setCellValueFactory(new PropertyValueFactory<>("priceCount"));


        TableView tableView = new TableView();
        tableView.setItems(getFxDataBase());
        tableView.getColumns().addAll(column0,column1,column2,column3,column4,column5);


     /*   int i;
        String index;

        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();

        for(i=0;i<numberOfBooks;i++){
            index = Integer.toString(i);

            tableView.getItems().add(new FxDatabase( index,priorityData[i].bookData.bookName,
                    priorityData[i].bookData.writerName,priorityData[i].bookData.bookId,
                    priorityData[i].bookData.borrowCount,priorityData[i].bookData.bookPrice));
        }






*/


        Image image = new Image("libraryBackground7.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,Start,exit,back,tableView);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);



        Scene scene1 = new Scene(group,1500,950);


        primaryStage.setScene(scene1);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();


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
    public ObservableList<FxDatabase> getFxDataBase() {

        ObservableList<FxDatabase> fxDatabases = FXCollections.observableArrayList();
        int i;
        String index;
        int numberOfBooks = 0;
        for (i = 0; i < numberOfBooks; i++) {
            index = Integer.toString(i);

            fxDatabases.add(new FxDatabase(index, priorityData[i].bookData.bookName,
                    priorityData[i].bookData.writerName, priorityData[i].bookData.bookId,
                    priorityData[i].bookData.borrowCount, priorityData[i].bookData.bookPrice));
        }
        return fxDatabases;

    }

}