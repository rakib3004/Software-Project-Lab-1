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


    }

    public void startTiming(Stage primaryStage) {

    }


    public void startBorrowing(Stage primaryStage) {

    }

    public void startPricing(Stage primaryStage) {

    }
}
