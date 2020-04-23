package InfoDisplay;

import Calculation.DoublyLinearRegression;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import RegressionFx.MultiVaribleRegressionFX;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BookApplication extends Application {

    PriorityData[] priorityData;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    DoublyLinearRegression doublyLinearRegression = new DoublyLinearRegression();

    @Override
    public void start(Stage primaryStage) {






        Button Start = new Button("Start");
        Button back = new Button("Back");
        Button exit = new Button("Exit");


        Start.setTranslateX(500);
        Start.setTranslateY(400);
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);


        Start.setOnAction(actionEvent -> {

            try {

                priorityData = processing.fileReaderMethods();
                numberOfBooks = bookNumber.bookNumberFindingMethods();
                doublyLinearRegression.doublyLinearRegressionMethods(priorityData,numberOfBooks);
                System.exit(0);    }

            catch (Exception exception) {
                exception.printStackTrace();
            }

        });
        back.setOnAction(actionEvent -> {
            MultiVaribleRegressionFX multiVaribleRegressionFX = new MultiVaribleRegressionFX();
            try {
                multiVaribleRegressionFX.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        exit.setOnAction(actionEvent -> {
            System.exit(0);


        });

        setStyle(Start);
        setStyle(exit);
        setStyle(back);

        Start.setPrefSize(200, 80);
        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        Menu statistics = new Menu("Statistics");

        MenuItem pieChart = new MenuItem("Pie Chart");
 //       FileInputStream it1 = new FileInputStream("src/circle.png");
     //   Image inp1 = new Image(it1);
    //    item1.setGraphic(new ImageView(inp1));
        MenuItem barChart = new MenuItem("Bar Chart");

        MenuItem lineChart = new MenuItem("Line Chart");
   //     FileInputStream it2 = new FileInputStream("src/rectangle.png");
    //    Image inp2 = new Image(it2);
    //    item2.setGraphic(new ImageView(inp2));

        statistics.getItems().addAll(pieChart,barChart, lineChart);
    //    FileInputStream input = new FileInputStream("src/A.png");
     //   Image im = new Image(input);
      //  m1.setGraphic(new ImageView(im));

        Menu analysisType = new Menu("Analysis Type");
        MenuItem typeBased = new MenuItem("Type Based");
        MenuItem timeBased = new MenuItem("Time Based");
        MenuItem borrowBased = new MenuItem("Borrow Based");
        MenuItem priceBased = new MenuItem("Price Based");

        analysisType.getItems().addAll(typeBased,timeBased,borrowBased,priceBased);


Pane pane = new Pane();
        boolean b = pane.getChildren().addAll(statistics, typeBased);


        Image image = new Image("libraryBackground19.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,Start,exit,back);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);
 /*       Pane pane = new Pane();

        BackgroundImage backgroundImage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);
        pane.setBackground(background);*/



        Scene scene1 = new Scene(group,1500,950);


        primaryStage.setScene(scene1);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();

    }
    public Button setStyle( Button button)
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
