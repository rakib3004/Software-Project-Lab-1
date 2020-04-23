package InfoDisplay;

import JavFX.MenuFX;
import VisualRepresentation.BarChartFX;
import VisualRepresentation.LineChartFX;
import VisualRepresentation.PieChartFX;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class UIDisplayFX extends Application {

BarChartFX barChartFX = new BarChartFX();
LineChartFX lineChartFX = new LineChartFX();
PieChartFX pieChartFX = new PieChartFX();
    @Override
    public void start(Stage primaryStage) {


    }



    public void typeStatistics(Stage typeStatisticsStage) {


        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        Font font2 = Font.font("Verdana", FontWeight.BOLD, 8);
        Font font1 = Font.font("Times New Roman", FontPosture.ITALIC, 18);


        //  Button Start = new Button("Start");
        Button back = new Button("Back");
        Button exit = new Button("Exit");
        Button barChart = new Button("Bar Chart");
        Button lineChart = new Button("Line Chart");
        Button pieChart = new Button("Pie Chart");

        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);

        barChart.setTranslateX(500);
        barChart.setTranslateY(200);
        lineChart.setTranslateX(500);
        lineChart.setTranslateY(300);

        pieChart.setTranslateX(500);
        pieChart.setTranslateY(400);

        back.setOnAction(actionEvent -> {
BookApplication bookApplication = new BookApplication();
            try {
                bookApplication.start(typeStatisticsStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        exit.setOnAction(actionEvent -> {
            System.exit(0);


        });
        barChart.setOnAction(actionEvent -> {
            try {
                lineChartFX.startTyping(typeStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        pieChart.setOnAction(actionEvent -> {
            try {
                pieChartFX.startTyping(typeStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });


        lineChart.setOnAction(actionEvent -> {
            try {
                lineChartFX.startTyping(typeStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });



        //    setStyle(Start);
        setStyle(exit);
        setStyle(back);

        setStyle(lineChart);
        setStyle(barChart);

        setStyle(pieChart);

        //  Start.setPrefSize(200, 80);
        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        lineChart.setPrefSize(200, 80);
        barChart.setPrefSize(200, 80);

        pieChart.setPrefSize(200, 80);





        Image image = new Image("libraryBackground3.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,barChart,lineChart,pieChart);


        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);


        Scene scene1 = new Scene(group,1500,950);


        typeStatisticsStage.setScene(scene1);
        typeStatisticsStage.setTitle("Books Statistics");
        typeStatisticsStage.setFullScreen(true);
        typeStatisticsStage.show();

    }

    public void timeStatistics(Stage timeStatisticsStage) {



        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        Font font2 = Font.font("Verdana", FontWeight.BOLD, 8);
        Font font1 = Font.font("Times New Roman", FontPosture.ITALIC, 18);


        //  Button Start = new Button("Start");
        Button back = new Button("Back");
        Button exit = new Button("Exit");
        Button barChart = new Button("Bar Chart");
        Button lineChart = new Button("Line Chart");
        Button pieChart = new Button("Pie Chart");


        //  Start.setTranslateX(500);
        //  Start.setTranslateY(400);


        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);

        barChart.setTranslateX(500);
        barChart.setTranslateY(200);
        lineChart.setTranslateX(500);
        lineChart.setTranslateY(300);

        pieChart.setTranslateX(500);
        pieChart.setTranslateY(400);


        back.setOnAction(actionEvent -> {
            BookApplication bookApplication = new BookApplication();
            try {
                bookApplication.start(timeStatisticsStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        exit.setOnAction(actionEvent -> {
            System.exit(0);


        });
        barChart.setOnAction(actionEvent -> {
            try {
                lineChartFX.startTiming(timeStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        pieChart.setOnAction(actionEvent -> {
            try {
                pieChartFX.startTiming(timeStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });


        lineChart.setOnAction(actionEvent -> {
            try {
                lineChartFX.startTiming(timeStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });



        //    setStyle(Start);
        setStyle(exit);
        setStyle(back);

        setStyle(lineChart);
        setStyle(barChart);

        setStyle(pieChart);

        //  Start.setPrefSize(200, 80);
        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        lineChart.setPrefSize(200, 80);
        barChart.setPrefSize(200, 80);

        pieChart.setPrefSize(200, 80);



        Image image = new Image("libraryBackground20.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,barChart,lineChart,pieChart);


        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);


        Scene scene1 = new Scene(group,1500,950);


        timeStatisticsStage.setScene(scene1);
        timeStatisticsStage.setTitle("Books Statistics");
        timeStatisticsStage.setFullScreen(true);
        timeStatisticsStage.show();


    }

    public void borrowStatistics(Stage borrowStatisticsStage) {


        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        Font font2 = Font.font("Verdana", FontWeight.BOLD, 8);
        Font font1 = Font.font("Times New Roman", FontPosture.ITALIC, 18);


        //  Button Start = new Button("Start");
        Button back = new Button("Back");
        Button exit = new Button("Exit");
        Button barChart = new Button("Bar Chart");
        Button lineChart = new Button("Line Chart");
        Button pieChart = new Button("Pie Chart");


        //  Start.setTranslateX(500);
        //  Start.setTranslateY(400);


        back.setTranslateX(0);
        back.setTranslateY(650);
        exit.setTranslateX(1100);
        exit.setTranslateY(650);

        barChart.setTranslateX(500);
        barChart.setTranslateY(200);
        lineChart.setTranslateX(500);
        lineChart.setTranslateY(300);

        pieChart.setTranslateX(500);
        pieChart.setTranslateY(400);


        back.setOnAction(actionEvent -> {
            BookApplication bookApplication = new BookApplication();
            try {
                bookApplication.start(borrowStatisticsStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        exit.setOnAction(actionEvent -> {
            System.exit(0);


        });
        barChart.setOnAction(actionEvent -> {
            try {
                lineChartFX.startBorrowing(borrowStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });

        pieChart.setOnAction(actionEvent -> {
            try {
                pieChartFX.startBorrowing(borrowStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });


        lineChart.setOnAction(actionEvent -> {
            try {
                lineChartFX.startBorrowing(borrowStatisticsStage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });



        //    setStyle(Start);
        setStyle(exit);
        setStyle(back);

        setStyle(lineChart);
        setStyle(barChart);

        setStyle(pieChart);

        //  Start.setPrefSize(200, 80);
        back.setPrefSize(200, 80);
        exit.setPrefSize(200, 80);

        lineChart.setPrefSize(200, 80);
        barChart.setPrefSize(200, 80);

        pieChart.setPrefSize(200, 80);





        Image image = new Image("libraryBackground21.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,exit,back,barChart,lineChart,pieChart);


        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);


        Scene scene1 = new Scene(group,1500,950);


        borrowStatisticsStage.setScene(scene1);
        borrowStatisticsStage.setTitle("Books Statistics");
        borrowStatisticsStage.setFullScreen(true);
        borrowStatisticsStage.show();



    }

     public void priceStatistics(Stage priceStatisticsStage) {




         Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
         Font font2 = Font.font("Verdana", FontWeight.BOLD, 8);
         Font font1 = Font.font("Times New Roman", FontPosture.ITALIC, 18);


         //  Button Start = new Button("Start");
         Button back = new Button("Back");
         Button exit = new Button("Exit");
         Button barChart = new Button("Bar Chart");
         Button lineChart = new Button("Line Chart");
         Button pieChart = new Button("Pie Chart");


         //  Start.setTranslateX(500);
         //  Start.setTranslateY(400);


         back.setTranslateX(0);
         back.setTranslateY(650);
         exit.setTranslateX(1100);
         exit.setTranslateY(650);

         barChart.setTranslateX(500);
         barChart.setTranslateY(200);
         lineChart.setTranslateX(500);
         lineChart.setTranslateY(300);

         pieChart.setTranslateX(500);
         pieChart.setTranslateY(400);


         back.setOnAction(actionEvent -> {
             BookApplication bookApplication = new BookApplication();
             try {
                 bookApplication.start(priceStatisticsStage);
             } catch (Exception exception) {
                 exception.printStackTrace();
             }

         });

         exit.setOnAction(actionEvent -> {
             System.exit(0);


         });
         barChart.setOnAction(actionEvent -> {
             try {
                 lineChartFX.startPricing(priceStatisticsStage);

             } catch (Exception exception) {
                 exception.printStackTrace();
             }

         });

         pieChart.setOnAction(actionEvent -> {
             try {
                 pieChartFX.startPricing(priceStatisticsStage);

             } catch (Exception exception) {
                 exception.printStackTrace();
             }

         });


         lineChart.setOnAction(actionEvent -> {
             try {
                 lineChartFX.startPricing(priceStatisticsStage);

             } catch (Exception exception) {
                 exception.printStackTrace();
             }

         });



         //    setStyle(Start);
         setStyle(exit);
         setStyle(back);

         setStyle(lineChart);
         setStyle(barChart);

         setStyle(pieChart);

         //  Start.setPrefSize(200, 80);
         back.setPrefSize(200, 80);
         exit.setPrefSize(200, 80);

         lineChart.setPrefSize(200, 80);
         barChart.setPrefSize(200, 80);

         pieChart.setPrefSize(200, 80);





         Image image = new Image("libraryBackground17.jpg");
         Canvas canvas = new Canvas(1500,950);
         Group group = new Group();
         group.getChildren().addAll(canvas,exit,back,barChart,lineChart,pieChart);


         GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
         graphicsContext.drawImage(image,0,0);


         Scene scene1 = new Scene(group,1500,950);


         priceStatisticsStage.setScene(scene1);
         priceStatisticsStage.setTitle("Books Statistics");
         priceStatisticsStage.setFullScreen(true);
         priceStatisticsStage.show();

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
    public MenuButton setStyle(MenuButton menuButton)
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
