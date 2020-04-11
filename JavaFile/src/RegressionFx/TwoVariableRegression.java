package RegressionFx;

import Calculation.LinearRegression;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import Regression.newVersion.TypeCountRegression;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;
public class TwoVariableRegression extends Application {

    PriorityData [] priorityData;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
TypeCountRegression typeCountRegression = new TypeCountRegression();
    @Override
    public void start(Stage primaryStage) throws IOException {

        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
typeCountRegression.typeCountRegressionMethods(priorityData,numberOfBooks);
System.exit(0);
    }
}
