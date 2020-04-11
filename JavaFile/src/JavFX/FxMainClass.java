package JavFX;

import javafx.application.Application;

import javafx.scene.Group;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.awt.*;
import java.util.Scanner;

public class FxMainClass extends Application {


    @Override
    public void start(Stage stage) throws Exception {

        Button welcome = new Button("Welcome to RTML");
        welcome.setTranslateX(440);
        welcome.setTranslateY(550);
        welcome.setStyle("-fx-padding: 8 15 15 15;\n" +
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
        welcome.setPrefSize(250, 100);
        Image background = new Image("libraryBackground.jpg");
        Canvas canvas = new Canvas(1300, 700);
        Group root = new Group();
        root.getChildren().addAll(canvas, welcome);

        welcome.setOnAction(actionEvent -> {

            try {
FxSecondWindow fxSecondWindow = new FxSecondWindow();
                fxSecondWindow.start(stage);

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.drawImage(background,0,0);
     //   gc.drawImage(fusics,450,150);
        Scene scene = new Scene(root,1300,700);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//            Processing processing = new Processing();
//            processing.fileReader();
        Application.launch(args);
    }
}