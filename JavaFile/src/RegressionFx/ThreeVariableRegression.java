package RegressionFx;

import Calculation.DoublyLinearRegression;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class ThreeVariableRegression extends Application {

    PriorityData [] priorityData;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    DoublyLinearRegression doublyLinearRegression = new DoublyLinearRegression();

    @Override
    public void start(Stage primaryStage) throws IOException {

        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
doublyLinearRegression.doublyLinearRegressionMethods(priorityData,numberOfBooks);
System.exit(0);
    }
}
