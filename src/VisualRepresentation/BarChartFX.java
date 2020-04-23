package VisualRepresentation;
import JavFX.FxDatabase;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import Regression.newVersion.TypeCountRegression;
import javafx.application.Application;
import javafx.scene.chart.*;
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

public class BarChartFX extends Application {

    PriorityData[] priorityData;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();

    @Override
    public void start(Stage primaryStage) {

    }

    public void startTyping(Stage primaryStage) {




        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Destination");

        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("No. of Train");

        BarChart barChart = new BarChart(categoryAxis,numberAxis);

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Train");

        series1.getData().add(new XYChart.Data("Mohanganj",3));
        series1.getData().add(new XYChart.Data("Deyanganj",5));
        series1.getData().add(new XYChart.Data("Chattragam",7));

        barChart.getData().add(series1);

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Station");

        series2.getData().add(new XYChart.Data("Mohanganj",17));
        series2.getData().add(new XYChart.Data("Deyanganj",23));
        series2.getData().add(new XYChart.Data("Chattragam",38));

        barChart.getData().add(series2);

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Passengers");

        series3.getData().add(new XYChart.Data("Mohanganj",27));
        series3.getData().add(new XYChart.Data("Deyanganj",30));
        series3.getData().add(new XYChart.Data("Chattragam",18));

        barChart.getData().add(series3);


        XYChart.Series series4 = new XYChart.Series();
        series4.setName("Distance");

        series4.getData().add(new XYChart.Data("Mohanganj",37));
        series4.getData().add(new XYChart.Data("Deyanganj",25));
        series4.getData().add(new XYChart.Data("Chattragam",12));

        barChart.getData().add(series4);

        XYChart.Series series5 = new XYChart.Series();
        series5.setName("Distance");

        series5.getData().add(new XYChart.Data("Mohanganj",37));
        series5.getData().add(new XYChart.Data("Deyanganj",25));
        series5.getData().add(new XYChart.Data("Chattragam",12));

        barChart.getData().add(series5);


barChart.setTranslateX(265);
barChart.setTranslateY(355);

        HBox hBox1 = new HBox(barChart);


        VBox vBox3 = new VBox();
        vBox3.getChildren().addAll(hBox1);

        vBox3.setMaxSize(850, 650);
        // vBox3.setSpacing(5);


        Image background = new Image("libraryBackground10.jpg");

        BackgroundImage bi = new BackgroundImage(background,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bg = new Background(bi);
        vBox3.setBackground(bg);
        Scene scene1 = new Scene(vBox3,900,700);



        primaryStage.setScene(scene1);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();


    }

    public void startTiming(Stage primaryStage) {

    }


    public void startBorrowing(Stage primaryStage) {

    }

    public void startPricing(Stage primaryStage) {

    }
}
