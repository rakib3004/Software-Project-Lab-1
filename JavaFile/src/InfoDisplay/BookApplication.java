package InfoDisplay;

import Calculation.DoublyLinearRegression;
import JavFX.MenuFX;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import RegressionFx.MultiVaribleRegressionFX;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class BookApplication extends Application {

    PriorityData[] priorityData;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    DoublyLinearRegression doublyLinearRegression = new DoublyLinearRegression();

    @Override
    public void start(Stage primaryStage) {




        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        Font font2 = Font.font("Verdana", FontWeight.BOLD, 8);
        Font font1 = Font.font("Times New Roman", FontPosture.ITALIC, 18);




      //  Button Start = new Button("Start");
        Button back = new Button("Back");
        Button exit = new Button("Exit");


      //  Start.setTranslateX(500);
      //  Start.setTranslateY(400);
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);


       /* Start.setOnAction(actionEvent -> {

            try {

                priorityData = processing.fileReaderMethods();
                numberOfBooks = bookNumber.bookNumberFindingMethods();
                doublyLinearRegression.doublyLinearRegressionMethods(priorityData,numberOfBooks);
                System.exit(0);    }

            catch (Exception exception) {
                exception.printStackTrace();
            }

        });*/
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

    //    setStyle(Start);
        setStyle(exit);
        setStyle(back);

      //  Start.setPrefSize(200, 80);
        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        MenuButton statistics = new MenuButton("Statistics");

        MenuItem pieChart = new MenuItem("Pie Chart");

        MenuItem barChart = new MenuItem("Bar Chart");

        MenuItem lineChart = new MenuItem("Line Chart");


        statistics.getItems().addAll(pieChart,barChart, lineChart);
        statistics.setPrefSize(150,65);
        statistics.setFont(font1);



        MenuButton analysisType = new MenuButton("Analysis Type");
        analysisType.setPrefSize(230,65);
        analysisType.setFont(font1);

        MenuItem typeBased = new MenuItem("Type Based");
        MenuItem timeBased = new MenuItem("Time Based");
        MenuItem borrowBased = new MenuItem("Borrow Based");
        MenuItem priceBased = new MenuItem("Price Based");

        analysisType.getItems().addAll(typeBased,timeBased,borrowBased,priceBased);


        GridPane gridPane = new GridPane();
        gridPane.setMinSize(1000, 700);
        gridPane.setPrefSize(900,600);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        gridPane.setVgap(5);
        gridPane.setHgap(5);

gridPane.add(statistics,42,35);
gridPane.add(analysisType,43,35);
        

        Image image = new Image("libraryBackground19.jpg");
       Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,gridPane);


        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);


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
    public MenuButton setStyle( MenuButton menuButton)
    {
        menuButton.setStyle("-fx-padding: 8 15 15 15;\n" +
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
        return  menuButton;
    }
}
