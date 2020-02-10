package IOStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {



    public static void main(String[] args)
    {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage)
    {
// Create the Text Fields
        TextField firstNameFld = new TextField();
        TextField lastNameFld = new TextField();
        TextField College = new TextField();
        TextField University = new TextField();
// Create the Labels
        Label firstNameLbl = new Label("_First Name:");
        Label lastNameLbl = new Label("_Last Name:");
        Label Collegelbl = new Label("_College Name:");
        Label Universitylbl = new Label("_University Name:");
// Bind the Label to the according Field
        firstNameLbl.setLabelFor(firstNameFld);
// Set mnemonic parsing to the Label
        firstNameLbl.setMnemonicParsing(true);
// Bind the Label to the according Field
        lastNameLbl.setLabelFor(lastNameFld);
// Set mnemonic parsing to the Label
        lastNameLbl.setMnemonicParsing(true);
// Bind the Label to the according Field
        Collegelbl.setLabelFor(firstNameFld);
// Set mnemonic parsing to the Label
        Collegelbl.setMnemonicParsing(true);
// Bind the Label to the according Field
        Universitylbl.setLabelFor(lastNameFld);
// Set mnemonic parsing to the Label
        Universitylbl.setMnemonicParsing(true);
// Create the GridPane
        GridPane root = new GridPane();
// Add the Labels and Fields to the GridPane
        root.addRow(0, firstNameLbl, firstNameFld);
        root.addRow(1, lastNameLbl, lastNameFld);
        root.addRow(2, Collegelbl, College);
        root.addRow(3, Universitylbl, University);

// Set the Size of the GridPane
        root.setMinSize(750, 450);
/*
* Set the padding of the GridPane
* Set the border-style of the GridPane
* Set the border-width of the GridPane
* Set the border-insets of the GridPane
* Set the border-radius of the GridPane
* Set the border-color of the GridPane
JavaFX Programming Cookbook 6 / 219
*/
        root.setStyle("-fx-padding: 10;" +

                "-fx-border-style: solid inside;" +
                "-fx-border-width: 215;" +
                "-fx-border-insets: 10;" +
                "-fx-border-radius: 135;" +
                "-fx-border-color: green;");

// Create the Scene
        Scene scene = new Scene(root);
// Add the scene to the Stage
        stage.setScene(scene);
// Set the title of the Stage
        stage.setTitle("A Label Example");
// Display the Stage
        stage.show();
    }
}