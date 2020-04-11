package RegressionFx;

import Calculation.MultipleLinearRegression;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class FourVariableRegression extends Application {
PriorityData [] priorityData;
int numberOfBooks;
Processing processing = new Processing();
BookNumber bookNumber = new BookNumber();
MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();


    @Override
    public void start(Stage primaryStage) throws IOException {

        priorityData = processing.fileReaderMethods();
       numberOfBooks = bookNumber.bookNumberFindingMethods();
       multipleLinearRegression.multipleLinearRegressionMethods(priorityData,numberOfBooks);
System.exit(0);
    }
}
