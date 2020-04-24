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

public class InfoBarChart extends Application {


    PriorityData[] priorityData;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    @Override
    public void start(Stage primaryStage) {

    }

     public void startTypeBook(Stage primaryStage) {




         CategoryAxis categoryAxis = new CategoryAxis();
         categoryAxis.setLabel("Types of Book Bar Chart");

         NumberAxis numberAxis = new NumberAxis();
         numberAxis.setLabel("Types of Book");

         BarChart barChart = new BarChart(categoryAxis,numberAxis);

         XYChart.Series series1 = new XYChart.Series();
         series1.setName("Number of Books");

         series1.getData().add(new XYChart.Data("Mohanganj",3));
         series1.getData().add(new XYChart.Data("Deyanganj",5));
         series1.getData().add(new XYChart.Data("Chattragam",7));

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

     public void startDemandBook(Stage primaryStage) {

    }

     public void startGenericBook(Stage primaryStage) {

         CategoryAxis categoryAxis = new CategoryAxis();
         categoryAxis.setLabel("Generics of Book Bar Chart");

         NumberAxis numberAxis = new NumberAxis();
         numberAxis.setLabel("Generics of Book");

         BarChart barChart = new BarChart(categoryAxis,numberAxis);

         XYChart.Series series1 = new XYChart.Series();
         series1.setName("Number of Books");

         series1.getData().add(new XYChart.Data("Mohanganj",3));
         series1.getData().add(new XYChart.Data("Deyanganj",5));
         series1.getData().add(new XYChart.Data("Chattragam",7));

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
