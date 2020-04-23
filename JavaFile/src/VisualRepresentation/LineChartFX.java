package VisualRepresentation;
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

public class LineChartFX extends Application {

    PriorityData[] priorityData;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    @Override
    public void start(Stage primaryStage) {

    }

    public void startTyping(Stage primaryStage) {

        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Book No");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Weight");

        LineChart lineChart = new LineChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Library");

        dataSeries1.getData().add(new XYChart.Data( 1, 567));
        dataSeries1.getData().add(new XYChart.Data( 5, 612));
        dataSeries1.getData().add(new XYChart.Data(10, 800));
        dataSeries1.getData().add(new XYChart.Data(20, 780));
        dataSeries1.getData().add(new XYChart.Data(40, 810));
        dataSeries1.getData().add(new XYChart.Data(80, 850));

        lineChart.getData().add(dataSeries1);

        VBox vbox = new VBox(lineChart);


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

    public void startTiming(Stage primaryStage) {

    }


    public void startBorrowing(Stage primaryStage) {

    }

    public void startPricing(Stage primaryStage) {

    }
}
