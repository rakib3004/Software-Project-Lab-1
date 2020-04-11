package RegressionFx;

import JavFX.FxMainClass;
import JavFX.MenuFX;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MultiVaribleRegressionFX extends Application {


    @Override
    public void start(Stage primaryStage) {

        Button twoVariableRegression = new Button("Two Variable Regression");
        Button threeVariableRegression = new Button("Three Variable Regression");
        Button fourVariableRegression = new Button("Four Variable Regression");


        twoVariableRegression.setTranslateX(500);
        twoVariableRegression.setTranslateY(250);
        threeVariableRegression.setTranslateX(500);
        threeVariableRegression.setTranslateY(350);
        fourVariableRegression.setTranslateX(500);
        fourVariableRegression.setTranslateY(450);


        twoVariableRegression.setOnAction(actionEvent -> {

            TwoVariableRegression twoVariableRegression1 = new TwoVariableRegression();

            try {

                twoVariableRegression1.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });
        threeVariableRegression.setOnAction(actionEvent -> {
ThreeVariableRegression threeVariableRegression1 = new ThreeVariableRegression();
        try {
                threeVariableRegression1.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        });
        fourVariableRegression.setOnAction(actionEvent -> {
FourVariableRegression fourVariableRegression1 = new FourVariableRegression();
        try {
                fourVariableRegression1.start(primaryStage);
            } catch (Exception exception) {
                exception.printStackTrace();
            }


        });

        twoVariableRegression.setStyle("-fx-padding: 8 15 15 15;\n" +
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

        fourVariableRegression.setStyle("-fx-padding: 8 15 15 15;\n" +
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
        threeVariableRegression.setStyle("-fx-padding: 8 15 15 15;\n" +
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

        twoVariableRegression.setPrefSize(500, 80);
        threeVariableRegression.setPrefSize(500, 80);
        fourVariableRegression.setPrefSize(500, 80);


        Image image = new Image("libraryBackground5.jpg");
        Canvas canvas = new Canvas(1500,950);
        Group group = new Group();
        group.getChildren().addAll(canvas,twoVariableRegression,fourVariableRegression,threeVariableRegression);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image,0,0);
      /*  HBox hBox = new HBox();
        hBox.getChildren().addAll(exit,menu,back);

    //    hBox.setSpacing(60);*/



      /*  VBox vBox3 = new VBox();
        vBox3.getChildren().addAll(vBox2,group);

        vBox3.setMaxSize(850, 650);
        vBox3.setSpacing(5);*/

        Scene scene1 = new Scene(group,1500,950);


        primaryStage.setScene(scene1);
        primaryStage.setTitle("Books Statistics");
        primaryStage.setFullScreen(true);
        primaryStage.show();

    }
}
