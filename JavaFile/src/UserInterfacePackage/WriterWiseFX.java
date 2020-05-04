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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Map;
import java.util.TreeMap;

public class WriterWiseFX extends Application {
    PriorityData[] priorityData;
    AHPcriteriaWeight ahPcriteriaWeight;
    int iterator;
    int numberOfBooks;
    String labelName="Top Books";
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


    /*
                                Humayon Ahmed
                                Muhammad Jafar Iqbal
                                Rokib Hasan
                                Emdadul Haque Milon
                                Kazi Nazrul Islam
                                Kazi Anwar Hossain
                                Sharat Chandra Chattropadhay
                                Sharatchandra Chottopaddhday
                                Rabindranath Tagore
                                Rabindranath Tagore
                                Sunil gangopadhyay
                                Sunil Gango Paddahay
                                Samaresh majumdar
                                Emdadiya Pustokaloy
                                others
       */


        TreeMap<Object, Object> map = new TreeMap<>();

        MenuItem humayonAhmed = new MenuItem("Humayon Ahmed");
        humayonAhmed.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent e) {


                labelName="Top Books of "+humayonAhmed.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Humayon Ahmed")) {
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
        


        MenuItem muhammadJafarIqbal = new MenuItem("Muhammad Jafar Iqbal");

        muhammadJafarIqbal.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+muhammadJafarIqbal.getText();

                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Muhammad Jafar Iqbal")) {
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

        MenuItem rokibHasan = new MenuItem("Rokib Hasan");
        rokibHasan.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+rokibHasan.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Rokib Hasan")) {
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
        MenuItem emdadulHaqueMilon = new MenuItem("Emdadul Haque Milon");
        emdadulHaqueMilon.setOnAction(new EventHandler<ActionEvent>() {

            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+emdadulHaqueMilon.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Emdadul Haque Milon")) {
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


        MenuItem kaziNazrulIslam = new MenuItem("Kazi Nazrul Islam");
        kaziNazrulIslam.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+kaziNazrulIslam.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Kazi Nazrul Islam")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage,labelName);
            } });

        MenuItem kaziAnwarHossain = new MenuItem("Kazi Anwar Hossain");
        kaziAnwarHossain.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+kaziAnwarHossain.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Kazi Anwar Hossain")) {
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

        MenuItem sharatChandraChattropadhay = new MenuItem("Sharat Chandra Chattropadhay");
        sharatChandraChattropadhay.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+sharatChandraChattropadhay.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Sharat Chandra Chattropadhay")) {
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



        MenuItem rabindranathTagore = new MenuItem("Rabindranath Tagore");
        rabindranathTagore.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+rabindranathTagore.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Rabindranath Tagore")) {
                        //   uponnashTypeNO++;
                        map.put(priorityData[iterator].getMLRweight(),priorityData[iterator].bookData.bookName );

                    }
                }

                for(Map.Entry<Object,Object>entry : map.entrySet()){
                    System.out.println(entry.getKey().toString()+"-"+entry.getValue());
                }
                showInfo(primaryStage,labelName);
            } });


        MenuItem sunilGangoPaddahay = new MenuItem("Sunil Gango Paddahay");
        sunilGangoPaddahay.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+sunilGangoPaddahay.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Sunil Gango Paddahay")) {
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


        MenuItem samareshMajumdar = new MenuItem("Samaresh majumdar");
        samareshMajumdar.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+samareshMajumdar.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Samaresh majumdar")) {
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


        MenuItem emdadiyaPustokaloy = new MenuItem("Emdadiya Pustokaloy");

        emdadiyaPustokaloy.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+emdadiyaPustokaloy.getText();
                for (iterator = 0; iterator < numberOfBooks; iterator++) {

                    if (priorityData[iterator].bookData.bookName.equals("Emdadiya Pustokaloy")) {
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
            @Override public void handle(ActionEvent e) {

                labelName="Top Books of "+others.getText();
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

        MenuButton writerMenu = new MenuButton("Choose Your Type");
        writerMenu.getItems().addAll( humayonAhmed, muhammadJafarIqbal, rokibHasan, emdadulHaqueMilon,
                kaziNazrulIslam, kaziAnwarHossain, sharatChandraChattropadhay, rabindranathTagore, sunilGangoPaddahay,
                samareshMajumdar, emdadiyaPustokaloy,others);


        writerMenu.setTranslateX(500);
        writerMenu.setTranslateY(350);
        writerMenu.setPrefSize(200, 50);


        Image image = new Image("libraryBackground6.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,writerMenu);

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


        Image image = new Image("libraryBackground15.jpg");
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
    public Label setStyle( Label Label)
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