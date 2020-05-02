package UserInterfacePackage;

import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Map;
import java.util.TreeMap;

public class TimeWiseFX extends Application {
    PriorityData[] priorityData;
    AHPcriteriaWeight ahPcriteriaWeight;
int iterator;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();

    AHPcalculation ahPcalculation = new AHPcalculation();
    AHPprocessImplementation ahPprocessImplementation = new AHPprocessImplementation();
    @Override
    public void start(Stage primaryStage){
        Button back = new Button("Back");
        Button exit = new Button("Exit");


        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);



        back.setOnAction(actionEvent -> {
            ChooseType chooseType = new ChooseType();

            try {
                chooseType.start(primaryStage);
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

        TreeMap<Object, Object> map = new TreeMap<>();

        MenuItem year1 = new MenuItem("2008-2010");
        year1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.contains("0618")||
                            priorityData[iterator].bookData.bookId.contains("1208")||
                            priorityData[iterator].bookData.bookId.contains("1009")||
                            priorityData[iterator].bookData.bookId.contains("0410")||
                            priorityData[iterator].bookData.bookId.contains("0810")||
                            priorityData[iterator].bookData.bookId.contains("1210")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                //  System.out.println(map);
                showInfo(primaryStage);

            } });


        MenuItem year2 = new MenuItem("2011-2012");

        year2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.contains("0311")||
                            priorityData[iterator].bookData.bookId.contains("1211")||
                            priorityData[iterator].bookData.bookId.contains("0212")||
                            priorityData[iterator].bookData.bookId.contains("0812")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }

                showInfo(primaryStage);
            }
        });

        MenuItem year3 = new MenuItem("2013-2014");
        year3.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.contains("13")||
                            priorityData[iterator].bookData.bookId.contains("14")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage);
            }
        });
        MenuItem year4 = new MenuItem("2015-2016");
        year4.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.contains("15")||
                            priorityData[iterator].bookData.bookId.contains("16")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage);
            }
        });


        MenuItem year5 = new MenuItem("2017-2018");
        year5.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.contains("17")) {

                        //   uponnashTypeNO++;

                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage);
            } });

        MenuButton yearSection = new MenuButton("Choose Year");
        yearSection.getItems().addAll( year1, year2, year3, year4,
                year5);


        yearSection.setTranslateX(500);
        yearSection.setTranslateY(350);
        yearSection.setPrefSize(200, 50);


        Image image = new Image("libraryBackground6.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,yearSection);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);


        Scene scene1 = new Scene(group,1500,950);


        primaryStage.setScene(scene1);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();

    }


    public void showInfo(Stage secondaryStage){



        Button back = new Button("Back");
        Button exit = new Button("Exit");


        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);



        back.setOnAction(actionEvent -> {
            try {
                this.start(secondaryStage);
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


        Image image = new Image("libraryBackground15.jpg");
        Canvas canvas = new Canvas(1500, 950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit, back);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image, 0, 0);

        Scene scene1 = new Scene(group, 1500, 950);

        secondaryStage.setScene(scene1);
        secondaryStage.setTitle("Books Statistics");
        secondaryStage.setFullScreen(true);
        secondaryStage.show();


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