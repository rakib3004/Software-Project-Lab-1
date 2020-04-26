package VisualRepresentation;
import BookDataBaseFX.TypesOfBookFX;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import Regression.newVersion.TypeCountRegression;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
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

public class StackedAreaFX extends Application {

    PriorityData[] priorityData;

    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();


    @Override
    public void start(Stage primaryStage) {

    }

    public void startTyping(Stage primaryStage) throws IOException {
        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            TypesOfBookFX typesOfBookFX = new TypesOfBookFX();
            try {
                typesOfBookFX.start(primaryStage);
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




        int iterator;
        priorityData = processing.fileReaderMethods();
        numberOfBooks = bookNumber.bookNumberFindingMethods();


        String uponnashType,kobitaType,rochonaBoliType,
                religionType,bigganType,sciFicType,shisuSahittoType,kisoreUponnashType,onubadType,othersType;


        int uponnashTypeNO,kobitaTypeNO,rochonaBoliTypeNO,
                religionTypeNO,bigganTypeNO,sciFicTypeNO,shisuSahittoTypeNO,kisoreUponnashTypeNO,onubadTypeNO,othersTypeNO;

        uponnashTypeNO=0;kobitaTypeNO=0;rochonaBoliTypeNO=0;
        religionTypeNO=0;bigganTypeNO=0;sciFicTypeNO=0;
        shisuSahittoTypeNO=0; kisoreUponnashTypeNO=0;
        onubadTypeNO=0;othersTypeNO=0;

        uponnashType="Uponnash";
        kobitaType = "Kobita";
        rochonaBoliType = "Rochhona Boli";
        religionType= "Religion";
        bigganType = "Biggan";
        sciFicType = "Science Fiction";
        shisuSahittoType = "SHishu Sahitto";
        kisoreUponnashType = "Kisore";
        onubadType = "Onubad";
        othersType= "Others";


        int [] typeCounter = new int[6];

        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].bookData.bookId.substring(0,2).equals("01")) {
                uponnashTypeNO++;

            } else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("05")) {
                rochonaBoliTypeNO++;

            } else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("02")) {
                kobitaTypeNO++;

            }else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("13")) {
                bigganTypeNO++;

            }else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("14")) {
                bigganTypeNO++;

            }else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("06")) {
                sciFicTypeNO++;

            } else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("10")) {
                kisoreUponnashTypeNO++;

            }  else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("11")) {
                shisuSahittoTypeNO++;

            }else if (priorityData[iterator].bookData.bookId.substring(0,2).equals("04")) {
                religionTypeNO++;

            }  else {
                othersTypeNO++;

            }
        }



        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Book Types");

        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("Numbers of Book");

        BarChart barChart = new BarChart(categoryAxis,numberAxis);

        XYChart.Series series1 = new XYChart.Series();
        series1.setName(uponnashType);
        XYChart.Series series2 = new XYChart.Series();
        series2.setName(kobitaType);
        XYChart.Series series3 = new XYChart.Series();
        series3.setName(rochonaBoliType);
        XYChart.Series series4 = new XYChart.Series();
        series4.setName(religionType);
        XYChart.Series series5 = new XYChart.Series();
        series5.setName(bigganType);
        XYChart.Series series6 = new XYChart.Series();
        series6.setName(sciFicType);
        XYChart.Series series7 = new XYChart.Series();
        series7.setName(shisuSahittoType);
        XYChart.Series series8 = new XYChart.Series();
        series8.setName(kisoreUponnashType);
        XYChart.Series series9 = new XYChart.Series();
        series9.setName(onubadType);
        XYChart.Series series10 = new XYChart.Series();
        series10.setName(othersType);



        series1.getData().add(new XYChart.Data(uponnashType,uponnashTypeNO));
        series2.getData().add(new XYChart.Data(kobitaType,kobitaTypeNO));
        series3.getData().add(new XYChart.Data(rochonaBoliType,rochonaBoliTypeNO));
        series4.getData().add(new XYChart.Data(religionType,religionTypeNO));
        series5.getData().add(new XYChart.Data(bigganType,bigganTypeNO));
        series6.getData().add(new XYChart.Data(sciFicType,sciFicTypeNO));
        series7.getData().add(new XYChart.Data(shisuSahittoType,shisuSahittoTypeNO));
        series8.getData().add(new XYChart.Data(kisoreUponnashType,kisoreUponnashTypeNO));
        series9.getData().add(new XYChart.Data(onubadType,onubadTypeNO));
        series10.getData().add(new XYChart.Data(othersType,othersTypeNO));

        barChart.getData().add(series1);
        barChart.getData().add(series2);
        barChart.getData().add(series3);
        barChart.getData().add(series4);
        barChart.getData().add(series5);
        barChart.getData().add(series6);
        barChart.getData().add(series7);
        barChart.getData().add(series8);
        barChart.getData().add(series9);
        barChart.getData().add(series10);



        barChart.setTranslateX(65);
        barChart.setTranslateY(55);
        barChart.setPrefSize(1000,700);




        HBox hBox1 = new HBox(barChart,exit,back);


        VBox vbox = new VBox();
        vbox.getChildren().addAll(hBox1);

        vbox.setMaxSize(850, 650);
        // vBox3.setSpacing(5);


        Image background = new Image("libraryBackground4.jpg");

        BackgroundImage bi = new BackgroundImage(background,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background bg = new Background(bi);
        vbox.setBackground(bg);

        vbox.setPrefSize(1400,750);
        Group group = new Group(vbox,exit,back);

        Scene scene = new Scene(group ,1400, 770);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();




    }

    public void startTiming(Stage primaryStage) {

    }


    public void startBorrowing(Stage primaryStage) {

    }

    public void startPricing(Stage primaryStage) {

    }
    public Button setStyle(Button button)
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
