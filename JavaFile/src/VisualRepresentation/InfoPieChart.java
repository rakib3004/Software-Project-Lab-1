package VisualRepresentation;

import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class InfoPieChart extends Application  {


    PriorityData[] priorityData;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    @Override
    public void start(Stage primaryStage) {

    }


    public void startTypeBook(Stage primaryStage) {

        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("Golpo", 23);
        PieChart.Data slice2 = new PieChart.Data("Kobita"  , 17);
        PieChart.Data slice3 = new PieChart.Data("Kisore Uponnash" , 36);
        PieChart.Data slice4 = new PieChart.Data("Romantic Uponnash" , 26);
        PieChart.Data slice5 = new PieChart.Data("History" , 14);
        PieChart.Data slice6 = new PieChart.Data("General Knowledge" , 17);
        PieChart.Data slice7 = new PieChart.Data("Science Fiction" , 9);
        PieChart.Data slice8 = new PieChart.Data("Probondho" , 33);
        PieChart.Data slice9 = new PieChart.Data("Rocona Somogro" , 26);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);
        pieChart.getData().add(slice5);
        pieChart.getData().add(slice6);
        pieChart.getData().add(slice7);
        pieChart.getData().add(slice8);
        pieChart.getData().add(slice9);


        pieChart.setTranslateX(55);
        pieChart.setTranslateY(55);
        pieChart.setPrefSize(500,500);

        HBox hBox1 = new HBox(pieChart);


        VBox vBox3 = new VBox();
        vBox3.getChildren().addAll(hBox1);

        vBox3.setMaxSize(850, 650);
        // vBox3.setSpacing(5);


        Image background = new Image("libraryBackground14.jpg");

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

    public void startDemandBook(Stage primaryStage) {

    }

    public void startGenericBook(Stage primaryStage) throws IOException {

        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Types of Book Bar Chart");

        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("Types of Book");

        BarChart barChart = new BarChart(categoryAxis,numberAxis);

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Number of Books");
        String year2008,year2009,year2010,year2011,year2012,year2013,year2014,year2015,year2016,year2017;
        int  year2008Books,year2009Books,year2010Books,year2011Books,year2012Books,
                year2013Books,year2014Books,year2015Books,year2016Books,year2017Books;
year2008Books=0;year2009Books=0;year2010Books=0;year2011Books=0;
year2012Books=0;year2013Books=0;year2014Books=0;year2015Books=0;
year2016Books=0;year2017Books=0;

        int iterator;
        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();

        for(iterator=0;iterator<numberOfBooks;iterator++){
            
        }
        year2008 =  "year2008" ;
        year2009 =  "year2009" ; year2010 =  "year2010" ; year2011 =  "year2011" ;
        year2012=   "year2012" ;year2013 =  "year2013" ; year2014 =  "year2014" ;
        year2015 =  "year2015" ;year2016 =  "year2016" ; year2017 =  "year2017" ;



        series1.getData().add(new XYChart.Data(year2008,year2008Books));
        series1.getData().add(new XYChart.Data(year2009,year2009Books));
        series1.getData().add(new XYChart.Data(year2010,year2010Books));
        series1.getData().add(new XYChart.Data(year2011,year2011Books));
        series1.getData().add(new XYChart.Data(year2012,year2012Books));
        series1.getData().add(new XYChart.Data(year2013,year2013Books));
        series1.getData().add(new XYChart.Data(year2014,year2014Books));
        series1.getData().add(new XYChart.Data(year2015,year2015Books));
        series1.getData().add(new XYChart.Data(year2016,year2016Books));
        series1.getData().add(new XYChart.Data(year2017,year2017Books));

        barChart.getData().add(series1);



        barChart.setTranslateX(65);
        barChart.setTranslateY(55);
        barChart.setPrefSize(500,500);

        HBox hBox1 = new HBox(barChart);


        VBox vBox3 = new VBox();
        vBox3.getChildren().addAll(hBox1);

        vBox3.setMaxSize(850, 650);
        // vBox3.setSpacing(5);


        Image background = new Image("libraryBackground4.jpg");

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

    public void startClassBook(Stage primaryStage) {

    }

    public void startBorrowCount(Stage primaryStage) {

    }



}
