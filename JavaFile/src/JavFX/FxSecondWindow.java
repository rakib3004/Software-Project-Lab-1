package JavFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FxSecondWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Label label = new Label("\t\"Recommendation Tool for Library Management\"");

        Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
        Font font1 = Font.font("Verdana", FontWeight.BOLD, 15);

        label.setFont(font);
        label.setStyle("-fx-body-color: white;");
        Label label2 = new Label("\t\t\t\t\t\"All Statistical Analysis For Library Books\"");
        label2.setFont(font1);
        VBox vBox2 = new VBox();
        vBox2.getChildren().addAll(label,label2);


        //   vBox.setMinSize(550, 650);
        vBox2.setSpacing(5);

        vBox2.setStyle("-fx-padding: 5;" +
                "-fx-border-style: inset;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 0;" +
                "-fx-border-color: white;" +
                "-fx-background-color: lime;");
        Button button = new Button("Exit");
        Button button1 = new Button("Menu");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(button,button1);

        hBox.setSpacing(60);

        VBox vBox3 = new VBox();
        vBox3.getChildren().addAll(vBox2,hBox);

        vBox3.setMaxSize(850, 650);
        vBox3.setSpacing(5);

        Scene scene1 = new Scene(vBox3,900,700);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(vBox3);
// Add the scene to the Stage
        primaryStage.setScene(scene1);
// Set the title of the Stage
        primaryStage.setTitle("Books Statistics");
// Display the Stage
        primaryStage.show();

    }
}
