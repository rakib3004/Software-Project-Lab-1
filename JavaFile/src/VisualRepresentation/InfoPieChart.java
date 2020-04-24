package VisualRepresentation;

import BookDataBaseFX.*;
import MainPackage.BookNumber;
import MainPackage.Processing;
import ObjectOriented.PriorityData;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
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

        HBox hBox1 = new HBox(pieChart,back,exit);


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

    public void startDemandBook(Stage primaryStage) throws IOException {


        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            DemandsOfBookFX demandsOfBookFX = new DemandsOfBookFX();

            try {
                demandsOfBookFX.start(primaryStage);
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

            if(priorityData[iterator].bookData.bookId.contains("17")){
                year2017Books++;
            }
            else if(priorityData[iterator].bookData.bookId.contains("16")){
                year2016Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("15")){
                year2015Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("14")){
                year2014Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("13")){
                year2013Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0812")){
                year2012Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0212")){
                year2012Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1211")){
                year2011Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0311")){
                year2011Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1210")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0810")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0410")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1009")){
                year2009Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0409")){
                year2009Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1208")){
                year2008Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0608")){
                year2008Books++;
            }
        }



        year2008 =  "year2008" ;
        year2009 =  "year2009" ; year2010 =  "year2010" ; year2011 =  "year2011" ;
        year2012=   "year2012" ;year2013 =  "year2013" ; year2014 =  "year2014" ;
        year2015 =  "year2015" ;year2016 =  "year2016" ; year2017 =  "year2017" ;





        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data(year2008,year2008Books);
        PieChart.Data slice2 = new PieChart.Data(year2009,year2009Books);
        PieChart.Data slice3 = new PieChart.Data(year2010,year2010Books);
        PieChart.Data slice4 = new PieChart.Data(year2011,year2011Books);
        PieChart.Data slice5 = new PieChart.Data(year2012,year2012Books);
        PieChart.Data slice6 = new PieChart.Data(year2013,year2013Books);
        PieChart.Data slice7 = new PieChart.Data(year2014,year2014Books);
        PieChart.Data slice8 = new PieChart.Data(year2015,year2015Books);
        PieChart.Data slice9 = new PieChart.Data(year2016,year2016Books);
        PieChart.Data slice10 = new PieChart.Data(year2017,year2017Books);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);
        pieChart.getData().add(slice5);
        pieChart.getData().add(slice6);
        pieChart.getData().add(slice7);
        pieChart.getData().add(slice8);
        pieChart.getData().add(slice9);
        pieChart.getData().add(slice10);


        pieChart.setTranslateX(55);
        pieChart.setTranslateY(55);
        pieChart.setPrefSize(500,500);

        HBox hBox1 = new HBox(pieChart,back,exit);


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

    public void startGenericBook(Stage primaryStage) throws IOException {


        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            GenericsOfBookFX genericsOfBookFX = new GenericsOfBookFX();
            try {
                genericsOfBookFX.start(primaryStage);
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
            
if(priorityData[iterator].bookData.bookId.contains("17")){
    year2017Books++;
}
else if(priorityData[iterator].bookData.bookId.contains("16")){
    year2016Books++;
}else if(priorityData[iterator].bookData.bookId.contains("15")){
    year2015Books++;
}else if(priorityData[iterator].bookData.bookId.contains("14")){
    year2014Books++;
}else if(priorityData[iterator].bookData.bookId.contains("13")){
    year2013Books++;
}else if(priorityData[iterator].bookData.bookId.contains("0812")){
    year2012Books++;
}else if(priorityData[iterator].bookData.bookId.contains("0212")){
    year2012Books++;
}else if(priorityData[iterator].bookData.bookId.contains("1211")){
    year2011Books++;
}else if(priorityData[iterator].bookData.bookId.contains("0311")){
    year2011Books++;
}else if(priorityData[iterator].bookData.bookId.contains("1210")){
    year2010Books++;
}else if(priorityData[iterator].bookData.bookId.contains("0810")){
    year2010Books++;
}else if(priorityData[iterator].bookData.bookId.contains("0410")){
    year2010Books++;
}else if(priorityData[iterator].bookData.bookId.contains("1009")){
    year2009Books++;
}else if(priorityData[iterator].bookData.bookId.contains("0409")){
    year2009Books++;
}else if(priorityData[iterator].bookData.bookId.contains("1208")){
    year2008Books++;
}else if(priorityData[iterator].bookData.bookId.contains("0608")){
    year2008Books++;
}
        }



        year2008 =  "year2008" ;
        year2009 =  "year2009" ; year2010 =  "year2010" ; year2011 =  "year2011" ;
        year2012=   "year2012" ;year2013 =  "year2013" ; year2014 =  "year2014" ;
        year2015 =  "year2015" ;year2016 =  "year2016" ; year2017 =  "year2017" ;





        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data(year2008,year2008Books);
        PieChart.Data slice2 = new PieChart.Data(year2009,year2009Books);
        PieChart.Data slice3 = new PieChart.Data(year2010,year2010Books);
        PieChart.Data slice4 = new PieChart.Data(year2011,year2011Books);
        PieChart.Data slice5 = new PieChart.Data(year2012,year2012Books);
        PieChart.Data slice6 = new PieChart.Data(year2013,year2013Books);
        PieChart.Data slice7 = new PieChart.Data(year2014,year2014Books);
        PieChart.Data slice8 = new PieChart.Data(year2015,year2015Books);
        PieChart.Data slice9 = new PieChart.Data(year2016,year2016Books);
        PieChart.Data slice10 = new PieChart.Data(year2017,year2017Books);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);
        pieChart.getData().add(slice5);
        pieChart.getData().add(slice6);
        pieChart.getData().add(slice7);
        pieChart.getData().add(slice8);
        pieChart.getData().add(slice9);
        pieChart.getData().add(slice10);


        pieChart.setTranslateX(55);
        pieChart.setTranslateY(55);
        pieChart.setPrefSize(500,500);

        HBox hBox1 = new HBox(pieChart,back,exit);


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

    public void startClassBook(Stage primaryStage) throws IOException {


        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            ClassesOfBookFX classesOfBookFX = new ClassesOfBookFX();
            try {
                classesOfBookFX.start(primaryStage);
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

            if(priorityData[iterator].bookData.bookId.contains("17")){
                year2017Books++;
            }
            else if(priorityData[iterator].bookData.bookId.contains("16")){
                year2016Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("15")){
                year2015Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("14")){
                year2014Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("13")){
                year2013Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0812")){
                year2012Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0212")){
                year2012Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1211")){
                year2011Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0311")){
                year2011Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1210")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0810")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0410")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1009")){
                year2009Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0409")){
                year2009Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1208")){
                year2008Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0608")){
                year2008Books++;
            }
        }



        year2008 =  "year2008" ;
        year2009 =  "year2009" ; year2010 =  "year2010" ; year2011 =  "year2011" ;
        year2012=   "year2012" ;year2013 =  "year2013" ; year2014 =  "year2014" ;
        year2015 =  "year2015" ;year2016 =  "year2016" ; year2017 =  "year2017" ;





        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data(year2008,year2008Books);
        PieChart.Data slice2 = new PieChart.Data(year2009,year2009Books);
        PieChart.Data slice3 = new PieChart.Data(year2010,year2010Books);
        PieChart.Data slice4 = new PieChart.Data(year2011,year2011Books);
        PieChart.Data slice5 = new PieChart.Data(year2012,year2012Books);
        PieChart.Data slice6 = new PieChart.Data(year2013,year2013Books);
        PieChart.Data slice7 = new PieChart.Data(year2014,year2014Books);
        PieChart.Data slice8 = new PieChart.Data(year2015,year2015Books);
        PieChart.Data slice9 = new PieChart.Data(year2016,year2016Books);
        PieChart.Data slice10 = new PieChart.Data(year2017,year2017Books);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);
        pieChart.getData().add(slice5);
        pieChart.getData().add(slice6);
        pieChart.getData().add(slice7);
        pieChart.getData().add(slice8);
        pieChart.getData().add(slice9);
        pieChart.getData().add(slice10);


        pieChart.setTranslateX(55);
        pieChart.setTranslateY(55);
        pieChart.setPrefSize(500,500);

        HBox hBox1 = new HBox(pieChart,back,exit);


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

    public void startBorrowCount(Stage primaryStage) throws IOException {


        Button back = new Button("Back");
        Button exit = new Button("Exit");
        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);
        back.setOnAction(actionEvent -> {
            BorrrowCountOfBookFX borrrowCountOfBookFX = new BorrrowCountOfBookFX();
            try {
                borrrowCountOfBookFX.start(primaryStage);
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

            if(priorityData[iterator].bookData.bookId.contains("17")){
                year2017Books++;
            }
            else if(priorityData[iterator].bookData.bookId.contains("16")){
                year2016Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("15")){
                year2015Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("14")){
                year2014Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("13")){
                year2013Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0812")){
                year2012Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0212")){
                year2012Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1211")){
                year2011Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0311")){
                year2011Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1210")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0810")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0410")){
                year2010Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1009")){
                year2009Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0409")){
                year2009Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("1208")){
                year2008Books++;
            }else if(priorityData[iterator].bookData.bookId.contains("0608")){
                year2008Books++;
            }
        }



        year2008 =  "year2008" ;
        year2009 =  "year2009" ; year2010 =  "year2010" ; year2011 =  "year2011" ;
        year2012=   "year2012" ;year2013 =  "year2013" ; year2014 =  "year2014" ;
        year2015 =  "year2015" ;year2016 =  "year2016" ; year2017 =  "year2017" ;





        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data(year2008,year2008Books);
        PieChart.Data slice2 = new PieChart.Data(year2009,year2009Books);
        PieChart.Data slice3 = new PieChart.Data(year2010,year2010Books);
        PieChart.Data slice4 = new PieChart.Data(year2011,year2011Books);
        PieChart.Data slice5 = new PieChart.Data(year2012,year2012Books);
        PieChart.Data slice6 = new PieChart.Data(year2013,year2013Books);
        PieChart.Data slice7 = new PieChart.Data(year2014,year2014Books);
        PieChart.Data slice8 = new PieChart.Data(year2015,year2015Books);
        PieChart.Data slice9 = new PieChart.Data(year2016,year2016Books);
        PieChart.Data slice10 = new PieChart.Data(year2017,year2017Books);

        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);
        pieChart.getData().add(slice3);
        pieChart.getData().add(slice4);
        pieChart.getData().add(slice5);
        pieChart.getData().add(slice6);
        pieChart.getData().add(slice7);
        pieChart.getData().add(slice8);
        pieChart.getData().add(slice9);
        pieChart.getData().add(slice10);


        pieChart.setTranslateX(55);
        pieChart.setTranslateY(55);
        pieChart.setPrefSize(500,500);

        HBox hBox1 = new HBox(pieChart,back,exit);


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
