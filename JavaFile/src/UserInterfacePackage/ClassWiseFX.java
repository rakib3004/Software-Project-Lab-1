package UserInterfacePackage;

import AHPalgorithm.AHPcalculation;
import AHPalgorithm.AHPprocessImplementation;
import MainPackage.BookNumber;
import MainPackage.Processing;
import MultiVariableRegression.MultipleLinearRegression;
import ObjectOriented.AHPcriteriaWeight;
import ObjectOriented.PriorityData;
import RegressionFx.MultiVaribleRegressionFX;
import TableViewPackage.MLR_TableViewFX;
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

import java.io.IOException;
import java.util.*;

public class ClassWiseFX extends Application {
    PriorityData[] priorityData;
    AHPcriteriaWeight ahPcriteriaWeight;
int iterator;
    int numberOfBooks;
    Processing processing = new Processing();
    BookNumber bookNumber = new BookNumber();
    String labelName="Top Books";
    AHPcalculation ahPcalculation = new AHPcalculation();
    AHPprocessImplementation ahPprocessImplementation = new AHPprocessImplementation();
    MultipleLinearRegression multipleLinearRegression = new MultipleLinearRegression();
    @Override
    public void start(Stage primaryStage){


        try {
            priorityData = processing.fileReaderMethods();
            numberOfBooks = bookNumber.bookNumberFindingMethods();
        } catch (IOException e) {
            e.printStackTrace();
        }

        priorityData = multipleLinearRegression.multipleLinearRegressionMethods(priorityData,numberOfBooks);

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

        MenuItem uponnash = new MenuItem("Uponnash");
        uponnash.setOnAction(new EventHandler<ActionEvent>() {
            @Override
             public void handle(ActionEvent e) {

                    labelName="Top Books of  "+uponnash.getText();


              

             for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0,2).equals("01")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
              //  System.out.println(map);
                showInfo(primaryStage,labelName);

            } });


        MenuItem kobita = new MenuItem("Kobita");

        kobita.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+kobita.getText();

                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("02")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }

                showInfo(primaryStage,labelName);
            }
        });

        MenuItem rochonaboli = new MenuItem("Rochonaboli");
        rochonaboli.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+rochonaboli.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("05")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          }
        });
        MenuItem religion = new MenuItem("Religion");
        religion.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+religion.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("04")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          }
        });


        MenuItem biggan = new MenuItem("Biggan");
        biggan.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+biggan.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("13")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          } });

        MenuItem sciFi = new MenuItem("Sci Fi");
        sciFi.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+sciFi.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("06")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          }
        });

        MenuItem shishuShahitto = new MenuItem("Shishu Shahitto");
        shishuShahitto.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+shishuShahitto.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("11")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          }
        });
        


        MenuItem kisoreUponnash = new MenuItem("Kisore Uponnash");
        kisoreUponnash.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+kisoreUponnash.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("10")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          } });
        MenuItem biography = new MenuItem("Biography");
        biography.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+biography.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("12")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          }
        });

        MenuItem gobesona = new MenuItem("Gobesona");
        gobesona.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+gobesona.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0,2).equals("08")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          }
        });
        MenuItem onubad = new MenuItem("Onubad");

        onubad.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+onubad.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("12")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          }
        });
        MenuItem others = new MenuItem("Others");
        others.setOnAction(new EventHandler<ActionEvent>() {
            @Override  public void handle(ActionEvent e) {

                    labelName="Top Books of  "+others.getText();
                 for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookId.substring(0, 2).equals("07")||
                            priorityData[iterator].bookData.bookId.substring(0, 2).equals("22")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

             for(Map.Entry<Object,Object>entry : map.entrySet()){
                 System.out.println(entry.getKey().toString()+"-"+entry.getValue());
             }
                showInfo(primaryStage,labelName);
          }
        });

        MenuButton bookType = new MenuButton("Choose Your Type");
        bookType.getItems().addAll( uponnash, kobita, rochonaboli, religion,
                biggan, sciFi, shishuShahitto, kisoreUponnash,biography,
                gobesona, onubad,others);


bookType.setTranslateX(500);
bookType.setTranslateY(350);
bookType.setPrefSize(200, 50);


        Image image = new Image("libraryBackground6.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,bookType);

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
        label.setPrefSize(500,105);
        label.setTranslateX(450);
        label.setTranslateY(47);
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


        Image image = new Image("libraryBackground1.jpg");
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