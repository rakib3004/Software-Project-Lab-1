package VisualRepresentation;
import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import BookDataBaseFX.GenericsOfBookFX;
import Calculation.MultipleLinearRegression;
import InfoDisplay.UIDisplayFX;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import Regression.newVersion.TypeCountRegression;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

import java.io.IOException;

public class LineChartFX extends Application {

    PriorityData[] priorityData;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();
    AHPprocessImplementation ahPprocessImplementation = new AHPprocessImplementation();
    AHPcalculation ahPcalculation = new AHPcalculation();
    AHPcriteriaWeight ahPcriteriaWeight;

    @Override
    public void start(Stage primaryStage) {

    }

    public void startTyping(Stage primaryStage) throws IOException {


        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            UIDisplayFX uiDisplayFX = new UIDisplayFX();

            try {
                uiDisplayFX.typeStatistics(primaryStage);
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


        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        priorityData =    multipleLinearRegression.multipleLinearRegressionMethods(priorityData,numberOfBooks);


        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Book No");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Weight");

        LineChart lineChart = new LineChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Library");


        int iterator;

        for(iterator=0;iterator<numberOfBooks;iterator++){
            dataSeries1.getData().add(new XYChart.Data( iterator, priorityData[iterator].getMLRweight()));

        }



        lineChart.getData().add(dataSeries1);
        lineChart.setPrefSize(1200,680);

        VBox vbox = new VBox(lineChart);

vbox.setPrefSize(1400,750);

       Image background = new Image("libraryBackground10.jpg");

        BackgroundImage bi = new BackgroundImage(background,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bg = new Background(bi);
        vbox.setBackground(bg);

        Group group = new Group(vbox,exit,back);

        Scene scene = new Scene(group ,1400, 770);

        primaryStage.setScene(scene);
        primaryStage.setTitle("LineChart Experiments");
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public void startTiming(Stage primaryStage) throws IOException {

        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            UIDisplayFX uiDisplayFX = new UIDisplayFX();

            try {
                uiDisplayFX.timeStatistics(primaryStage);
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



        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        ahPcriteriaWeight =  ahPcalculation.AHPcalculationMethods(priorityData,numberOfBooks);
        priorityData=     ahPprocessImplementation.ahpProcessImplementationMethods(ahPcriteriaWeight,priorityData,numberOfBooks);


        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Book No");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Weight");

        LineChart lineChart = new LineChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Library");


        int iterator;

        for(iterator=0;iterator<numberOfBooks;iterator++){
            dataSeries1.getData().add(new XYChart.Data( iterator, priorityData[iterator].getAHPweight()));

        }


        lineChart.getData().add(dataSeries1);

        VBox vbox = new VBox(lineChart,back,exit);


        Image background = new Image("libraryBackground10.jpg");

        BackgroundImage bi = new BackgroundImage(background,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bg = new Background(bi);
        vbox.setBackground(bg);

        Scene scene = new Scene(vbox, 900, 750);

        primaryStage.setScene(scene);
        primaryStage.setTitle("LineChart Experiments");
        primaryStage.setFullScreen(true);
        primaryStage.show();

    }


    public void startBorrowing(Stage primaryStage) throws IOException {

        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            UIDisplayFX uiDisplayFX = new UIDisplayFX();

            try {
                uiDisplayFX.borrowStatistics(primaryStage);
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


        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        priorityData =    multipleLinearRegression.multipleLinearRegressionMethods(priorityData,numberOfBooks);


        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Book No");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Weight");

        LineChart lineChart = new LineChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Library");


        int iterator;

        for(iterator=0;iterator<numberOfBooks;iterator++){
            dataSeries1.getData().add(new XYChart.Data( iterator, priorityData[iterator].getMLRweight()));

        }



        lineChart.getData().add(dataSeries1);

        VBox vbox = new VBox(lineChart,exit,back);


        Image background = new Image("libraryBackground10.jpg");

        BackgroundImage bi = new BackgroundImage(background,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bg = new Background(bi);
        vbox.setBackground(bg);

        Scene scene = new Scene(vbox, 900, 750);

        primaryStage.setScene(scene);
        primaryStage.setTitle("LineChart Experiments");
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public void startPricing(Stage primaryStage) throws IOException {

        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            UIDisplayFX uiDisplayFX = new UIDisplayFX();

            try {
                uiDisplayFX.priceStatistics(primaryStage);
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


        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        priorityData =    multipleLinearRegression.multipleLinearRegressionMethods(priorityData,numberOfBooks);


        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Book No");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Weight");

        LineChart lineChart = new LineChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Library");


        int iterator;

        for(iterator=0;iterator<numberOfBooks;iterator++){
            dataSeries1.getData().add(new XYChart.Data( iterator, priorityData[iterator].getMLRweight()));

        }



        lineChart.getData().add(dataSeries1);

        VBox vbox = new VBox(lineChart,exit,back);


        Image background = new Image("libraryBackground10.jpg");

        BackgroundImage bi = new BackgroundImage(background,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bg = new Background(bi);
        vbox.setBackground(bg);

        Scene scene = new Scene(vbox, 1400, 800);

        primaryStage.setScene(scene);
        primaryStage.setTitle("LineChart Experiments");
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }


    public Button setStyle(Button button)
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
