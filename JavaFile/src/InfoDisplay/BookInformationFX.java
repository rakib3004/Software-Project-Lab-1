package InfoDisplay;

import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import JavFX.MenuFX;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import PageRankAlgorithm.PageRankCalculation;
import RankingAlgorithmFx.StatisticsFX;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class BookInformationFX extends Application {

    PriorityData[] priorityData;
    AHPcriteriaWeight ahPcriteriaWeight;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();

    AHPcalculation ahPcalculation = new AHPcalculation();
    AHPprocessImplementation ahPprocessImplementation = new AHPprocessImplementation();
    @Override
    public void start(Stage primaryStage) {

        Button back = new Button("Back");
        Button exit = new Button("Exit");

        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        Font font2 = Font.font("Verdana", FontWeight.BOLD, 8);
        Font font1 = Font.font("Times New Roman", FontPosture.ITALIC, 8);

        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);


        back.setOnAction(actionEvent -> {
            MenuFX menuFX = new MenuFX();

            try {
                menuFX.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
        exit.setOnAction(actionEvent -> {
            System.exit(0);
        });

        setStyle(exit);
        setStyle(back);

        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        try {
            numberOfBooks = bookNumber.bookNumberFindingMethods();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Label SVelo = new Label(numberOfBooks+" Books !!!" );
        SVelo.setFont(font1);
        SVelo.setPrefSize(110, 80);
        SVelo.setTextAlignment(TextAlignment.CENTER);
        SVelo.setTranslateX(250);
        SVelo.setTranslateY(55);
        Paint svColor = Color.rgb(102,111,200);
        SVelo.setBackground(new Background(new BackgroundFill(svColor, CornerRadii.EMPTY, Insets.EMPTY)));
        SVelo.setTextFill(Color.WHITE);
        SVelo.setScaleX(7);
        SVelo.setScaleY(5);



        Label STime = new Label("350 Writers " );
        STime.setPrefSize(110, 80);
        STime.setTextAlignment(TextAlignment.CENTER);
        STime.setFont(font1);
        STime.setTranslateX(1000);
        STime.setTranslateY(55);
        Paint sttColor = Color.rgb(0,96,11);
        SVelo.setBackground(new Background(new BackgroundFill(sttColor, CornerRadii.EMPTY, Insets.EMPTY)));
        Paint stColor = Color.rgb(100,150,50);
        STime.setBackground(new Background(new BackgroundFill(stColor, CornerRadii.EMPTY, Insets.EMPTY)));
        STime.setTextFill(Color.WHITE);
        STime.setScaleX(7);
        STime.setScaleY(5);



        Label SHmax = new Label( " 12 Years " );
        SHmax.setPrefSize(110, 80);
        SHmax.setTextAlignment(TextAlignment.CENTER);
        SHmax.setFont(font1);
        SHmax.setTranslateX(250);
        SHmax.setTranslateY(500);
        Paint shColor = Color.rgb(200,20,30);
        SHmax.setBackground(new Background(new BackgroundFill(shColor, CornerRadii.EMPTY, Insets.EMPTY)));
        SHmax.setTextFill(Color.WHITE);
        SHmax.setScaleX(7);
        SHmax.setScaleY(5);



        Label SR = new Label("6 types");
        SR.setFont(font1);
        SR.setTextAlignment(TextAlignment.CENTER);
        SR.setPrefSize(110, 80);
        SR.setTranslateX(1000);
        SR.setTranslateY(500);
        Paint srColor = Color.rgb(214,158,33);
        SR.setBackground(new Background(new BackgroundFill(srColor, CornerRadii.EMPTY, Insets.EMPTY)));
        SR.setTextFill(Color.WHITE);
        SR.setScaleX(7);
        SR.setScaleY(5);


     /*   Label STmax = new Label("Tmax: 0");
        STmax.setFont(font1);
        STmax.setTranslateX(1000);
        STmax.setTranslateY(270);
        Paint staColor = Color.rgb(120,25,168);
        SVelo.setBackground(new Background(new BackgroundFill(staColor, CornerRadii.EMPTY, Insets.EMPTY)));
        STmax.setTextFill(Color.WHITE);
        STmax.setScaleX(2);
        STmax.setScaleY(2);

       Label SX = new Label("X: 0");
        SX.setFont(font1);
        Paint sxColor = Color.rgb(230,25,180);
        SX.setBackground(new Background(new BackgroundFill(sxColor, CornerRadii.EMPTY, Insets.EMPTY)));
        SX.setTranslateX(1000);
        SX.setTranslateY(320);
        SX.setTextFill(Color.WHITE);
        SX.setScaleX(2);
        SX.setScaleY(2);

        Label SY = new Label("Y: 0");
        SY.setFont(font1);
        Paint syColor = Color.rgb(166,55,67);
        SY.setBackground(new Background(new BackgroundFill(syColor, CornerRadii.EMPTY, Insets.EMPTY)));
        SY.setTranslateX(1000);
        SY.setTranslateY(370);
        SY.setTextFill(Color.WHITE);
        SY.setScaleX(2);
        SY.setScaleY(2);*/


Group semiGroup = new Group();;
semiGroup.getChildren().addAll(SVelo,STime,SHmax,SR/*,STmax,SX,SY*/);


        Image image = new Image("libraryBackground9.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,semiGroup,exit,back);



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
}
