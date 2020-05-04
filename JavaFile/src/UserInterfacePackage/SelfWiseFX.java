package UserInterfacePackage;

import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import PageRankAlgorithm.PageRankCalculation;
import RankingAlgorithmFx.StatisticsFX;
import TableViewPackage.PRA_TableViewFX;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Map;
import java.util.TreeMap;

public class SelfWiseFX extends Application {
    PriorityData[] priorityData;
    AHPcriteriaWeight ahPcriteriaWeight;
int iterator;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    String labelName="Top Books";
    TreeMap<Object, Object> map = new TreeMap<>();
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






        MenuItem self1 = new MenuItem("Book No : 1-100");

        self1.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                for (iterator = 0; iterator < 100; iterator++) {

                        //map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );


                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }

                showInfo(primaryStage,labelName);
            }
        });


        MenuItem self2 = new MenuItem("Book No : 101-200");
        self2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 100; iterator < 200; iterator++) {


                        //   uponnashTypeNO++;
                        //map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage,labelName);
            }
        });


        MenuItem self3 = new MenuItem("Book No : 201-300");
        self3.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 200; iterator < 300; iterator++) {


                        //   uponnashTypeNO++;
                        //map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage,labelName);
            }
        });




        MenuItem self4 = new MenuItem("Book No : 301-400");
        self4.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 300; iterator < 400; iterator++) {

                        //   uponnashTypeNO++;

                        //map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );


                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage,labelName);
            } });



        MenuItem self5 = new MenuItem("Book No : 401-500");
        self5.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 400; iterator < 500; iterator++) {



                        //   uponnashTypeNO++;

                        //map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage,labelName);
            } });



        MenuItem self6 = new MenuItem("Book No : 501-600");
        self6.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 500; iterator < 600; iterator++) {


                        //map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );


                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage,labelName);
            } });


       MenuItem self7 = new MenuItem("Book No : 601-700");
        self7.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                for (iterator = 600; iterator < 632 ; iterator++) {



                        //map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage,labelName);
            } });





        MenuButton selfSection = new MenuButton("Choose Self ");
        selfSection.getItems().addAll(self1, self2, self3,
                self4,self5,self6,self7);


        selfSection.setTranslateX(500);
        selfSection.setTranslateY(350);
        selfSection.setPrefSize(200, 50);


        Image image = new Image("libraryBackground5.jpg");
    Canvas canvas = new Canvas(1500,950);
    Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,selfSection);

    GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);


    Scene scene1 = new Scene(group,1500,950);


        primaryStage.setScene(scene1);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();

}

    public void showInfo(Stage secondaryStage,String labelName){



        Label label = new Label();
        label.setPrefSize(380,95);
        label.setTranslateX(550);
        label.setTranslateY(55);
        label.setText(labelName);
        setStyle(label);


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


        Image image = new Image("libraryBackground16.jpg");
        Canvas canvas = new Canvas(1500, 950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit, back,label);

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
    public Label setStyle(Label Label)
    {
        Label.setStyle("-fx-padding: 8 15 15 15;\n" +
                "    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\n" +
                "    -fx-background-radius: 8;\n" +
                "    -fx-background-color:\n" +
                "        linear-gradient(from 0% 93% to 0% 100%, #8d9092 0%, #717375 100%),\n" +
                "        #8d9092,\n" +
                "        #717375,\n" +
                "        radial-gradient(center 50% 50%, radius 100%, #ffffff, #a1a3a6);\n" +
                "    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\n" +
                "    -fx-font-weight: bold;\n" +
                "    -fx-font-size: 2.1em;");
        return  Label;
    }
}