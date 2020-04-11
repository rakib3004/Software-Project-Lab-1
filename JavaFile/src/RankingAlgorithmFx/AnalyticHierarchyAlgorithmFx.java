package RankingAlgorithmFx;

import AHPalgorithm.AHPcalculation;
import Calculation.MultipleLinearRegression;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class AnalyticHierarchyAlgorithmFx extends Application {
    PriorityData[] priorityData;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
AHPcalculation ahPcalculation = new AHPcalculation();

    @Override
    public void start(Stage primaryStage) throws IOException {

        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();
        ahPcalculation.AHPcalculationMethods(priorityData,numberOfBooks);

        System.exit(0);
    }
}
